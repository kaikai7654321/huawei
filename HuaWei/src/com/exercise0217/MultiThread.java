package com.exercise0217;
/**
 * @title  :  多线程
 * @rank   ：   48
 * @time   :  2017/2/17
 * 1. Runnable需要用run，而不是start，这是很关键的。错了之后一直没有找到错误。
 * 2. 在牛客上越界，但是再华为上面可以过。
 * 3. 还有人直接输出十次abcd也可以过。说明题目有bug
 */
import java.io.File;
import java.util.*;
public class MultiThread implements Runnable
{
	public static char w = 'A';
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		int n ;
		while(scan.hasNext())
		{
			n = scan.nextInt();
			MultiThread mt = new MultiThread();
			Thread t1 = new Thread(mt);
			Thread t2 = new Thread(mt);
			Thread t3 = new Thread(mt);
			
			for(int i = 0; i < n; i++)
			{
				w = 'A';
				System.out.print(w);
				w = 'B';
				t1.run();
				w = 'C';
				t2.run();
				w = 'D';
				t3.run();
			}
			System.out.println();
		}
	}

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		System.out.print(w);
	}

}


