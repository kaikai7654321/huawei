/**
 * @title  :  笔画
 * @rank   :  107
 * @time   :  2017/3/12
 * 1. 感谢评论。

2. 总结一下，输入的第一个字母是边的数目，下面没两个数组是一条边。边里面最大的数字是定点数目。

3. 请不要把顶点数目和边数搞混了。我就是搞混了又多花了20分钟。

4. 输出只用输出true和false.

5. 连通图判断，欧拉路径判断（每个顶点的度数只有两个或者0个十奇数）

6. 这是中级的最后一道题目了。虽然还有两道中级题目得了满分但是没有对。
7. 此处并没有进行路径压缩。只需要把所有的顶点指向同一个点即可。
8. 欧拉路径和欧拉连通图并不同。
 */

package com.exercise0302;

import java.util.*;

public class BiHua 
{
	static int[] node ;//保存每个node的度数
	static int[] father;//保存每个顶点的父顶点
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext())
		{
			int m = scan.nextInt();
			//此处不要用m来初始化数组。边数和顶点数目不同
			node = new int[1001];
			father = new int[1001];
			
			for(int i = 1; i <= 1000; i++)
			{
				node[i] = 0;
				father[i] = i;
			}
			
			int s,e;//边的起始点
			int maxNum = 0;//找出顶点数目，也即是最大数
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
			
			//连通图判断。度数为奇数的点只有0或者2个。
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
			
			//检验联通
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

