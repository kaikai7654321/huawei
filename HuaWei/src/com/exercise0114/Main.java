package com.exercise0114;


import java.util.*;
public class Main 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int count = 0;
			String s = scan.nextLine(); 
			if(s.isEmpty())
			{
				System.out.println(0);
			}else {
				for(int i = 0; i<s.length(); i++)
				{
					if(Character.isUpperCase(s.charAt(i)))
					{
						count++;
					}
				}
				System.out.println(count);
			}
			
			
		}
	

}
