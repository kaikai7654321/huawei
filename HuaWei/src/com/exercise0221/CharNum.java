package com.exercise0221;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @title  :  ¼ÆËã×Ö·û¸öÊý
 * @rank   :  64
 * @time   :  2017/2/21
 *
 */

import java.util.*;
public class CharNum 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("C:\\Users\\23192\\Desktop\\input.txt");
		Scanner scan = new Scanner(file);
		//Scanner scan = new Scanner(System.in);
		String s;
		char c;
		while(scan.hasNextLine())
		{
			s = scan.nextLine();
			c = scan.nextLine().charAt(0);
			
			int result = 0;
			for(int i = 0; i < s.length(); i++)
			{
				if(c==s.charAt(i))
				{
					result++;
				}
			}
			System.out.println(result);
			
		}
	}

}
