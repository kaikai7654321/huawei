package com.exercise1;
/*
 * 1. ��Ŀ���ƣ��ַ������һ�����ʵĳ���
 * 2. ��һ��
 * 3. ʱ�䣺2017/1/10
 */
import java.io.*;
import java.util.*;
public class LastWordLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		
		String []sTemp = s.split(" ");
		//System.out.println("sTemp,"+sTemp.length);
		s = sTemp[sTemp.length-1];
		System.out.println(s.length());
	}

}
