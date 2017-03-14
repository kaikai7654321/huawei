package com.exercise0205;
/**
 * @title  :  ѧӢ��
 * @rank   :  32
 * @time   :  2017/2/5
 * 1. ��Ҫ��˼·����Ҫ�ҡ���Ҫ���߼���label1���棬��Ҫ��Ҫ��Ҫ�жϣ���ʵ����Ҫ�жϣ������������жϵ����⡣��Ϊ���еĶ���
 *    С��1000�ĵ��á����ԣ����������ظ�������Щ����Ҫ����������
 * 2. ���⣬ÿ����λ����Ҫһ���жϣ��ж���һλ����λ��������λ��������Ҫ��ϸ�ġ�
 * 3. label2��ʾ����Ȼ������help�����ǻ�����Ҫһ���жϣ���Ϊ�㲢��ȷ����������һ����һ����ʮ�ٶ��ڵ�����
 */


import java.util.*;
public class EnglishStudy
{
	static String[] name = {"one","two","three","four","five","six","seven","eight","nine","ten",
			"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty",
			"thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
	    int num ;
	    while(scan.hasNext())
	    {
	    	num = scan.nextInt();
	    	if(num<1000)
	    	{
	    		System.out.println(help(num));
	    	}
	    	else if(num>=1000&&num<1000000)
	    	{
	    		System.out.println(num1000(num));
	    		
	    	}
	    	else if(num>=1000000&&num<1000000000)
	    	{
	    		int rankB = num/1000000;
	    		int rankB2 = num%1000000;
	    		
	    		System.out.println(help(rankB)+" million "+num1000(rankB2));
	    	}
	    }
	}

	public static String num1(int num)
	{
		
    	//System.out.println(name[num-1]);
		//label1
		if(num!=0)
    	return name[num-1];
		else return "";
	}
	public static String num10(int num)
	{
		int rank10 = num/10;
		int rank1 = num%10;
		if(rank10==0)
			return num1(rank1);
		return name[20+rank10-3]+" "+num1(rank1);
	}
	public static String num100(int num)
	{
		//label2
		int rank100 = num/100;
		int rank10 = num%100;
		String result = "";
		if(rank10==0)
		{
			result = name[rank100-1]+" hundred";
		}
		else if(rank10<=20)
		{
			result =  name[rank100-1]+" hundred and "+num1(rank10);
		}
		else if(rank10<100)
			result =  name[rank100-1]+" hundred and "+num10(rank10);
		return result;
	}
	public static String num1000(int num)
	{
		int rank1000 = num/1000;
		int rank100 = num%1000;
		String result = "";
		
		result = help(rank1000)+" thousand "+help(rank100);
		return result;
	}
	public static String help(int num)
	{
		String result = "";
		if(num<=20)
    	{
			//System.out.println("����"+num);
    		//System.out.println(num1(num));
			result = num1(num);
    	}
    	else if(num<100)
    	{
    		result = num10(num);
    		//System.out.println(num10(num));
    	}
    	else if(num>=100&&num<1000)
    	{
    		result = num100(num);
    		//System.out.println("kaikai: "+result);
    		//System.out.println(num100(num));
    	}
		return result;
	}
}

