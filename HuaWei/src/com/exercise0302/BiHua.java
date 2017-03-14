/**
 * @title  :  �ʻ�
 * @rank   :  107
 * @time   :  2017/3/12
 * 1. ��л���ۡ�

2. �ܽ�һ�£�����ĵ�һ����ĸ�Ǳߵ���Ŀ������û����������һ���ߡ����������������Ƕ�����Ŀ��

3. �벻Ҫ�Ѷ�����Ŀ�ͱ�������ˡ��Ҿ��Ǹ�����ֶ໨��20���ӡ�

4. ���ֻ�����true��false.

5. ��ͨͼ�жϣ�ŷ��·���жϣ�ÿ������Ķ���ֻ����������0��ʮ������

6. �����м������һ����Ŀ�ˡ���Ȼ���������м���Ŀ�������ֵ���û�жԡ�
7. �˴���û�н���·��ѹ����ֻ��Ҫ�����еĶ���ָ��ͬһ���㼴�ɡ�
8. ŷ��·����ŷ����ͨͼ����ͬ��
 */

package com.exercise0302;

import java.util.*;

public class BiHua 
{
	static int[] node ;//����ÿ��node�Ķ���
	static int[] father;//����ÿ������ĸ�����
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext())
		{
			int m = scan.nextInt();
			//�˴���Ҫ��m����ʼ�����顣�����Ͷ�����Ŀ��ͬ
			node = new int[1001];
			father = new int[1001];
			
			for(int i = 1; i <= 1000; i++)
			{
				node[i] = 0;
				father[i] = i;
			}
			
			int s,e;//�ߵ���ʼ��
			int maxNum = 0;//�ҳ�������Ŀ��Ҳ���������
			for(int i = 1; i <= m; i++)
			{
				s = scan.nextInt();
				e = scan.nextInt();
				if(s > maxNum)
				{
					maxNum = s;
				}
				if(e > maxNum)
				{
					maxNum = e;
				}
			    
				father[father(s)] = father[father(e)];
				node[s]++;
				node[e]++;
			}
			
			//��ͨͼ�жϡ�����Ϊ�����ĵ�ֻ��0����2����
			int amount = 0;
			for(int i = 1; i <= maxNum; i++)
			{
				if(node[i] % 2 != 0)
				{
					amount++;
					
				}
				
			}
			if(!(amount ==0 || amount == 2))
			{
				System.out.println("false");
				continue;
			}
			
			//������ͨ
			amount = 0;
			for(int i = 1; i <= maxNum; i++)
			{
				if(father[i] == i)
				{
					amount++;
				}
			}
			if(amount == 1)
			{
				System.out.println("true");
			}else
			{
				System.out.println("false");
			}
			
		}
	}
	
	public static int father(int s)
	{
		return ((father[s] == s) ? s : father(father[s]));
	}

}

