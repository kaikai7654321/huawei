package com.exercise0216;
/**
 * @title  :  �ַ���ͨ���
 * @rank   :  42
 * @time   :  2017/2/16
 * 1. ��Ҫ˼·���ϸ���Ҫ�󡣵��ǣ�th*s,this��false,��Ϊ�����true��Ҫ���ǵ�����ͻ�ܶࡣҪȷ����̰�����Ƿ�̰�������߽��
 *    �ǲ�ͬ�ġ���һ�㼴ʹ��������ʽҲ����Ҫ�Լ�ָ���ġ�
 * 2. ţ��������˵û��ѭ�������ǻ�Ϊ����ȷ��
 * 3. GeneralString2�������Լ���������ͨ���д�ġ�
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class GeneralString 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("C:\\Users\\23192\\Desktop\\input.txt");
		Scanner scan = new Scanner(file);
		//Scanner scan = new Scanner(System.in);
		String s,gs;
		while(scan.hasNext())
		{
			gs = scan.next();
			s = scan.next();
			int i = 0,j=0;
			boolean flag = true;
			while(j<s.length()&&i<gs.length())
			{
				char gc = gs.charAt(i);
				char c = s.charAt(j);
				//System.out.println("����:"+gs.charAt(i)+","+s.charAt(j));
				if(gc=='?')
				{
					if(Character.isAlphabetic(c))
					{
						i++;
						j++;
					}
					else 
					{
						System.out.println(false);
						break;
					}
				}else if(gc=='*')
				{
					//System.out.println("����2:"+gs.charAt(i)+","+s.charAt(j));
					if(Character.isLetter(c)||Character.isDigit(c))
					{
						//System.out.println("����3:"+gs.charAt(i)+","+s.charAt(j));
						j++;
						if(j==s.length())
						{
							i++;
						}
					}else
					{
						i++;
					}
				}
				else if(gc==c)
				{
					i++;
					j++;
					
				}else 
				{
					System.out.println(false);
					break;
				}
			}
			//System.out.println("����3��i, "+i+","+gs.length()+",j,"+j+","+s.length());
			if(j==s.length()&&gs.length()==i)
			{
				System.out.println(true);
			}
		}
	}

}
