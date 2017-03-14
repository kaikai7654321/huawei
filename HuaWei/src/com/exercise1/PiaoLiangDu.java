package com.exercise1;
/*
 * @title: 漂亮度
 * @time : 2017/1/10
 * @rank : 第三道
 * 1.略微一思考就知道就按每个字母的频率即可。上哈希。
 * 2. 提交三次，前两次都是格式错误。因为不能按照题目输出。需要label1每输出一个就换行。就可以了。
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

		//输出结果。也许可以直接在上面输出，但是为了保险，因为最后一个不能带空格
		//label1
		for(int i = 0; i < numList.size(); i++)
		{
			System.out.println(numList.get(i));
		}
		//System.out.println(numList.get(numList.size()-1));
	}

}
