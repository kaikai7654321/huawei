package com.exercise1;
/*
 * 1. @titile: �ϳ���
 * 2. @rank:   �ڶ���
 * 3. @time:   2017/1/10
 * 4. һ������Ŀ�;��ú���Ϥ������������еı��Ρ�Ȼ��ȥ����֮ǰ�ıʼǣ���Ȼ����ʵ��Ŀ�ܼ򵥡������Լ�������дһ��ɡ�
 * 5. ������ύ�����Σ���һ�δ��ˡ���Ϊ��label1��label2�ĵط�����Ҫ�жϣ���Ϊ��һ��������������Լ�����ı��Լ�С��ʵ���ϲ�����
 *    �Ӻ���ǰ��ߵġ�����Ҫ�Լ�������������һ�顣��Ȼ��������⡣
 */
import java.util.*;
public class HeChangDui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> up = new ArrayList<Integer>();
		List<Integer> down = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		//��������
		int num = scan.nextInt();
		for(int i = 0; i < num; i++)
		{
			list.add(scan.nextInt());
			up.add(0);
			down.add(0);
		}
		//��������
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
		//���㽵��
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
		
		//�ҳ�up+down�����ֵ
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
