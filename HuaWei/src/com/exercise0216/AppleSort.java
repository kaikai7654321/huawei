/**
 * @title  :  ��ƻ��
 * @rank   :  44
 * @time   :  2017/2/16
 * 1. �Լ�û��˼·������ţ�����ϵġ��õĵ��ƣ�����������£�
 * ���������
        ��f(m,n) Ϊm��ƻ����n�����ӵķŷ���Ŀ�����ȶ�n�����ۣ�
        ��n>m���ض���n-m��������Զ���ţ�ȥ�����Ƕ԰ڷ�ƻ��������Ŀ������Ӱ�졣��if(n>m) f(m,n) = f(m,m)����
        ��n<=m����ͬ�ķŷ����Էֳ����ࣺ
        1��������һ�����ӿ��ţ����൱��f(m,n) = f(m,n-1); 
        2���������Ӷ���ƻ�����൱�ڿ��Դ�ÿ���������õ�һ��ƻ������Ӱ�첻ͬ�ŷ�����Ŀ����f(m,n) = f(m-n,n).
        ���ܵķ�ƻ���ķŷ���Ŀ�������ߵĺͣ��� f(m,n) =f(m,n-1)+f(m-n,n)
    �ݹ��������˵����
        ��n=1ʱ������ƻ�����������һ����������Է��أ���
        ��û��ƻ���ɷ�ʱ������Ϊ���ַŷ���
        �ݹ������·����һ��n���𽥼��٣��ջᵽ�����n==1;
        �ڶ���m���𽥼��٣���Ϊn>mʱ�����ǻ�return f(m,m)�������ջᵽ�����m==0��
 */

package com.exercise0216;

import java.util.*;

public class AppleSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int m = sc.nextInt();
            int n = sc.nextInt();
            if(m<1 || n>10){
                System.out.println(-1);
            }else{
                System.out.println(shareCount(m,n));
            }
             
        }
    }
    public static int shareCount(int m, int n){
        if(m<0){
            return 0;
        }
        if(m==1 || n==1){
            return 1;
        }
        return shareCount(m, n-1)+shareCount(m-n,n);
    }
}