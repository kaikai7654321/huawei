package com.exercise0221;
/**
 * @title  :  记票统计
 * @rank   :  67
 * @time   :  2017/2/21
 * 1. label1里面的Invalid是大写。
 * 2. 输出的冒号前后有空格。牛客上如果只能看到一个输出，说明有错误。
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class JiPiao
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("C:\\Users\\23192\\Desktop\\input.txt");
		Scanner scan = new Scanner(file);
		//Scanner scan = new Scanner(System.in);
		int num,num2;
		String s;
		Map<String,Integer> map ;
		while(scan.hasNext())
		{
			
			map = new LinkedHashMap<String,Integer>();
			num = scan.nextInt();
			for(int i = 0; i < num; i++)
			{
				s = scan.next();
				map.put(s, 0);
			}
			//label1
			map.put("Invalid", 0);
			num2 = scan.nextInt();
			
			for(int i = 0; i < num2; i++)
			{
				s = scan.next();
				if(map.containsKey(s))
				{
					map.put(s, map.get(s)+1);
				}else 
				{
					map.put("Invalid", map.get("Invalid")+1);
				}
			}
			
			Set<String> set = map.keySet();
			Iterator iter = set.iterator();
			while(iter.hasNext())
			{
				s = (String)iter.next();
				//label2
				System.out.println(s+" : "+map.get(s));
			}

		}
	}

}
