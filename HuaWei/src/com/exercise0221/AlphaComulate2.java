package com.exercise0221;
/**
 * 2. ��ʵ�⻹�ǿ��ԸĽ��ġ�����ֱ��ֻ��a,��ΪArrays.sort���Դ�������ġ�
 */

import java.io.*;

import java.util.*;
import java.util.Map.Entry;

public class AlphaComulate2
{
	public static void main(String[] args) throws FileNotFoundException 
	{
//		File file = new File("C:\\Users\\23192\\Desktop\\input.txt");
//		Scanner scan = new Scanner(file);
		Scanner scan = new Scanner(System.in);
		int []a;
		int []b;
		ArrayList<Character> list ;
		String s ;
		while(scan.hasNextLine())
		{
			list = new ArrayList<Character>();
			a = new int[128];
			b = new int[128];
			s = scan.nextLine();
			for(int i =0; i < s.length(); i++)
			{
				Character c = s.charAt(i);
				a[c]++;
				b[c]++;
				list.add(c);
			}
			Collections.sort(list);
			Arrays.sort(a);
			
			for(int i = 127; i>=0; i--)
			{
				if(a[i]==0) break;
				for(int j = 0; j < list.size(); j++)
				{
					char c= list.get(j);
					if(Character.isDigit(c)||Character.isLetter(c)||Character.isSpaceChar(c))
					{
					if(a[i]==b[c])
					{
						System.out.print(c);
						b[c] = 0;
						break;
					}
					}
				}
			}
			System.out.println();
		}
	}
} 