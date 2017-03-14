package com.exercise0217;

import java.util.Scanner;
public class Code2013012 {
    static int x = 0,y=0;
    public static void main(String args[]){    
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            x = m;y = n;
            System.out.println(getRoad( 0, 0));
        }
        scanner.close();
    }
    public static int getRoad(int m,int n){
        if(m == x && n == y)return 1;
        if(m >x || n > y) return 0;
        else return getRoad(m+1, n) + getRoad( m, n+1);
    }
}
