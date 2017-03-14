package com.exercise0122;

import java.util.Scanner;

//�������������ı�������
public class ShoppingOrder2 {
  public static int getMaxValue(int[] val, int[] weight, int[] q, int n, int w) {
      int[][] dp = new int[n + 1][w + 1];
      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= w; j++) {
              if (q[i-1] == 0) {  // ����
                  if (weight[i - 1] <= j) // ��j��ô��Ǯȥ�� i ����Ʒ ���Ի������ֵ
                      dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j- weight[i - 1]]+ val[i - 1]);
              }
              else { //����
                  if (weight[i - 1] + weight[q[i - 1]] <= j) //�����Ļ� ��������һ����
                      dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j- weight[i - 1]]+ val[i - 1]);
              }
          }
      }
      return dp[n][w];
  }

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      while (input.hasNextInt()) {
          int n = input.nextInt(); // ��Ǯ��
          int m = input.nextInt(); // ��Ʒ����
          int[] p = new int[m];
          int[] v = new int[m];
          int[] q = new int[m];
          for (int i = 0; i < m; i++) {
              p[i] = input.nextInt();        // �۸�
              v[i] = input.nextInt() * p[i]; // ��ֵ
              q[i] = input.nextInt();        // ��or����
          }
          System.out.println(getMaxValue(v, p, q, m, n));
      }
  }
}