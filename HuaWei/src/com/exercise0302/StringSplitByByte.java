/**
 * @title  :  ���ֽڽ�ȡ�ַ���
 * @author :  kaikai
 * @rank   :  104
 * @time   :  2017/3/11
 * 1. ԭ����Ϊ���ѣ�������ʵ�Ϻ����ס��Ӹ��жϼ��ɡ�
 */
package com.exercise0302;

import java.util.*;

public class StringSplitByByte 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext())
		{
			String s = scan.next();
		    int index = scan.nextInt();
		    
		    int i = 0,len = 0;
		    while(len < index)
		    {
		    	char c = s.charAt(i);
		    	if(c > 255)
		    	{
		    		if(len + 2 < index)
		    		{
		    			len += 2;
		    		}else
		    		{
		    			
		    			break;
		    		}
		    		
		    	}else
		    	{
		    		len += 1;
		    	}
		    	System.out.print(c);
		    	i++;
		    }
		    System.out.println();
		}
	}
}
