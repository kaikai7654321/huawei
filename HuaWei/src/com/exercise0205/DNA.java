package com.exercise0205;

/**
 * @title  :  DNA����
 * @rank   :  36
 * @time   :  2017/2/10
 * 1. ��Ŀ�����⡣�������ٳ��ȣ�����ָ���Ǹ����ȡ�
 * 2. ԭ����Ϊ���ٳ���ʱ���о���Ҫ��̬�滮�������ַ����޷�ʹ�ã���Ϊ���ӷ�ĸ���ڱ仯��������ֱ��ʹ���˱��������Ǻ�������
 *    ��Ŀ�����⡣
 */

import java.util.*;
public class DNA
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String s,sTemp,result="";
		double pTemp=0,per=0;
		int leastLen = 0;
		while(scan.hasNext())
		{
			s = scan.next();
			leastLen = scan.nextInt();
			for(int i = 0; i <= s.length()-leastLen; i++)
			{
				//for(int j = i+leastLen; j<=s.length(); j++)
				{
					sTemp = s.substring(i, i+leastLen);
					//System.out.println("����2: "+sTemp);
					pTemp = (double)compute(sTemp)/sTemp.length();
					//System.out.println("���ԣ� "+pTemp+","+sTemp);
					if(pTemp>per)
					{
						result = sTemp;
						per = pTemp;
					}
				}
			}
			System.out.println(result);
		}
		
		
	}
	public static int compute(String s)
	{
		int result = 0;
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)=='G'||s.charAt(i) == 'C')
			{
				result++;
			}
		}
		return result;
	}
}
