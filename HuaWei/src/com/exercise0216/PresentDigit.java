/**
 * @title  :  ��ʾ����
 * @rank   :  45
 * @time   :  2017/2/16
 * 
 * 1. ���Ⱦ�����ʲô�����⡣ͻȻ����String����ɾ��û�кܺõķ�����������롣��θо���StringBuilder��һ�㡣
 * 2. label1������Ҫ�����i���жϣ���Ȼ���׳�����ġ�
 */

package com.exercise0216;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class PresentDigit 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("C:\\Users\\23192\\Desktop\\input.txt");
		Scanner scan = new Scanner(file);
		//Scanner scan = new Scanner(System.in);
		String s;
		StringBuilder sb;
		while(scan.hasNext())
		{
			s = scan.next();
			sb = new StringBuilder(s);
			for(int i = 0; i < sb.length(); i++)
			{
				char c = sb.charAt(i);
				if(Character.isDigit(c))
				{
					sb.replace(i, i+1, "*"+c);
					i++;
					//label1
					while(i<sb.length()&&Character.isDigit(sb.charAt(i)))
					{
						i++;
					}
					sb.replace(i-1, i, sb.charAt(i-1)+"*");
				}
			}
			System.out.println(sb.toString());
		}
	}

}
