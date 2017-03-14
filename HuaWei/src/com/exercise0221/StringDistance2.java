package com.exercise0221;

import java.util.Scanner;
 
public class StringDistance2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s1=sc.next();
            String s2=sc.next();
            System.out.println(getLevinstain(s1, s2));
        }
    }
    public static int getLevinstain(String s1,String s2){
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        int [][] arr=new int[c2.length+1][c1.length+1];
        for(int i=0;i<c1.length+1;i++){
            arr[0][i]=i;
        }
        for(int i=0;i<c2.length+1;i++){
            arr[i][0]=i;
        }
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                int temp=Math.min(arr[i-1][j]+1, arr[i][j-1]+1);
                int num=c1[j-1]==c2[i-1]?0:1;
                arr[i][j]=Math.min(temp, arr[i-1][j-1]+num);
            }
        }
        return arr[c2.length][c1.length];
    }
}