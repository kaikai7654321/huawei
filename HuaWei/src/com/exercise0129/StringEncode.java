package com.exercise0129;
/**
 * @title   :  �ַ�������
 * @rank    :  25
 * @time    ��   2017/1/30
 * 1. ��ʵ�����Ȱ�һ��������ȥ��Ȼ���ٰ�����ļ��롣�ؼ��������أ�����label1���׽����������⡣
 * 2. ascii��ȷʵ��Ҫ��ס�ˡ�
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
