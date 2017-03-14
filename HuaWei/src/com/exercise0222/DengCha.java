package com.exercise0222;

/**
 * @title  :  Ѱ�ҵȲ�����
 * @rank   :  68
 * @time   :  2017/2/22
 * 1. ԭ��û��˼·��������������һЩ�Ȳ����У����ֿ�����dp��ԭ���õ���һά�����ǲ��Բ��ԡ����������ϵķ����õ��Ƕ�ά����Ϊ
 *    ��������������ϵ��⣬�ǲ�����Ŀǰ���֮��ǰ��һ�������ص�Ҫ��ġ����ԣ�ֱ�ӵ������㲻�����ġ�
 * 2. label1���û�еȺţ������������С�ġ��˴�������ġ�����һ���м���Ŀ�������С�����⣬�ǵ���������ʽ
 *     ���⵹Ҳ��ͬ���Ǹ�ÿ��������֮��ӿո�
 * 3. 
 */

import java.util.*;
public class DengCha 
{
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int a,b;
		List<Integer> list;
		int dp[][];
		
		while(scan.hasNext())
		{
			list = new ArrayList<Integer> ();
			a = scan.nextInt();
			b = scan.nextInt();
			
			if(a<2) 
			{
				a = 2;
			}
			
			for(int i = a; i <= b; i++ )
			{
				if(isPrime(i))
				{
					list.add(i);
				}
			}
			
			dp = new int[list.size()][b-a];
			
			//���ö�̬�滮��ȷ�����
			int big = 0;
			int index = 0;
			int diff = 0;
			
			for(int i = 1; i < list.size(); i++)
			{
				for(int j = i-1; j >= 0; j--)
				{
					int diff2 = list.get(i) - list.get(j);
					dp[i][diff2] = dp[j][diff2]+1;
					//label1
                    if(big <= dp[i][diff2])
                    {
                    	big = dp[i][diff2];
                    	index = i;
                    	diff = diff2;
                    }
					
				}
			}
			
			ArrayList<Integer> resultList = new ArrayList<Integer> ();
            int temp = list.get(index);
            while(temp >= a)
            {
            	resultList.add(temp);
            	temp = temp - diff;
            	if(!isPrime(temp))
            		break;
            }
            
			for(int i = resultList.size()-1; i>=0; i--)
			{
				System.out.println(resultList.get(i));
			}
			
		}
	}

	
	//�ж��Ƿ�������
	public static boolean isPrime(int a)
	{
		for(int i = 2; i <= Math.sqrt(a); i++)
		{
			if(a % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
