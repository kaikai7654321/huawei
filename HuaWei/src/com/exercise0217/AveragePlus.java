package com.exercise0217;

/**
 * @title  :  �Ǹ�����
 * @rank   :  50
 * @time   :  2017/2/17
 * 1. ����һλ��������C�����һ��ʹ��printf���ǱȽϷ���ġ�Ҳ����DecimalFormat
 * 2. label1��ţ�����ͻ�Ϊ��֮ͬ������Ϊ��Ϊ��������������Ļ�����ֱ��������ɡ�
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AveragePlus 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
	
		
		Scanner scan = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		int n,m;
		int amount ,amount2;
		double result ;
		while(scan.hasNext())
		{
			n = scan.nextInt();
			amount = 0;
			amount2 = 0;
			result = 0;
			for(int i = 0; i < n; i++)
			{
				//list.add(scan.nextInt());
				
				m = scan.nextInt();
				if(m<0)amount++;
				else if(m>0)
					{
					result += m;
					amount2++;
					}
				
			}
			System.out.print(amount+" ");
			//label1
			if(result%amount2==0)
				System.out.printf("%d\n",(int)result/(amount2));
			else 
			    System.out.printf("%.1f\n",result/(amount2));
		}
	}

}