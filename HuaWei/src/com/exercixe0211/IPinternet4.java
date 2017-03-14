package com.exercixe0211;
/**
 * 1. ����һ�ݻ�Ϊac���롣������������ۡ����ǱȽϸ��ӡ����Բο���
 * 1�����ȸ�������˽��飬����IP��ַ�������������ȷ��ֻ��Ҫ������ֵ����Ч�ԣ������Ķ����ÿ��ǣ�����0-255֮�䡣
2�����ÿ���IP��ַ����������ĸ�ʽ���⣬����172.29..1,255.255..0�����ÿ��ǣ���������
3�����ÿ�����������ĺ����ԣ�ǰ��ȫ��1����ȫ��0��������255.240.255.0�Ǵ�����������룬���ÿ��ǣ�������
4��ţ��������Ҳ�������https://www.nowcoder.com/questionTerminal/34a597ee15eb4fa2b956f4c595f03218?source=relative
���������������������ʡ�Ե����⣬����255.0����ȷ�ģ������0����ʡ��
��Щ��Ϊ������ⶼû�п��ǣ���Ҳ��ÿ�����Щ���⡣
���������ߵĽ��顣
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