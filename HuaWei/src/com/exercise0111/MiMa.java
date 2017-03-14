package com.exercise0111;
/**
 * @title  :  简单密码破解
 * @rank   :  8
 * @time   :  2017/1/11
 * @author kaikai
 * 1. 其实就是一个if else。但是，记住数字的ascii码并不是数字的值。
 */
import java.util.Scanner;
public class MiMa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//输入数据。输入到文件结尾应该就是用scan.hasNext()
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			String s = scan.next();
			System.out.println(decode(s));
		}
	}

	//写个编码的函数
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
