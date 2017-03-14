package com.exercise0112;
/**
 * @title  :  公共字串计算
 * @rank   :  9
 * @time   :  2017/1/12
 * 1. 测试用例：
 * asdfas werasdfaswer,6
 * adbccadebbca edabccadece,6
 * 2. 注意，之前case1没有过，后来去网上重温了一下lcs算法，发现其实不一定最大的会出现在table表的最后一行或者最后一列。所以
 * 在label1哪里需要多全部table进行遍历。
 * 3. 关于LCS,有两种，就是最长公共子序列和最长公共字串。前者只需要保持位置顺序，后者需要连续。在算法实现上的区别就是，
 *    (i+1,j)和(i,j+1)如果不匹配，前者是等于之前的最大值，后者是0.
 * 4. 如果是最长公共子序列，那么问题2里面按最后一行或者最后一列就是可行的。
 * 5. 之前写过，忘了。不过自己还是又独立想出来了。独立思考还是很重要。
 */


import java.util.Scanner;

public class GongGongZiChuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//输入数据并忽略大小写
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		s1 =s1.toLowerCase();
		
		String s2 = scan.next();
		s2 = s2.toLowerCase();
		//返回公共长度
		System.out.println(getCommonStrLength(s1,s2));
		//返回公共子串
		//System.out.println(compute(s1,s2));
	}
	/** 
	 * 返回公共字串
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static String compute(String s1, String s2){
		String result = "";
		//动态规划表
		int[][] table = new int[1000][1000];
		//动态规划的过程
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
		//找到最长的字串的大小和最后一个坐标。
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
		//从后到前组装公共字串。
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
	 * 返回最大长度。
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
