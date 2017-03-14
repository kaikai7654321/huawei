package com.exercise0217;

/**
 * @title  :  合法IP
 * @rank   :  49
 * @time   :  2017/2/17
 * 1. 直接抄的前面的。
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ConfigureIP 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("C:\\Users\\23192\\Desktop\\input.txt");
		Scanner scan = new Scanner(file);
		//Scanner scan = new Scanner(System.in);
		String s ;
		while(scan.hasNext())
		{
			s = scan.next();
			if(configureIP(s))
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			//System.out.println(configureIP(s));
		}
	}
	//判断ip是否合法
		public static boolean configureIP(String ip)
		{
			
			String s[] = ip.split("\\.");
			
			if(s.length!=4)
				return false;
			for(int i = 0; i < 4; i++)
			{
				int ipTemp = Integer.parseInt(s[i]);
				
				if(ipTemp<0||ipTemp>255)
					return false;
			}
			return true;
		}
}
