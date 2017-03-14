/**
 * @title  :  表示数字
 * @rank   :  45
 * @time   :  2017/2/16
 * 
 * 1. 首先就是用什么的问题。突然发现String的增删并没有很好的方法。尤其插入。这次感觉用StringBuilder好一点。
 * 2. label1哪里需要加入对i的判断，不然容易出问题的。
 */

package com.exercise0216;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class PresentDigit 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("C:\\Users\\23192\\Desktop\\input.txt");
		Scanner scan = new Scanner(file);
		//Scanner scan = new Scanner(System.in);
		String s;
		StringBuilder sb;
		while(scan.hasNext())
		{
			s = scan.next();
			sb = new StringBuilder(s);
			for(int i = 0; i < sb.length(); i++)
			{
				char c = sb.charAt(i);
				if(Character.isDigit(c))
				{
					sb.replace(i, i+1, "*"+c);
					i++;
					//label1
					while(i<sb.length()&&Character.isDigit(sb.charAt(i)))
					{
						i++;
					}
					sb.replace(i-1, i, sb.charAt(i-1)+"*");
				}
			}
			System.out.println(sb.toString());
		}
	}

}
