package com.exercise0111;
/**
 * @titile  :  汽水瓶
 * @rank    :  7
 * @time    :  2017/1/11
 * 1. 一次提交搞定。
 */
import java.util.*;
public class QiShuiPing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int num ;
		while(true)
		{
			num = scan.nextInt();
			if(num==0)
				return;
			System.out.println(count(num));
		}
	}
	
	//计算一定数目的汽水瓶可以换多少汽水喝

	static int count(int num){
		int result = 0;
		while(num>=3){
			result+=num/3;
			num = num/3+num%3;
		}
	    if(num==2)
	    	result++;
		
		return result;
	}
}
