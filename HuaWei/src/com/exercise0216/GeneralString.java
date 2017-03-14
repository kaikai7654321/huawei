package com.exercise0216;
/**
 * @title  :  字符串通配符
 * @rank   :  42
 * @time   :  2017/2/16
 * 1. 主要思路是严格按照要求。但是，th*s,this是false,因为如果是true，要考虑的情况就会很多。要确定是贪婪还是非贪婪。二者结果
 *    是不同的。这一点即使是正则表达式也是需要自己指定的。
 * 2. 牛客网上面说没有循环。但是华为上正确。
 * 3. GeneralString2里面是自己看到的用通配符写的。
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class GeneralString 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("C:\\Users\\23192\\Desktop\\input.txt");
		Scanner scan = new Scanner(file);
		//Scanner scan = new Scanner(System.in);
		String s,gs;
		while(scan.hasNext())
		{
			gs = scan.next();
			s = scan.next();
			int i = 0,j=0;
			boolean flag = true;
			while(j<s.length()&&i<gs.length())
			{
				char gc = gs.charAt(i);
				char c = s.charAt(j);
				//System.out.println("测试:"+gs.charAt(i)+","+s.charAt(j));
				if(gc=='?')
				{
					if(Character.isAlphabetic(c))
					{
						i++;
						j++;
					}
					else 
					{
						System.out.println(false);
						break;
					}
				}else if(gc=='*')
				{
					//System.out.println("测试2:"+gs.charAt(i)+","+s.charAt(j));
					if(Character.isLetter(c)||Character.isDigit(c))
					{
						//System.out.println("测试3:"+gs.charAt(i)+","+s.charAt(j));
						j++;
						if(j==s.length())
						{
							i++;
						}
					}else
					{
						i++;
					}
				}
				else if(gc==c)
				{
					i++;
					j++;
					
				}else 
				{
					System.out.println(false);
					break;
				}
			}
			//System.out.println("测试3：i, "+i+","+gs.length()+",j,"+j+","+s.length());
			if(j==s.length()&&gs.length()==i)
			{
				System.out.println(true);
			}
		}
	}

}
