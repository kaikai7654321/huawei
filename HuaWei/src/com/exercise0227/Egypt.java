package com.exercise0227;

/**
 * @title  :  ��������ֽ�Ϊ��������
 * @rank   :  99
 * @time   :  2017/2/27
 * 1. ���������ϳ���һ���𰸡�����ô���ˡ��о�Ӧ�������⡣
 * 2. �о��ù�ʽҲ���ԡ����ǹ�ʽ��֤��Ӧ�ò����ס�
 */

import java.util.Scanner;


public class Egypt {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
while(in.hasNext()){
String str=in.next();
Egyptsocre(str);
}

}
public static void Egyptsocre(String str){
String[] parts=str.split("/");
int a=Integer.parseInt(parts[0]);//����
int b=Integer.parseInt(parts[1]);//��ĸ
StringBuilder sb=new StringBuilder();
int c;
        while (a != 1) {
            if (b % (a - 1) == 0) {
                sb.append("1/").append(b / (a - 1)).append('+');
                a = 1;
            } else {
                c = b / a + 1;
                sb.append("1/").append(c).append('+');
                a = a * c - b;
                b = c * b;
                if (b % a == 0) {
                    b = b / a;
                    a = 1;
                }
            }
        }
        sb.append("1/").append(b);
        System.out.println(sb.toString());
    }

}
