package com.exercise0217;
/**
 * @title  :  ���������bit��
 * @rank   ��    53
 * @time   :  2017/2/17
 * 1. label2������������������while��Ҳ������һ�඼��������
 */


import java.util.Scanner;
public class LongBit
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n ;
		while(scan.hasNext())
		{
			n = scan.nextInt();
			String s = Integer.toBinaryString(n);
			int amount = 0;
			int amount2 = 0;
			int temp1,temp2;
			for(int i = 0; i < s.length(); i++)
			{
				char c = s.charAt(i);
				if(c=='1')
				{
					amount2 = 0;
					//label2
					while(c =='1')
					{
						amount2++;
						i++;
						if(i>=s.length())
							break;
						c = s.charAt(i);
						
					}
					if(amount2>amount)
						amount = amount2;
					
				}
			}
			System.out.println(amount);
		}
	}

}
