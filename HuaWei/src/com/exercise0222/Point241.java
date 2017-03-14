package com.exercise0222;
/**
 * 1. �ɳ˳�����Ϊ�Ӽ�
 * 2. Ŀǰ�ķ����ǰ�ÿ�������������ĺͷŽ�set��Ȼ��24�Ƿ�����������ʵ��������еĺͼ���set����������ȫ����
 * 3. Ŀǰ�Լ���ֻ��˵�󲿷ֽ���Եõ����Ͼ����еĿ�����ĳ�����ı���������һ�������Ա�������
 * 4. �����ԭ����24���в�֮ͬ�����ǿ����ظ��������Ͳ����Ա����ˡ�
 * 5. ֻ�ܰѳ˳���ɼӼ���
 */

import java.util.*;

public class Point241 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int []list;
		Set<Integer> set;
		
		while(scan.hasNext())
		{
			set = new HashSet<Integer>();
			list = new int[4];
			
			for(int i = 0; i < 4; i++)
			{
				list[i] = scan.nextInt();
				set.add(list[i]);
			}
			
			for(int i = 0; i < 3; i++)
			{
			    for(int j = i+1; j < 4; j++)
			    {
			    	set.add(list[i]+list[j]);
			    }
			}
			
			Iterator iter = set.iterator();
			boolean flag = true;
			while(iter.hasNext())
			{
				if(24 % (int)iter.next() == 0)
				{
					System.out.println("true");
					flag = false;
					break;
				}
			}
			
			if(flag)
			{
				System.out.println("false");
			}
		}
	}
	
	
}
