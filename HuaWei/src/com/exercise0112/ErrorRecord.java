package com.exercise0112;
/**
 * @title  简单错误记录
 * @author 23192
 * @rank   13
 * @time   2017/1/12
 * 1. 关于输入的'\'，经过测试需要用split('\\\\')才可以。
 * 2. 关于文件与行数直接空格不止一个。split里面可以直接用正则表达式。
 * 3. 测试用例是可以过的。在牛客网上的用例。但是很遗憾，无法通过。
 * 4. 感觉开始很多没有想到。后来看到牛客上别人的代码，感觉好简洁。原来一个linkedHashMap即可。还是自己太无知。导致代码写的
 *    太繁琐，越繁琐，越需要考虑很多事。
 * 5. 输入也需要注意。
 * 6. ac代码看ErrorRecord2
 * 7. label1,下面两种输入都是可以的。
 * 8. 个人猜测也许是因为自己没有按照插入的顺讯输出结果所以才错的。
 * 9. 
 */
/*测试用例
去牛客网
 */

import java.util.*;

public class ErrorRecord
{

	public static void main(String[] args)
	{
		Map<String,Integer> map = new HashMap<String,Integer>();
		Scanner scan = new Scanner(System.in);
		LinkedList<String> list = new LinkedList<String>();
		while(scan.hasNext())
		{
			//label1
			//String row = scan.nextLine();
			//String sTemp[] = row.split(" +");
			//String addr = sTemp[0];
			//String rowNum = sTemp[1];
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
			if(map.size()>8)
			{
				//list = new ArrayList<String>(list.subList(list.size()-8, list.size()));
				
				String sTemp4 = list.poll();
				//System.out.println("要删除的： "+sTemp4+" : "+map.get(sTemp4.toString()));
				map.remove(sTemp4.toString());
				for(int i = 0; i <list.size(); i++)
				{
					String sTemp5 = list.get(i);
					if(sTemp5.equals(sTemp4))
					{
						list.remove(i);
					}
				}
			}
		}
		
		Set set = map.keySet();
		Iterator iter = set.iterator();
		while(iter.hasNext())
		{
			String item = (String) iter.next();
			int t = map.get(item);
			System.out.println(item+" "+t);
		}

	}

}


