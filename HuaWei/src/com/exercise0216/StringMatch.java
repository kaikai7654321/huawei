package com.exercise0216;
/**
 * @title  :  �ַ���ƥ��
 * @rank   :  43
 * @time   :  2017/2/16
 * 1. ������Ŀ�и����⣬���Ƕ��ַ������ַ�ָ�����������ǲ�������Ŀǰ����Ӧ���ǲ�������
 * 2. ���ò���������Ҫ��������ô�����ظ����ֵġ���������list��remove��ʹ���ظ���Ҳֻ��ɾ������֮һ�����Ծ�����list��
 * 3. ��ţ������ֻͨ����2�ɣ���������Stringmatch����ģ����Կ�����ֻҪ�̵������еĳ��������м��ɡ�
 *    ���ں����ּ��Ρ�����ʹ��StringMatch2����ġ�
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class StringMatch 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		File file = new File("C:\\Users\\23192\\Desktop\\input.txt");
		Scanner scan = new Scanner(file);
		
		//Scanner scan = new Scanner(System.in);
		String s1,s2;
	
		ArrayList<Character> list2;
		while(scan.hasNext())
		{
			s1 = scan.next();
			s2 = scan.next();
			list2 = new ArrayList<Character> ();
			for(int i = 0; i < s2.length(); i++)
			{
				list2.add(s2.charAt(i));
			}
			
			int j = 0;
			while(j<s1.length())
			{
				Character c = s1.charAt(j);
				
				if(list2.contains(c))
				{
					list2.remove(new Character(c));
					j++;
					
				}else 
				{
					System.out.println(false);
					break;
				}
			}
			if(j==s1.length())
			{
				System.out.println(true);
			}
			
		}
	}

}
