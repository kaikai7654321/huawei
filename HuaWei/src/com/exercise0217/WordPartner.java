package com.exercise0217;



/**
 * @title  :  �����ֵܵ���
 * @rank   :  48
 * @time   :  2017/2/17
 * 1. ��Ҫ��Ҫ���Ҳ�����������Ǹ������ӻ���д������һ������ʵ���������ַ������ǲ���ġ�Ҳ������map��
 * 2. Ŀǰ�ǲ�����ţ���ϣ�ֻ���ڻ�Ϊ�ϡ�ţ����ֻ��ͨ��40%��˵������Խ�硣��֪��Ϊ�
 * 3. label2���룬��Ϊ�Աȵ�ʱ������w�������ıȡ��Լ�ԭ��û�������������˺þá�
 */

import java.util.*;


public class WordPartner
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n;
		String w;
		int rank;
		List<String> list ,list1;
		List<String> list2 ;
		while (scan.hasNext())
		{
			list = new ArrayList<String> ();
			list1 = new ArrayList<String> ();
			list2 = new ArrayList<String> ();
			n = scan.nextInt();
			for(int i = 0; i < n; i++)
			{
				w = scan.next();
				list.add(w);
				list1.add(sortString(w));
				//System.out.println(sortString(w));
			}
			w = scan.next();
			//label2
			String w2 = sortString(w);
			rank = scan.nextInt();
			for(int i = 0; i < list1.size(); i++)
			{
				//System.out.println("����2�� "+list1.get(i)+","+w+","+list.get(i));
				if(list1.get(i).equals(w2)&&!(list.get(i).equals(w)))
				{
					list2.add(list.get(i));
					//System.out.println("���ԣ� "+list.get(i));
				}
			}
			Collections.sort(list2);
			System.out.println(list2.size());
			System.out.println(list2.get(rank-1));
		}
	}

	public static String sortString (String s)
	{
		StringBuilder sb = new StringBuilder();
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i = 0;i < s.length(); i++)
		{
			list.add(s.charAt(i));
		}
		Collections.sort(list);
		for(int i = 0; i<list.size(); i++)
		{
			sb.append(list.get(i));
		}
		return sb.toString();
	}
}
