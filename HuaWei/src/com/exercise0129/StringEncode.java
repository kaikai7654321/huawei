package com.exercise0129;
/**
 * @title   :  字符串加密
 * @rank    :  25
 * @time    ：   2017/1/30
 * 1. 其实就是先把一个数组变回去，然后再把其余的加入。关键在于判重，后来label1轻易解决了这个问题。
 * 2. ascii码确实需要记住了。
 */


import java.util.ArrayList;
import java.util.Scanner;
public class StringEncode
{
	public static void main(String[] args) 
	{
		
		ArrayList<Character> list ;
		String code1,code2;
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			list = new ArrayList<Character>();
			code1 = scan.next();
			code2 = scan.next();
			code1 = code1.toLowerCase();
			for(int i = 0; i < code1.length(); i++)
			{
				Character cTemp = code1.charAt(i);
				//if(list.contains(cTemp))
				if(!list.contains(cTemp))
				list.add(code1.charAt(i));
				
				
			}
			//label1
			for(int i = 0; i < 26; i++)
			{
				Character temp = (char)(97+i);
				if(!list.contains(temp))
				{
					list.add(temp);
				}
			}
			
			StringBuilder result = new StringBuilder("");
			for(int i =0; i< code2.length(); i++)
			{
				Character temp = code2.charAt(i);
				Character temp2 = temp;
				int tempNum = (int)temp;
				if(tempNum>=65&&tempNum<=90)
				{
					temp2 = Character.toUpperCase(list.get(tempNum+32-97));
				}else if(tempNum>=97&&tempNum<=122)
				{
					temp2 = list.get(tempNum-97);
				}
				result .append(temp2);
			}
			System.out.println(result);
		}
	}

}
