package com.exercise0217;

/**
 * @title  :  �ַ�����ת
 * @rank   :  55
 * @time   :  2017/2/17
 * 1. StringReverse2�ǿ���Ϊ����ģ����Թ��ġ�
 * 2. �Լ�����ţ��������Թ��������ٻ�Ϊ�����á���Ϊlabel1,ʹ��next�ǲ��еģ���Ϊ�пո�
 */

import java.util.*;
public class StringReverse 
{
	public static void main(String[] args) 
	{
		String s;
		Scanner scan = new Scanner (System.in);
		while(scan.hasNext())
		{
			//label1
			s = scan.nextLine();
			for(int i = s.length()-1; i >= 0; i--)
			{
				System.out.print(s.charAt(i));
			}
			System.out.println();
		}
	}

}
