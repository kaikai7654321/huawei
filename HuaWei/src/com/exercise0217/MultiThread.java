package com.exercise0217;
/**
 * @title  :  ���߳�
 * @rank   ��   48
 * @time   :  2017/2/17
 * 1. Runnable��Ҫ��run��������start�����Ǻܹؼ��ġ�����֮��һֱû���ҵ�����
 * 2. ��ţ����Խ�磬�����ٻ�Ϊ������Թ���
 * 3. ������ֱ�����ʮ��abcdҲ���Թ���˵����Ŀ��bug
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


