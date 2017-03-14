package com.exercise0122;
/**
 * @title  :  购物单
 * @author    23192
 * @rank   :  22
 * @time   :  2017/1/22
 * 1. 首先此代码在牛客上面只能通过测试用例的8成。但是华为上面可以全过。
 * 2. 还有一个问题，就是01背包问题里面的依赖问题。关于01问题，要明白基本原理，自己在数组上面（matirx），大小就是物品和
 *    容量。另外，不可用反过来，就是先容量后物品，因为根本讲不通。只能一个物品在之前物品之上加，还有就是每次加的都是之前物品
 *    就是i-1，之前在这里错了很多次。
 * 3. 这里去了只有两个附件的巧，如果可以，可以推广的这个方法。就是ShoppingOrder2里面的。
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
			//n与下面的v同时除以10，然后在最后结果上面再乘。
			m = scan.nextInt();
			//System.out.println("测试： "+n+",:"+m);
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
