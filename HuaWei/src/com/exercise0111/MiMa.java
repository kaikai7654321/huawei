package com.exercise0111;
/**
 * @title  :  �������ƽ�
 * @rank   :  8
 * @time   :  2017/1/11
 * @author kaikai
 * 1. ��ʵ����һ��if else�����ǣ���ס���ֵ�ascii�벢�������ֵ�ֵ��
 */
import java.util.Scanner;
public class MiMa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�������ݡ����뵽�ļ���βӦ�þ�����scan.hasNext()
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			String s = scan.next();
			System.out.println(decode(s));
		}
	}

	//д������ĺ���
	static public String decode(String s){
		String result="";
		for(int i = 0; i<s.length(); i++){
			char c = s.charAt(i);
			int temp = (int)c;
			if(temp>=97&&temp<=122){
				if(temp>=97&&temp<=114)
				temp = (temp-97)/3+2;
				else if(temp==115)
					temp = 7;
				else if(temp>=116&&temp<=118)
					temp = 8;
				else temp = 9;
				result = result+temp;
			}else if(temp>=65&&temp<=90){
				temp=temp+33;
				result = result+(char)temp;
			}else if(temp>=48&&temp<=57)
				result = result +(char)temp;
			
			
		}
		return result;
	}
}
