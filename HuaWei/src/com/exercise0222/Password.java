package com.exercise0222;

/**
 * @title  :  密码强度等级
 * @rank   :  67
 * @time   :  2017/2/22
 * 1. 只得了60分。在牛客网上可以过，但是不能在华为上面过。
 * 2. 注意题意，label1处三者是互斥的关系。另外，如何说只有小写字母或者大写把二者相加是个好方法。
 * 3. 原来自己看错了。因为数组和字母那里最大加20，只有字符哪里最大加25.
 */

import java.util.*;
public class Password
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String s;
		int score;
		
		while(scan.hasNext())
		{
			s = scan.next();
			score = 0;
			int dnum = 0;
			int aLowNum = 0;
			int aUpNum = 0;
			int cnum = 0;
			
			if(s.length() <= 4)
			{
				score += 5;
			}else if(s.length() >= 5 && s.length() <= 7)
			{
				score += 10;
			}else if(s.length() >= 8)
			{
				score += 25;
			}
			
			for(int i = 0; i < s.length(); i++)
			{
				char c = s.charAt(i);
				
				if(Character.isDigit(c))
				{
					dnum++;
				}else if(Character.isUpperCase(c))
				{
					aUpNum++;
				}else if(Character.isLowerCase(c))
				{
					aLowNum++;
				}else 
				{
					cnum++;
				}
			}
			
			if(dnum == 1)
			{
				score += 10;
			}else if(dnum > 1)
			{
				score += 20;
			}
			
			if(cnum == 1)
			{
				score += 10;
			}else if(cnum > 1)
			{
				score += 25;
			}
			
			if(aUpNum == 0 || aLowNum == 0)
			{
				if(!(aUpNum == 0 && aLowNum == 0))
					score += 10;
			}else 
			{
				score += 20;
			}
			//label1
			if((aUpNum > 0 && aLowNum > 0) && dnum > 0 && cnum >= 0)
			{
				score += 5;
			}else if((aUpNum + aLowNum > 0) && dnum > 0 && cnum >= 0)
			{
				score += 3;
			}else if((aUpNum + aLowNum > 0) && dnum > 0 )
			{
				score += 2;
			}
			
			if(score >= 90)
			{
				System.out.println("VERY_SECURE");
			}else if(score < 90 && score >= 80)
			{
				System.out.println("SECURE");
			}else if(score < 80 && score >= 70)
			{
				System.out.println("VERY_STRONG");
			}else if(score < 70 && score >= 60)
			{
				System.out.println("STRONG");
			}else if(score < 60 && score >= 50)
			{
				System.out.println("AVERAGE");
			}else if(score < 50 && score >= 25)
			{
				System.out.println("WEAK");
			}else if(score < 25 && score >= 0)
			{
				System.out.println("VERY_WEAK");
			}
		}
	}

}
