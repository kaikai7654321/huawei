package com.exercise0129;
/**
 * @title  :  iNOC��Ʒ��-������ǵı���
 * @rank   :  26
 * @time   : 2017/2/2
 * 1. �ܼ򵥵��ҹ��ɡ���Ϊ��n��ȡֵ��Χ�Ϳ��Կ������������ü���ķ�����������Ϊû�бʣ��Լ�û��ȥ�ơ����ǲο��˱��˵Ĵ��롣
 * 2. ������Ȼ�ܼ򵥡�
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
