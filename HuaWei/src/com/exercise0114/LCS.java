package com.exercise0114;
/**
 * @title   
 */
import java.util.Scanner;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�������ݲ����Դ�Сд
		
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
		String s1 = scan.next();
		
		
		String s2 = scan.next();
		
		
		//���ع����Ӵ�
		System.out.println(compute(s1,s2));
		}
	}
	/** 
	 * ���ع����ִ�
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static String compute(String s1, String s2){
		String result = "";
		//��̬�滮��
		int[][] table = new int[1000][1000];
		//��̬�滮�Ĺ���
		for(int i = 1; i<=s1.length(); i++)
		{
			for(int j = 1; j<=s2.length(); j++)
			{
				if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					table[i][j] = table[i-1][j-1]+1;
				}
			}
		}
		int big = 0;
		int len1 = s1.length();
		int len2 = s2.length();
		int endi = 0;
		int endj = 0;
		//�ҵ�����ִ��Ĵ�С�����һ�����ꡣ
		for(int i = 1; i <= len1; i++)
		{
			for(int j = 1; j<=len2; j++)
			{
			if(big<table[i][j])
			{
				big = table[i][j];
				endi = i-1;
				endj = j-1;
			}
			if(big==table[i][j])
			{
//				int a = small(endi,endj);
//				int b = small(i-1,j-1);
				if(len1<len2)
				{
					if(endi>i-1)
					{
						endi = i-1;
						endj = j-1;
					}
				}else 
				{
					if(endj>j-1)
					{
						endi = i-1;
						endj = j-1;
					}
				}
				
			}
			}
		}
		//�Ӻ�ǰ��װ�����ִ���
	  
		while(big-->0)
		{
			result=result+s1.charAt(endi);
			endi--;
			
		}
	   
		String temp = "";
		for(int i = result.length()-1; i>=0; i--)
		{
			temp = temp+result.charAt(i);
		}
		return temp;
	}
	
	public static int small(int a,int b)
	{
		if(a>b)
			a = b;
		return a;
	}
	
}
