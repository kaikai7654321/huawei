package com.exercise0217;



/**
 * @title  :  ���ַ������ҳ�����������ִ�
 * @rank   :  54
 * @time   :  2017/2/17
 * 1. ������ʽ�ǳ�����
      Pattern p = Pattern.compile("\\d+");
      Matcher m = p.matcher(str); 
   2. �����ǿ����ı���д�ģ��ڻ�Ϊ���档�����Լ���ֱ�Ӱ�longBit�Ĵ����ù����ġ�
   3. ע�⿴�⡣label1������ǣ������0�Ͳ�����ִ������Ǻ�ţ������ͬ��С�ģ��е���ţ�����Ϲ����ڻ�Ϊ���治��������Ϊ�ˡ�
   4�� ����һ�����⣬�����������һ��������һͨ�����
 */


import java.util.*;
public class LongDigit
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s,result ="" ;
		while(scan.hasNext())
		{
			s = scan.next();
			int amount = 0;
			int amount2 = 0;
			int temp1,temp2;
			StringBuilder sb;
			
			for(int i = 0; i < s.length(); i++)
			{
				sb = new StringBuilder("");
				char c = s.charAt(i);
				if(Character.isDigit(c))
				{
					amount2 = 0;
					//label2
					while(Character.isDigit(c))
					{
						sb.append(c+"");
						amount2++;
						i++;
						if(i>=s.length())
							break;
						c = s.charAt(i);
						
					}
					if(amount2>amount)
					{
						amount = amount2;
						result = sb.toString();
					}
					else if(amount2==amount)
					{
						result += sb.toString();
					}
						
					
				}
			}
			//label1
			if(amount==0)
				System.out.println(0);
			else 
			    System.out.println(result+","+amount);
		}
	}

}
