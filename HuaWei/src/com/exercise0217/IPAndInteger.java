package com.exercise0217;
/**
 * @title  :  ������IP��ַ���ת��
 * @rank   :  56
 * @time   :  57
 * 1. ţ���ϻ���ֻͨ����10%������˵������Խ�硣���ǲ����ס���Ϊ�������ͨ����
 * 2. label2Ҫע�⣬��ǰ�����ǴӺ���ǰ��Ҫ�����ס�
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class IPAndInteger 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("C:\\Users\\23192\\Desktop\\input.txt");
		Scanner scan = new Scanner(file);
		//Scanner scan = new Scanner(System.in);
		int n,rn;
		String s,rs;
		while(scan.hasNext())
		{
			s = scan.next();
			n = scan.nextInt();
			rn = 0;
			//rs = 0;
			String[] temp = s.split("\\.");
			StringBuilder sb = new StringBuilder("");
			for(int i = 0; i < temp.length; i++)
			{
				String temp1 = Integer.toBinaryString(Integer.parseInt(temp[i]));
				while(temp1.length()<8)
					temp1 = 0+temp1;
				sb.append(temp1);
				
			}
			
			s = sb.toString();
			
			//System.out.println("����1�� "+s);
			int temp2 = s.length();
			for(int i = s.length()-1; i >= 0; i--)
			{
				if(s.charAt(i)=='1')
				rn += Math.pow(2, temp2-1-i);
				
			}
			sb = new StringBuilder("");
			String sTemp="";
			while(n!=0)
			{
				int temp3 = n%2;
				sTemp = temp3+sTemp;
				n = n/2;
				
			}
			while(sTemp.length()<32)
				sTemp = 0+sTemp;
			//System.out.println("����2�� "+sTemp);
			int temp5;
			int[] temp6 = new int[4];
			int t = 0;
			int lenTemp = sTemp.length();
			//label2
			for(int i = lenTemp-1; i >= 0; i--)
			{
				
					if(sTemp.charAt(i)=='1')
					temp6[i/8] += Math.pow(2, 7-i%8);
				
			}
			rs = temp6[0]+"."+temp6[1]+"."+temp6[2]+"."+temp6[3];
			
			System.out.println(rn);
			System.out.println(rs);
		}
	}

}
