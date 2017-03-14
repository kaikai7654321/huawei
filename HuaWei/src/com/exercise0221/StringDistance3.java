package com.exercise0221;

/**
 * 1. label1是和LCS不同之处，因为LCS不用加1.要理解加1的含义。就是肯定在同一方向移动需要动作加一。
 * 2. 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class StringDistance3
{
	public static void main(String[] args) throws FileNotFoundException 
	{

		String s1, s2;
		Scanner scan = new Scanner (System.in);
		int [][]matrix;
		while(scan.hasNext())
		{
			
			s1 = scan.next();
			s2 = scan.next();

			int result = 0;
			matrix = new int[s1.length()+1][s2.length()+1];
			for(int i = 0; i <= s1.length(); i++)
			{
				matrix[i][0] = i;
			}
			for(int i = 0; i <= s2.length(); i++)
			{
				matrix[0][i] = i;
			}
			for(int i = 1; i <= s1.length(); i++)
			{
				char c = s1.charAt(i-1);
				for(int j = 1; j <= s2.length(); j++)
				{
					char c2 = s2.charAt(j-1);
					//label1
					matrix[i][j] = matrix[i][j-1]+1;
					if(matrix[i][j]>matrix[i-1][j]+1)
						matrix[i][j]=matrix[i-1][j]+1;
					
					if(c!=c2)
					{
						
						if(matrix[i][j]>matrix[i-1][j-1] + 1)
							matrix[i][j] = matrix[i-1][j-1] + 1;
							
					}
					else 
					{

						if(matrix[i][j]>matrix[i-1][j-1] )
							matrix[i][j] = matrix[i-1][j-1] ;
					}
					
				}
			}
			System.out.println(matrix[s1.length()][s2.length()]);
		}
	}

}
