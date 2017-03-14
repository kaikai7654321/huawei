package com.exercise0217;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @title  :  字符串运用-密码截取
 * @rank   :  41
 * @time   :  2017/2/16
 * 1. 使用len就剪枝。
 * 2. 不知道有没有那种动态规划的方法。但是应该也和这种方法差不多。这种方法的复杂度稍微大于n^2
 * 3. 看别人的答案，可以转化为求最大公共字串。就是把字符串倒过来之后和元字符串的最大公共字串
 * 4. 
 */

import java.util.*;
public class CodeCast 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("C:\\Users\\23192\\Desktop\\input.txt");
		Scanner scan = new Scanner(file);
		//Scanner scan = new Scanner(System.in);
		String s;
		int len = 1;
		while(scan.hasNext())
		{
			s = scan.next();
			len = 1;
			for(int i = 0; i < s.length()-1; i++)
			{
				for(int j = i+len; j < s.length(); j++)
				{
					if(conString(s.substring(i, j+1)))
					{
						len = j-i+1;
					}
				}
			}
			System.out.println(len);
		}
	}

	//检测传入的字符串是不是回文
	public static boolean conString(String s)
	{
		
		int len = s.length();
		for(int i = 0; i < len/2; i++)
		{
			if(s.charAt(i)!=s.charAt(len-i-1))
			{
				return false;
			}
		}
		return true;
	}
}
