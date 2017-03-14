/**
 * @title  :  ���ݷ��ദ��
 * @rank   :  108
 * @time   :  2017/3/12
 * 1. ���ԣ�15 123 456 786 453 46 7 5 3 665 453456 745 456 786 453 123 5 6 3 6 3 0
 * 2. �����30 3 6 0 123 3 453 7 3 9 453456 13 453 14 123 6 7 1 456 2 786 4 46 8 665 
 *    9 453456 11 456 12 786
 * 3. 15¥���⣬��r��i���еĸ�����һ��Ϊ0ʱ������Ľ��Ӧ��Ϊ0,������ʲô��������������Ͷ���
 * 4. ��Ҫ�ȶ��������㷨
 * 5. ɶ����˵�ˣ�һ�ι�����֪��sort��������ʲô����ʵϰ�ġ�
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
