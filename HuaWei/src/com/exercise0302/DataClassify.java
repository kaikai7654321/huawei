/**
 * @title  :  数据分类处理
 * @rank   :  108
 * @time   :  2017/3/12
 * 1. 测试：15 123 456 786 453 46 7 5 3 665 453456 745 456 786 453 123 5 6 3 6 3 0
 * 2. 结果：30 3 6 0 123 3 453 7 3 9 453456 13 453 14 123 6 7 1 456 2 786 4 46 8 665 
 *    9 453456 11 456 12 786
 * 3. 15楼正解，当r和i数列的个数有一个为0时，输出的结果应该为0,而不是什么都不输出，这样就对了
 * 4. 需要稳定的排序算法
 * 5. 啥都不说了，一次过。不知道sort究竟是用什么方法实习的。
 */

package com.exercise0302;

import java.util.*;

public class DataClassify 
{

	public static void main(String[] args) 
	{
		Scanner scan =  new Scanner(System.in);
		ArrayList<Integer> iList,rList,result;
		
		while(scan.hasNext())
		{
			iList = new ArrayList<Integer>();
			rList = new ArrayList<Integer>();
			
			int iNum = scan.nextInt();
			
			for(int i = 0; i < iNum; i++)
			{
				iList.add(scan.nextInt());
			}
			
			iNum = scan.nextInt();
			
			for(int i = 0; i < iNum; i++)
			{
				rList.add(scan.nextInt());
			}
			
			Collections.sort(rList);
			
			result = new ArrayList<Integer> ();
			
			for(int i = 0; i < rList.size(); i++ )
			{
				if(i > 0)
				{
					if(rList.get(i) == rList.get(i-1))
					{
						continue;
					}
				}
				Integer r = rList.get(i);
				String sr = r+"";
				int amount = 0;
				ArrayList<Integer> tempList = new ArrayList<Integer> ();
				for(int j = 0; j < iList.size(); j++)
				{
					
					Integer temp = iList.get(j);
					String stemp = temp + "";
					if(stemp.contains(sr))
					{
						amount++;
						tempList.add((Integer)j);
						tempList.add(temp);
					}
				}
				
				if(amount > 0)
				{
					result.add(r);
					result.add((Integer)amount);
					result.addAll(tempList);
				}
			}
			
			Integer allNum = result.size();
			System.out.print(allNum);
			
			for(int i = 0; i < result.size(); i++)
			{
				System.out.print(" "+result.get(i));
			}
			System.out.println();
		}
	}

}
