package com.exercise0112;
/**
 * @title  ������֤�ϸ����
 * @author 23192
 * @rank   12
 * @time   2017/1/12
 *
 *1. �ڶ���������Ҫ��Character��Ӧ�á�
 *2. ������ԭ������ͦ���ӡ�����ֻ��Ҫȥ���ٵ������Ƚϼ��ɡ�˲��ͼ򵥡� 
 */

import java.util.*;
public class PasswordCheck 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			
			String s = scan.next();
			if(s.length()<=8)
			{
				System.out.println("NG");
				continue;
			}
			int[] t = new int[4];
			for(int i = 0; i < s.length(); i++)
			{
				char cTemp  = s.charAt(i);
				if(t[0]==0&&Character.isDigit(cTemp))
				{
					t[0] = 1;
				}
				if(t[1]==0&&Character.isUpperCase(cTemp))
				{
					t[1] = 1;
				}
				if(t[2]==0&&Character.isLowerCase(cTemp))
				{
					t[2] = 1;
				}
				if(t[3]==0&&!Character.isLetter(cTemp)&&!Character.isDigit(cTemp))
				{
					t[3] = 1;
				}
			}
			int amount = 0;
			for(int i = 0; i < 4; i++)
			{
				amount += t[i];
			}
			if(amount<3)
			{
				System.out.println("NG");
				continue;
			}
			boolean flag = true;
			//��֤����������
			for(int i = 0; flag&&i<s.length()-3; i++)
			{
				String sub1 = s.substring(i, i+3);
				for(int j = i+1; flag&&j<s.length()-2; j++)
				{
					String sub2 = s.substring(j,j+3);
					if(sub1.equals(sub2))
					{
						flag = false;
						break;
					}
				}
			}
			if(flag==false)
			{
				System.out.println("NG");
				continue;
			}
			
			System.out.println("OK");
		}

	}

}
