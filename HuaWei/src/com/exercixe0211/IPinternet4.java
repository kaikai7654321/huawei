package com.exercixe0211;
/**
 * 1. 这是一份华为ac代码。来自下面的评论。但是比较复杂。可以参考。
 * 1、首先给后面的人建议，对于IP地址和子网掩码的正确性只需要考虑数值的有效性，其他的都不用考虑，即在0-255之间。
2、不用考虑IP地址和子网掩码的格式问题，例如172.29..1,255.255..0，不用考虑！！！！！
3、不用考虑子网掩码的合理性，前面全是1后面全是0，即正常255.240.255.0是错误的子网掩码，不用考虑！！！！
4、牛客网上面也有这道题https://www.nowcoder.com/questionTerminal/34a597ee15eb4fa2b956f4c595f03218?source=relative
它还考虑了子网掩码可以省略的问题，例如255.0是正确的，后面的0可以省略
这些华为的这道题都没有考虑，大家不用考虑这些问题。
上面是作者的建议。
 */
import java.util.Scanner;

public class IPinternet4 {
	public static int checkNetSegment(String mask, String ip1, String ip2) {
		String[] str1 = mask.split("\\.");
		String[] str2 = ip1.split("\\.");
		String[] str3 = ip2.split("\\.");
		for(int i=0;i<4;i++){
			if(Integer.parseInt(str1[i])<0||Integer.parseInt(str1[i])>255){
				return 1;
			}
		}
		for(int i=0;i<4;i++){
			if(Integer.parseInt(str2[i])<0||Integer.parseInt(str2[i])>255){
				return 1;
			}
		}
		for(int i=0;i<4;i++){
			if(Integer.parseInt(str3[i])<0||Integer.parseInt(str3[i])>255){
				return 1;
			}
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<4;i++){
			int result=(Integer.parseInt(str1[i])&Integer.parseInt(str2[i]));
			sb.append(result);  
            if(i!=3) 
            	sb.append(".");
		}
		StringBuilder sb2=new StringBuilder();
		for(int i=0;i<4;i++){
			int result=(Integer.parseInt(str1[i])&Integer.parseInt(str3[i]));
			sb2.append(result);  
            if(i!=3) 
            	sb2.append(".");
		}
		String s1 = sb.toString();
		String s2 = sb2.toString();
		if(s1.equals(s2))
			return 0;
		else 
			return 2;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String mask = scan.next();
		String ip1 = scan.next();
		String ip2 = scan.next();
		System.out.println(checkNetSegment(mask,ip1,ip2));
	}
}