package com.exercixe0211;
/**
 * @title  :  判断两个IP是否属于同一个子网
 * @rank   :  39
 * @time   :  2017/2/11
 * 1. 255.0 193.194.202.15 232.43.7.59
 * 2. 出现上面情况的，需要这样处理就可以通过了：ip或mask不足4段的，后面自动补0 
 * 3. 之前一直觉得不能用&,但是现在看是可以用的。返回值就是经过and操作之后的值。
 * 4. 
 */

import java.util.*;
public class IPinternet 
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
        	if(configureIP(code1)||configureIP(code2)||configureIP(yCode))
        	{
        		System.out.println(2);
        		break;
        	}
        	if(configureCode(yCode))
        	{
        		System.out.println(2);
        		break;
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
                    	System.out.println(1);
                    }
                    else 
                    {
                    	System.out.println(0);
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
				result.append(0);
			}
			else 
			{
				result.append(2);
			}
		}
		return result.toString();
	}
	//判断掩码是否合法
	public static boolean configureCode(String ip)
	{
		String s[] = ip.split(".");
		for(int i = 0; i < s.length; i++)
		{
			int temp = Integer.parseInt(s[i]);
			if(!(temp==255||temp==254||temp==128||temp==192||temp==224||temp==240||temp==248||temp==252))
			{
				return false;
			}
			
		}
		for(int i = 0; i < s.length-1; i++)
		{
			int temp = Integer.parseInt(s[i]);
			int temp2 = Integer.parseInt(s[i+1]);
			if(temp<temp2)
				return false;
		}
		return true;
	}
	//判断ip是否合法
	public static boolean configureIP(String ip)
	{
		String s[] = ip.split(".");
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
