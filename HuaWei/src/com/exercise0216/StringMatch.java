package com.exercise0216;
/**
 * @title  :  字符串匹配
 * @rank   :  43
 * @time   :  2017/2/16
 * 1. 关于题目有个问题，就是短字符串的字符指的是连续还是不连续。目前估计应该是不连续。
 * 2. 采用不连续。主要问题是怎么处理重复出现的。后来发现list的remove即使有重复的也只会删除其中之一。所以就用了list。
 * 3. 在牛客上面只通过了2成，后来根据Stringmatch上面的，可以看出，只要短的里面有的长的里面有即可。
 *    不在乎出现几次。所以使用StringMatch2里面的。
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
