package com.exercixe0211;
/**
 * 1. 这个是抄牛客网上面的，然后无法通过华为的，但是比较简洁。有值得借鉴之处。
 */
import java.util.Scanner;
public class IPinternet2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s  = sc.nextLine();
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            if (s==null || s.length()==0 || s1==null || s1.length()==0 ||s2==null || s2.length()==0) {
                System.out.println(1); //IP地址或子网掩码格式非法
                break;
            }
            String ss [] = s.split ("\\.");
            String ss1[] = s1.split("\\.");
            String ss2[] = s2.split("\\.");
            for(int i =0;i<ss.length;i++){
                if(Integer.valueOf(ss[i])<0 || Integer.valueOf(ss[i])>255 || Integer.valueOf(ss1[i])<0 || Integer.valueOf(ss1[i])>255 || Integer.valueOf(ss2[i])<0 || Integer.valueOf(ss2[i])>255){
                    System.out.println(1);//IP地址或子网掩码格式非法
                    break;
                }
                else if ((Integer.valueOf(ss[i]) & Integer.valueOf(ss1[i])) == (Integer.valueOf(ss[i]) & Integer.valueOf(ss2[i]))) {
                    System.out.println(0);//IP1与IP2属于同一子网
                }
                else {
                    System.out.println(2);//IP1与IP2不属于同一子网络
                    break;
                }              
            }
        }        
    }    
}