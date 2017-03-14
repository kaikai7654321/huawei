package com.exercise0129;
/**
 * @title  :  iNOC产品部-杨辉三角的变形
 * @rank   :  26
 * @time   : 2017/2/2
 * 1. 很简单的找规律。因为从n的取值范围就可以看出来，不能用计算的方法。但是因为没有笔，自己没有去推。而是参考了别人的代码。
 * 2. 代码自然很简单。
 */

import java.util.*;
public class YangHui 
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
	    int n;
	    while(scan.hasNext())
	    {
	    	n = scan.nextInt();
	    	if(n<=2) System.out.println(-1);
	    	else if(n%2==1) System.out.println(2);
	    	else 
	    	{
	    		if(n%4==0)  System.out.println(3);
	    		else  System.out.println(4);
	    	}
	    }
	}

}
