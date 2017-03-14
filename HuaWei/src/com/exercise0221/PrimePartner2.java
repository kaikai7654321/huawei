package com.exercise0221;



import java.util.Scanner;
 
public class PrimePartner2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int len = in.nextInt();
            int[] num = new int[len];
            for (int i = 0; i < len; i++) {
                num[i] = in.nextInt();
            }
            System.out.println(getBestPairsNum(num, len));
        }
        in.close();
    }
    private static int getBestPairsNum(int[] arr, int n) {
        if (arr == null || n == 0 || n % 2 != 0) {
            return 0;
        }
        int[] dp = new int[n+1];
        int count = 0;
        for (int i = n - 2; i > -1; i--)
        {
            for (int j = n - 1; j > i; j--)
            {
                count = isPrime(arr[i]+arr[j]) ? (dp[i + 1] - dp[j - 1] 
                		+ dp[j + 1] + 1) : dp[i + 1];
                dp[i] = (count > dp[i]) ? count : dp[i];
            }
        }
        for(int i = 0; i < n; i++)
    	{
    		System.out.print(dp[i]+" ");
    	}
    	System.out.println();
        return dp[0];
    }
    
    public static boolean isPrime(int n) {
        int count = (int) Math.sqrt(n);
        while (count > 1) {
            if (n % count == 0 ) {
                return false;
            }
            count--;
        }
          
        return true;
    }
}