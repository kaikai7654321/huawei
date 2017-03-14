package com.exercixe0211;

/**
 * 1. 这是自己写的答案。原来觉得没什么错。可以通过牛客网。但是无法通过华为。
 */
import java.util.*;

public class IPinternet3
{
	public static void main(String[] args) 
	{
		String yCode,code1,code2;
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext())
        {
        	yCode = scan.next();
        	code1 = scan.next();
        	code2 = scan.next();
        	if(!configureIP(code1)||!configureIP(code2)||!configureIP(yCode))
        	{
        		
        		System.out.println(1);
        		continue;
        	}
        	
        	//System.out.println("测试1");
        	String[] ys = yCode.split("\\.");
        	String[] s1 = code1.split("\\.");
        	String[] s2 = code2.split("\\.");
        	for(int i = 0; i < s1.length; i++)
        	{
        		//System.out.println("测试2");
        		//System.out.println(s1[i]+","+s2[i]);
        		if(!s1[i].equals(s2[i]))
        		{
        			//System.out.println(s1[i]);
        			String int1 = Integer.toBinaryString(Integer.parseInt(s1[i]));
        			String int2 = Integer.toBinaryString(Integer.parseInt(s2[i]));
        			String inty = Integer.toBinaryString(Integer.parseInt(ys[i]));
        			while(int1.length()<=8)
        				int1 = "0"+int1;
        			while(int2.length()!=8)
        				int2 = "0"+int2;
        			while(inty.length()!=8)
        				inty = "0"+inty;
                    String bs1 = binary(inty,int1);
                    String bs2 = binary(inty,int2);
                    if(bs1.equals(bs2))
                    {
                    	System.out.println(0);
                    }
                    else 
                    {
                    	System.out.println(2);
                    }
        			break;
        		}
        	}
        }
	}

	public static String binary(String codey,String code1)
	{
		StringBuilder result = new StringBuilder("");
		for(int i = 0; i < 8; i++)
		{
			if(codey.charAt(i)==code1.charAt(i))
			{
				result.append(1);
			}
			else 
			{
				result.append(0);
			}
		}
		return result.toString();
	}
	
	//判断ip是否合法
	public static boolean configureIP(String ip)
	{
		String s[] = ip.split(".");
		
		for(int i = 0; i < s.length; i++)
		{
			int ipTemp = Integer.parseInt(s[i]);
			if(ipTemp<0||ipTemp>255)
				return false;
		}
		return true;
	}
}
