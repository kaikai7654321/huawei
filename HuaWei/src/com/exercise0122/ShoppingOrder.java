package com.exercise0122;
/**
 * @title  :  ���ﵥ
 * @author    23192
 * @rank   :  22
 * @time   :  2017/1/22
 * 1. ���ȴ˴�����ţ������ֻ��ͨ������������8�ɡ����ǻ�Ϊ�������ȫ����
 * 2. ����һ�����⣬����01��������������������⡣����01���⣬Ҫ���׻���ԭ���Լ����������棨matirx������С������Ʒ��
 *    ���������⣬�����÷���������������������Ʒ����Ϊ��������ͨ��ֻ��һ����Ʒ��֮ǰ��Ʒ֮�ϼӣ����о���ÿ�μӵĶ���֮ǰ��Ʒ
 *    ����i-1��֮ǰ��������˺ܶ�Ρ�
 * 3. ����ȥ��ֻ�������������ɣ�������ԣ������ƹ���������������ShoppingOrder2����ġ�
 */

import java.util.*;
import java.io.*;
public class ShoppingOrder 
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan  = new Scanner(System.in);
		
		//File file = new File("C:\\Users\\23192\\Desktop\\input.txt");
		//Scanner scan = new Scanner(file);
		int [][]w ;
		int [][]value ;
		int f[][];
		//int [][]
		int n,m,v,p,q;
		while(scan.hasNext())
		{
			value = new int[65][3];
			w = new int[65][3];
			f = new int[65][3205];
			n = scan.nextInt();
			n = n/10;
			//n�������vͬʱ����10��Ȼ��������������ٳˡ�
			m = scan.nextInt();
			//System.out.println("���ԣ� "+n+",:"+m);
			for(int i = 1; i <= m; i++)
			{
				v = scan.nextInt();
				v = v/10;
				p = scan.nextInt();
				q = scan.nextInt();
				if(q==0)
				{
					value[i][q] = v;
					w[i][q] = p;
					
				}
				else if(value[i][1]==0)
				{
					value[q][1] = v;
					w[q][1] = p;
				}else 
				{
					value[q][2] = v;
					w[q][2] = p;
				}
			}
			
			for(int i = 1; i <= m; i++)
			{
				for(int j = 0; j <= n; j++)
				{
					f[i][j] = f[i-1][j];
					if(j-value[i][0]>=0)
					{
						if(f[i][j] < f[i-1][j-value[i][0]] + value[i][0]*w[i][0])
						{
							f[i][j] = f[i-1][j-value[i][0]] + value[i][0]*w[i][0];
						}
					}
					
					if(j-value[i][0]-value[i][1]>=0)
					{
						if(f[i][j] < f[i-1][j-value[i][0]-value[i][1]] + value[i][0]*w[i][0]+value[i][1]*w[i][1])
						{
							f[i][j] = f[i-1][j-value[i][0]-value[i][1]] + value[i][0]*w[i][0]+value[i][1]*w[i][1];
						}
						
					}
					if(j-value[i][0]-value[i][2]>=0)
					{
						if(f[i][j] < f[i-1][j-value[i][0]-value[i][2]] + value[i][0]*w[i][0]+value[i][2]*w[i][2])
						{
							f[i][j] = f[i-1][j-value[i][0]-value[i][2]] + value[i][0]*w[i][0]+value[i][2]*w[i][2];
						}
						
					}
					if(j-value[i][0]-value[i][1]-value[i][2]>=0)
					{
						if(f[i][j] < f[i-1][j-value[i][0]-value[i][1]-value[i][2]] + value[i][0]*w[i][0]+value[i][1]*w[i][1]+value[i][2]*w[i][2])
						{
							f[i][j] = f[i-1][j-value[i][0]-value[i][1]-value[i][2]] + value[i][0]*w[i][0]+value[i][1]*w[i][1]+value[i][2]*w[i][2];
						}
						
					}
					//System.out.println("i: "+i+",j:"+j+",: "+f[i][j]*10);
				}
				
			}
			System.out.println(f[m][n]*10);
		}
	}

}
