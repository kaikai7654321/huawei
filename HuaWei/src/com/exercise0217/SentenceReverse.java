package com.exercise0217;
/**
 * @title  :  ¾ä×ÓÄæÐò
 * @rank   :  57
 * @time   :  2017/2/17
 * 
 *
 */

import java.util.*;
public class SentenceReverse 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String s ;
		StringBuilder sb;
		while(scan.hasNext())
		{
			sb = new StringBuilder("");
			s = scan.nextLine();
			String[] sTemp = s.split(" ");
			for(int i = sTemp.length-1; i>0; i--)
			{
				sb.append(sTemp[i]+" ");
			}
			sb.append(sTemp[0]);
			System.out.println(sb.toString());
		}
	}

}
