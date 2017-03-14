package com.exercise0221;




/**
 * @title  :  �ַ�ͳ��
 * @rank   :  62
 * @time   :  2017/2/21
 * 1. ԭ���Լ��õ���map������ţ�������Թ������ǻ�Ϊ�����ԡ���Ϊ���˲���ȫ�Ĳ�����Ӧ�þ���java8.
 * 2. �����ο�ţ�����������һ�ַ������о����ǲ���ġ�����AlphaComulate2
 * 3. ���ַ������ǲ���ġ����Լ��š�
 */

import java.io.*;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
public class AlphaComulate 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("C:\\Users\\23192\\Desktop\\input.txt");
		Scanner scan = new Scanner(file);
		String s;
		Map<Character,Alpha> map;
		while(scan.hasNext())
		{
			map = new HashMap<Character, Alpha>();
			s = scan.next();
			for(int i = 0; i < s.length(); i++)
			{
				Character c = s.charAt(i);
				if(Character.isDigit(c)||Character.isLetter(c)||Character.isSpaceChar(c))
				{
					if(map.containsKey(c))
					{
						Alpha a1 = map.get(c);
						a1.num = a1.num+1;
					}
					else
					{
						Alpha a1 = new Alpha();
						a1.num = 0;
						a1.c = c;
						map.put(c, a1);
					}
					
				}
			}
			
			//��map��������
			List<Map.Entry<Character, Alpha>> compareByValue = (List<Entry<Character, Alpha>>)map
					.entrySet()  
	                .stream()  
	                .sorted(Map.Entry.comparingByValue())  
	                .collect(Collectors.toList()); 
			//Set set = map.keySet();
			//Iterator iter = set.iterator();
			//compareByValue.forEach(System.out::println); 
			for(int i = 0; i < compareByValue.size(); i++)
			{
				Map.Entry<Character, Alpha> entry = compareByValue.get(i);
				System.out.print(entry.getValue().c);
			}
			System.out.println();
		}
		//Scanner scan = new Scanner(System.in);
	}

}

class Alpha implements Comparable
{
	int num ;
	char c;
	@Override
	public int compareTo(Object o) 
	{
		// TODO Auto-generated method stub
		int result = 0;
		Alpha a2 = (Alpha)o;
		if(this.num<a2.num)
			result = 1;
		else if(this.num>a2.num)
			result = -1;
		else if(this.num == a2.num)
		{
			if(this.c < a2.c)
			   result = 1;
			else 
				result = -1;
		}
		return result;
	}
	
}
