package com.exercise0217;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @title  :  �ַ�������-�����ȡ
 * @rank   :  41
 * @time   :  2017/2/16
 * 1. ʹ��len�ͼ�֦��
 * 2. ��֪����û�����ֶ�̬�滮�ķ���������Ӧ��Ҳ�����ַ�����ࡣ���ַ����ĸ��Ӷ���΢����n^2
 * 3. �����˵Ĵ𰸣�����ת��Ϊ����󹫹��ִ������ǰ��ַ���������֮���Ԫ�ַ�������󹫹��ִ�
 * 4. 
 */

import java.util.*;
public class CodeCast 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("C:\\Users\\23192\\Desktop\\input.txt");
		Scanner scan = new Scanner(file);
		//Scanner scan = new Scanner(System.in);
		String s;
		int len = 1;
		while(scan.hasNext())
		{
			s = scan.next();
			len = 1;
			for(int i = 0; i < s.length()-1; i++)
			{
				for(int j = i+len; j < s.length(); j++)
				{
					if(conString(s.substring(i, j+1)))
					{
						len = j-i+1;
					}
				}
			}
			System.out.println(len);
		}
	}

	//��⴫����ַ����ǲ��ǻ���
	public static boolean conString(String s)
	{
		
		int len = s.length();
		for(int i = 0; i < len/2; i++)
		{
			if(s.charAt(i)!=s.charAt(len-i-1))
			{
				return false;
			}
		}
		return true;
	}
}
