package com.exercise0111;
/**
 * @titile  :  ��ˮƿ
 * @rank    :  7
 * @time    :  2017/1/11
 * 1. һ���ύ�㶨��
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
	
	//����һ����Ŀ����ˮƿ���Ի�������ˮ��

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
