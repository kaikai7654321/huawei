/**
 * @title  :  矩阵乘法计算量估算
 * @rank   :  97
 * @time   :  2017/2/24
 *  3 50 10 10 20 10 10 10 5 (A(CB)D)
 *  1. 参考了网上的做法，就是MatrixMulti2里面的，但是，很遗憾，牛客可以过，但是华为过不了。最后两个例子过不了。
 *  2. 有人说是ACBD需要考虑，但是自己考虑了也是不对。
 *  3. 先这样吧。
 */

package com.exercise0224;


import java.util.*;

public class MatrixMulti 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n ;
		int []row;
		int []col;
		String rule;
		
		while(scan.hasNext())
		{
			n = scan.nextInt();
			row = new int[n];
			col = new int[n];
			
			for(int i = 0; i < n ; i++)
			{
				row[i] = scan.nextInt();
				col[i] = scan.nextInt();
			}
			
			rule = scan.next();
			
			System.out.println(calculate(row, col, rule));
		}
	}

	public static int calculate(int []row, int[] col, String rule)
	{
		int result = 0;
		
		int idxArr = 0;//arr的index
		int idxRule = 0;
		LinkedList<Integer> list = new LinkedList<Integer> ();
		
		while(idxRule < rule.length())
		{
			//System.out.println("测试4： "+rule);
			char c = rule.charAt(idxRule);
			
			//System.out.println("测试: "+c);
			if(c != '(' && c != ')' )
			{
				idxArr = c - 'A';
				//System.out.println("测试: c: "+c+","+idxArr);
				if(idxRule == 0)
				{
					list.addLast(row[idxArr]);
					list.addLast(col[idxArr]);
				}else 
				{
					char pre = rule.charAt(idxRule - 1);
					
					if(pre != '(' && pre != ')')
					{
						int col1 = list.removeLast();
						int row1 = list.removeLast();
						int row2 = row[idxArr];
						int col2 = col[idxArr];
						
						result += row1 * col1 *col2;
						//System.out.println("测试2: " + result);
						list.addLast(row1);
						list.addLast(col2);
						
						//idxArr += 1;
					}else
					{
						int row2 = row[idxArr];
						int col2 = col[idxArr];
						
						list.addLast(row2);
						list.addLast(col2);
						
						//idxArr += 1;
					}
				}
			}
			idxRule++;
		}
		
		//System.out.println("测试: " + list.size());
		
		//这里必须大于2,因为最终会有一对在里面。
		while(list.size() > 2)
		{
			int col1 = list.removeLast();
			int row1 = list.removeLast();
			int col2 = list.removeLast();
			int row2 = list.removeLast();
			
			//这里的书序是反的，所以2在前。
			result += row2 * col2 * col1;
			
			list.addLast(row2);
			list.addLast(col1);
		}
		
		return result;
	}
}
