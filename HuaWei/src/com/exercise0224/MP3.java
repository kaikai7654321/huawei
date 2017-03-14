
/**
 * @title  :  MP3π‚±ÍŒª÷√
 * @rank   :  94
 * @time   :  2017/2/24
 * 1. 
 */

package com.exercise0224;

import java.util.*;

public class MP3 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n;
		String s;
		
		while(scan.hasNext())
		{
			n = scan.nextInt();
			s = scan.next();
			
			int front = 1;
			int end = 4;
			int index = 1;
			
			for(int i = 0; i < s.length(); i++)
			{
				char c = s.charAt(i);
				
				if(c == 'U')
				{
					if(index > front)
					{
						index--;
					}else if(index == front)
					{
						if(front == 1)
						{
							index = n;
							front = n-3;
							end = n;
						}else 
						{
							front --;
							index = front;
							end --;
						}
					}
				}else if(c == 'D')
				{
					if(index < end)
					{
						index++;
					}else if(index == end)
					{
						if(end == n)
						{
							front = 1;
							end = 4;
							index = 1;
						}else 
						{
							front ++;
							end ++;
							index = end;
						}
					}
				}
			}
			
			for(int i = front; i < end; i++)
			{
				System.out.print(i+" ");
			}
			System.out.println(end);
			
			System.out.println(index);
		}
	}

}
