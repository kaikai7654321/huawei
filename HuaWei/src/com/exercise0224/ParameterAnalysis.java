/**
 * @title  :  参数解析
 * @rank   :  95
 * @time   :  2017/2/24
 * 1. 冒号是中文冒号。还有，去掉冒号。
 */

package com.exercise0224;

import java.util.*;

public class ParameterAnalysis 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		
		while(scan.hasNext())
		{
			String s = scan.nextLine();
			String sTemp[] = s.split(" ");
			List<String> list = new LinkedList<String> ();
			
			for(int i = 0; i < sTemp.length; i++)
			{
				String s2 = sTemp[i];
				//System.out.println("测试: "+s2);
				StringBuilder sb = new StringBuilder(s2);
				if(s2.charAt(0) == '“')
				{
					//System.out.println("测试");
					while(s2.charAt(s2.length()-1) != '”')
					{
						i++;
						
						s2 = sTemp[i];
						sb.append(" "+s2);
					}
						
				}
				list.add(sb.toString());
			}
			
			System.out.println(list.size());
			
			for(int i = 0; i < list.size(); i++ )
			{
				String s4 = list.get(i);
				if(s4.charAt(0) == '“')
					System.out.println(s4.substring(1, s4.length()-1));
				else 
				    System.out.println(s4);
			}
			
		}
	}

}
