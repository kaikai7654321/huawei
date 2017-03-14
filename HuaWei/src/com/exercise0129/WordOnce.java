package com.exercise0129;
/**
 * @title   :  �ҳ��ַ����е�һ��ֻ����һ�ε��ַ�
 * @rank    :  24
 * @time    :  2017/1/29
 * 1. �����˺�һ�ᣬ�о���list��set�ȶ����С�������������ԭ�����Ǹ�map�����ǰ���˳���linkedMap,��Ȼ�鵽��ʱ������
 * 2. Ҳ���԰��������ҵ���indexһֱ�жϡ����Ǹ��÷�����
 * 3. Ҳ�����Լ�дhashmap�ġ�
 */

import java.util.*;
public class WordOnce 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		String s ;
		LinkedHashMap<Character,Integer> map;
//		ArrayList<Character> list1 ;
//		ArrayList<Character> list2 ;
		while(scan.hasNext())
		{
//			list1 = new ArrayList<Character>();
//			list2 = new ArrayList<Character>();
			map = new LinkedHashMap<Character,Integer>();
			s = scan.nextLine();
			for(int i = 0; i < s.length() ;i++)
			{
				Character temp = s.charAt(i);
				if(map.containsKey(temp))
				{
					map.put(temp, ((Integer)map.get(temp))+1);
				}else 
				{
					map.put(temp, 1);
				}
				
			}
			
			//�ó�ֻ����һ�εĵ�һ��
			Set keySet = map.keySet();
			Iterator iter = keySet.iterator();
			boolean flag = true;
			while(iter.hasNext())
			{
				Character cTemp = (Character)iter.next();
				int temp2 = (Integer)map.get(cTemp);
				if(temp2==1)
				{
					System.out.println(cTemp);
					flag = false;
					break;
				}
			}
			if(flag)
			{
				System.out.println('.');
			}
			
		}
	}

}
