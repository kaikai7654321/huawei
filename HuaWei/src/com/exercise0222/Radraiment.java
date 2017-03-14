package com.exercise0222;



/**
 * @title  :  RedraimentµÄ×ß·¨
 * @rank   :  64
 * @time   :  2017/2/22
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Radraiment 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		
		File file = new File("C:\\Users\\23192\\Desktop\\input.txt");
		Scanner scan = new Scanner(file);
		//Scanner scan = new Scanner(System.in);
		int n;
		List<Integer> list ;
		int []high;
		int big = 0;
		
		while(scan.hasNext())
		{
			big = 0;
			n = scan.nextInt();
			high = new int[n];
			list = new ArrayList<Integer> ();
			
			for(int i = 0; i < n; i++)
			{
				list.add(scan.nextInt());
				high[i] = 1;
			}
			
			//high[0] = 1;
			for(int i = 1; i < n; i++)
			{
				int a = list.get(i);
				for(int j = 0; j < i; j++)
				{
					int b = list.get(j);
					if(a > b)
					{
						int temp = high[j] + 1;
						if(high[i] < temp)
							high[i] = temp;
					}
					
				}
				if(big < high[i])
				{
					big = high[i];
				}
			}
			
//			for(int i = 0; i < n; i++)
//			{
//				System.out.print(high[i]+" ");
//			}
//			
//			System.out.println();
			System.out.println(big);
		}
	}

}
