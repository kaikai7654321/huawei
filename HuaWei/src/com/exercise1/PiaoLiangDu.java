package com.exercise1;
/*
 * @title: Ư����
 * @time : 2017/1/10
 * @rank : ������
 * 1.��΢һ˼����֪���Ͱ�ÿ����ĸ��Ƶ�ʼ��ɡ��Ϲ�ϣ��
 * 2. �ύ���Σ�ǰ���ζ��Ǹ�ʽ������Ϊ���ܰ�����Ŀ�������Ҫlabel1ÿ���һ���ͻ��С��Ϳ����ˡ�
 */

import java.util.*;
public class PiaoLiangDu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int []times ;
		
		int num = scan.nextInt();
		List<String> list = new ArrayList<String>();
		List<Integer> numList = new ArrayList<Integer>();
		String name;
		for(int i = 0; i < num; i++)
		{
			times = new int[26];
			name = scan.next();
			name = name.toLowerCase();
			for(int j = 0; j < name.length() ; j++)
			{
				times[(int)name.charAt(j)-97]++;
			}
			
			Arrays.sort(times);
			int start = 25;
			int amount = 0;
			while(times[start]!=0)
			{
				amount+= (start+1)*times[start];
				start--;
			}
			numList.add(amount);
			
		}

		//��������Ҳ�����ֱ�����������������Ϊ�˱��գ���Ϊ���һ�����ܴ��ո�
		//label1
		for(int i = 0; i < numList.size(); i++)
		{
			System.out.println(numList.get(i));
		}
		//System.out.println(numList.get(numList.size()-1));
	}

}
