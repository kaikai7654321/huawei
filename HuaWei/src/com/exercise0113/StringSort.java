package com.exercise0113;
/**
 * @title  ×Ö·û´®ÅÅÐò
 * @rank   18
 * @time   2017/1/13
 */
import java.util.*;
public class StringSort 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		ArrayList<Character> list1 = new ArrayList<Character>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for(int i = 0; i < s.length(); i++)
		{
			if(Character.isLetter(s.charAt(i)))
			{
				list1.add(s.charAt(i));
				list2.add(i);
			}
		}
		Collections.sort(list1);
	}

}
