package com.exercise0129;
/**
 * @title  �ַ�������
 * @rank   18
 * @time   2017/1/13
 * 1. ԭ������String��Character����Ӧ���к���ֱ�Ӻ��Դ�Сд�ġ�����û�С�
 * 2. ԭ�����ÿ���ֱ����sort�����ú���ʽ���ʽ�����ڲ��൫�Ǻ��ź����ˡ�
 */
import java.util.*;

import javax.xml.stream.events.Characters;
public class StringSort 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		ArrayList<Letter> list1 = new ArrayList<Letter>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		StringBuilder s1 = new StringBuilder("");
		
		for(int i = 0; i < s.length(); i++)
		{
			if(Character.isLetter(s.charAt(i)))
			{
		        Letter temp = new Letter ();
		        temp.c  = s.charAt(i);
			    list1.add(temp);
			
			}else
			{
				list2.add(i);
			}
		}
		Collections.sort(list1);
		for(int i = 0; i < list2.size(); i++)
		{
			Letter temp = new Letter();
			int index = list2.get(i);
			temp.c  = s.charAt(index);
			list1.add(index, temp);
		}
		for(int i = 0; i < list1.size(); i++)
		{
			s1.append((list1.get(i)).c);
		}
		System.out.println(s1);
	}

}
//
class Letter implements Comparable
{
	int index;
	Character c;
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int a = (int)Character.toUpperCase(this.c);
		int b = (int)Character.toUpperCase(((Letter)o).c);
		int result = 0;
		if(a>b)
			result = 1;
		else if(a<b)
			result = -1;
		return result;
	}
	
}