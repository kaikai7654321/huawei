package com.exercise0217;



/**
 * @title  :  201301 JAVA 题目2-3级
 * @rank   :  47
 * @time   :  2017/2/17
 * 1. 一个递推，也可以说是动态规划。找规律即可。
 * 2. Code2013012是用递归，可以作为跌代和递归之间的转换。
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
public class Code201301 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
        int [][] map ;
//		File file = new File("C:\\Users\\23192\\Desktop\\input.txt");
//		Scanner scan = new Scanner(file);
		Scanner scan = new Scanner(System.in);
		int m,n;
		while(scan.hasNext())
		{
			n = scan.nextInt();
			m = scan.nextInt();
			map = new int[n+1][m+1];
			for(int i = 0; i <= m; i++)
			{
				map[0][i] = 1;
				
			}
			for(int j = 0; j <= n; j++)
			{
				map[j][0] = 1;
			}
			
			for(int i = 1; i <= n; i++)
			{
				for(int j = 1; j <= m; j++)
				{
					map[i][j] = map[i-1][j]+map[i][j-1];
				}
			}
			System.out.println(map[n][m]);
		}
	}

}
