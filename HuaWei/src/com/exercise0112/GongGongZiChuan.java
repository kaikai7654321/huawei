package com.exercise0112;
/**
 * @title  :  �����ִ�����
 * @rank   :  9
 * @time   :  2017/1/12
 * 1. ����������
 * asdfas werasdfaswer,6
 * adbccadebbca edabccadece,6
 * 2. ע�⣬֮ǰcase1û�й�������ȥ����������һ��lcs�㷨��������ʵ��һ�����Ļ������table������һ�л������һ�С�����
 * ��label1������Ҫ��ȫ��table���б�����
 * 3. ����LCS,�����֣���������������к�������ִ���ǰ��ֻ��Ҫ����λ��˳�򣬺�����Ҫ���������㷨ʵ���ϵ�������ǣ�
 *    (i+1,j)��(i,j+1)�����ƥ�䣬ǰ���ǵ���֮ǰ�����ֵ��������0.
 * 4. ���������������У���ô����2���水���һ�л������һ�о��ǿ��еġ�
 * 5. ֮ǰд�������ˡ������Լ������ֶ���������ˡ�����˼�����Ǻ���Ҫ��
 */


import java.util.Scanner;

public class GongGongZiChuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�������ݲ����Դ�Сд
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		s1 =s1.toLowerCase();
		
		String s2 = scan.next();
		s2 = s2.toLowerCase();
		//���ع�������
		System.out.println(getCommonStrLength(s1,s2));
		//���ع����Ӵ�
		//System.out.println(compute(s1,s2));
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
			}
		}
		//�Ӻ�ǰ��װ�����ִ���
		while(endi>=0&&endj>=0)
		{
			result=result+s1.charAt(endi);
			endi--;
			endj--;
		}
		String temp = "";
		for(int i = result.length()-1; i>=0; i--)
		{
			temp = temp+result.charAt(i);
		}
		return temp;
	}
	/**
	 * ������󳤶ȡ�
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static int getCommonStrLength(String s1, String s2)
	{
		String result = "";
		int[][] table = new int[1000][1000];
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
		//label1
		for(int i = 1; i <= len1; i++)
		{
			for(int j = 1; j<=len2; j++)
			if(big<table[i][j])
			{
				big = table[i][j];
				
			}
		}
		
		return big;
	}

}
