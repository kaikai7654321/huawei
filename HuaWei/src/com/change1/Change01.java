package com.change1;


import java.util.*;
public class Change01 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext())
		{
			String s = scan.nextLine();
			String[] sArray = s.split(" ");
			
			for(int i = sArray.length - 1; i >= 0; i--)
			{
				System.out.print(sArray[i]+" ");
			}
			
			System.out.println();
		}
	}

}
