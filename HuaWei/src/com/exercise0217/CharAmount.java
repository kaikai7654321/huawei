package com.exercise0217;

/**
 * @title  :  �ַ�����ͳ��
 * @rank   :  58
 * @time   :  2017/2/17
 * 1. �Լ���û�ж��Ƿ���127���ڣ����Ǿ��������ˡ�java����Ӧ��û���ֳɵĿ����ж��Ƿ���ascii����ĺ�����
 * 
 *
 */

import java.util.*;
public class CharAmount 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		String s;
		Set<Character> set = new HashSet<Character>();
		while(scan.hasNext())
		{
			s = scan.nextLine();
			for(int i = 0; i < s.length(); i++)
			{
				set.add(s.charAt(i));
			}
			System.out.println(set.size());
		}
	}

}
