package com.exercise0112;
/**
 * @title  字符串加解密
 * @author 23192
 * @rank   10
 * @time   2017/1/12
 * 1. 很简单，不说了。
 *
 */

import java.util.*;

public class ZiFuChuan 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		System.out.println(Encrypt(s1));
		System.out.println(unEncrypt(s2));

	}
	static String Encrypt(String s)
	{
		String result = "";
		for(int i = 0; i < s.length(); i++)
		{
			Character cTemp = s.charAt(i);
			if(Character.isLowerCase(cTemp))
			{
				if(cTemp=='z')
				{
					cTemp = 'a';
				}else 
				{
					cTemp = (char)((int)cTemp+1);
					
				}
				cTemp = Character.toUpperCase(cTemp);
				
			}else if(Character.isUpperCase(cTemp))
			{
				if(cTemp=='Z')
				{
					cTemp = 'A';
				}else 
				{
					cTemp = (char)((int)cTemp+1);
					
				}
				cTemp = Character.toLowerCase(cTemp);
			}
			result = result+cTemp;
		}
		return result;
	}
	static String unEncrypt(String s)
	{
		String result = "";
		for(int i = 0; i < s.length(); i++)
		{
			Character cTemp = s.charAt(i);
			if(Character.isLowerCase(cTemp))
			{
				if(cTemp=='a')
				{
					cTemp = 'z';
				}else 
				{
					cTemp = (char)((int)cTemp-1);
					
				}
				cTemp = Character.toUpperCase(cTemp);
				
			}else if(Character.isUpperCase(cTemp))
			{
				if(cTemp=='A')
				{
					cTemp = 'Z';
				}else 
				{
					cTemp = (char)((int)cTemp-1);
					
				}
				cTemp = Character.toLowerCase(cTemp);
			}
			result = result+cTemp;
		}
		return result;
	}
}
