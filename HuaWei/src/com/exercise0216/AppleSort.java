/**
 * @title  :  放苹果
 * @rank   :  44
 * @time   :  2017/2/16
 * 1. 自己没有思路，看的牛客网上的。用的递推，很是巧妙。如下：
 * 解题分析：
        设f(m,n) 为m个苹果，n个盘子的放法数目，则先对n作讨论，
        当n>m：必定有n-m个盘子永远空着，去掉它们对摆放苹果方法数目不产生影响。即if(n>m) f(m,n) = f(m,m)　　
        当n<=m：不同的放法可以分成两类：
        1、有至少一个盘子空着，即相当于f(m,n) = f(m,n-1); 
        2、所有盘子都有苹果，相当于可以从每个盘子中拿掉一个苹果，不影响不同放法的数目，即f(m,n) = f(m-n,n).
        而总的放苹果的放法数目等于两者的和，即 f(m,n) =f(m,n-1)+f(m-n,n)
    递归出口条件说明：
        当n=1时，所有苹果都必须放在一个盘子里，所以返回１；
        当没有苹果可放时，定义为１种放法；
        递归的两条路，第一条n会逐渐减少，终会到达出口n==1;
        第二条m会逐渐减少，因为n>m时，我们会return f(m,m)　所以终会到达出口m==0．
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