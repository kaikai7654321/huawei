package com.exercise0112;
/**
 * @title  ɾ���ַ����г��ִ������ٵ��ַ�
 * @author 23192
 * @rank  11
 * @time 2017/1/12
 *
 */

import java.util.*;
public class LeastTimeString 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int[] times = new int[26];
		//�������ݡ�
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		//ͳ��ÿ���ַ���Ƶ��
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			int temp = (int)c-97;
			times[temp]++;
		}
		//��Ҫɾ���ķŵ�����������档
		int smallest = 9999999;
		Set<Character> set = new HashSet<Character>();
		for(int i = 0; i < 26; i++)
		{
			if(times[i]!=0&&times[i]<smallest)
				smallest = times[i];
		}
		for(int i = 0; i < 26; i++)
		{
			if(times[i]==smallest)
			{
				set.add((char)(i+97));
			}
		}
		//�������Ѳ�ɾ���Ŀ�������һ���ַ���
		String result = "";
		for(int i = 0; i < s.length(); i++)
		{
			if(!set.contains(s.charAt(i)))
			{
				result = result+s.charAt(i);
			}
		}
		System.out.println(result);
	}

}
