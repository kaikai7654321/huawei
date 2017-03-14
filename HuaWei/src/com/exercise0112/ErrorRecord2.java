package com.exercise0112;


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ErrorRecord2
{

	public static void main(String[] args)
	{
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		Scanner scan = new Scanner(System.in);
		LinkedList<String> list = new LinkedList<String>();
		while(scan.hasNext())
		{
			String addr = scan.next();
			int rowNum = scan.nextInt();
			String sTemp2[] = addr.split("\\\\");
			String fileName = addr;
			if(sTemp2.length>1)
			 fileName= sTemp2[sTemp2.length-1];
			
			if(fileName.length()>16)
			{
				fileName = fileName.substring(fileName.length()-16, fileName.length());
			}
			String item = fileName+" "+rowNum;
			if(map.containsKey(item))
			{
				map.put(item, map.get(item)+1);
			}else 
			{
				map.put(item, 1);
			}
			list.addLast(item);

		}
		
		int count=0;
        for(String string:map.keySet()){
            count++;
            if(count>(map.keySet().size()-8)) //输出最后八个记录
                System.out.println(string+" "+map.get(string));
        }

	}

}
