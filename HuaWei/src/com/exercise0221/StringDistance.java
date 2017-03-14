package com.exercise0221;
/**
 * @title  :  计算字符串的距离
 * @rank   :  68
 * @time   :  2017/2/21
 * 1. 1)寻找AB最大公共子串 

2)将A/B最大公共字串剔除 剩下的序列对接以后 继续寻找最大公共子串 直到最大公共子串为0

3)剩下的AB中较长的字符串长度就是编辑距离
 * 4. 原来自己一直用lcs，然后用最长的减去，后来看到上面这句话，发现自己是忽略了中间的一些情况的。
 * 5. 必须用动态规划直接算，即使SD2里面的思路。然后自己写成了SD3.SD3里面有许多需要注意的地方。
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class StringDistance 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("C:\\Users\\23192\\Desktop\\input.txt");
		Scanner scan = new Scanner(file);
		String s1, s2;
		//Scanner scan = new Scanner (System.in);
		int [][]matrix;
		while(scan.hasNext())
		{
			
			s1 = scan.next();
			s2 = scan.next();
			int max = 0;
			if(s1.length()>max) max = s1.length();
			if(s2.length()>max) max = s2.length();
			int result = 0;
			matrix = new int[s1.length()+1][s2.length()+1];
			for(int i = 1; i <= s1.length(); i++)
			{
				char c = s1.charAt(i-1);
				for(int j = 1; j <= s2.length(); j++)
				{
					char c2 = s2.charAt(j-1);
					if(c==c2)
					{
						matrix[i][j] = matrix[i-1][j-1] +1;
						if(matrix[i][j]>result)
							result = matrix[i][j];
					}
					else 
					{
						matrix[i][j] = matrix[i][j-1];
						if(matrix[i-1][j]>matrix[i][j-1])
							matrix[i][j] = matrix[i-1][j];
					}
				}
			}
			System.out.println(max-result);
		}
	}

}
