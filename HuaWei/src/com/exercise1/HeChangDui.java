package com.exercise1;
/*
 * 1. @titile: 合唱队
 * 2. @rank:   第二题
 * 3. @time:   2017/1/10
 * 4. 一看到题目就觉得很熟悉，最长递增子序列的变形。然后去查了之前的笔记，果然。其实题目很简单。现在自己再重新写一遍吧。
 * 5. 这道题提交了两次，第一次错了。因为在label1和label2的地方，需要判断，因为有一种情况，就是离自己最近的比自己小的实际上并不是
 *    从后往前最高的。这需要自己吧例子用手推一遍。不然会出现问题。
 */
import java.util.*;
public class HeChangDui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> up = new ArrayList<Integer>();
		List<Integer> down = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		//输入数据
		int num = scan.nextInt();
		for(int i = 0; i < num; i++)
		{
			list.add(scan.nextInt());
			up.add(0);
			down.add(0);
		}
		//计算升序
		for(int i = 1; i<num; i++)
		{
			int now = list.get(i);
			for(int j = i-1; j>=0; j--)
			{
				if(now>list.get(j))
				{
					//label1
					if(up.get(i)<=up.get(j))
					up.set(i, up.get(j)+1);
					
				}
			}
		
		}
		//计算降序
		for(int i = num-2; i>=0; i--)
		{
			int now = list.get(i);
			for(int j = i+1; j<num; j++)
			{
				if(now>list.get(j))
				{
					//label2
					if(down.get(i)<=down.get(j))
					down.set(i, down.get(j)+1);
					
				}
			}
		}
		
		//找出up+down的最大值
		int big = 0;
		for(int i = 0; i < num; i++)
		{
			int now = up.get(i)+down.get(i);
			if(big<now)
				big = now;
				
		}
		
		System.out.println(num-big-1);
		
	}

}
