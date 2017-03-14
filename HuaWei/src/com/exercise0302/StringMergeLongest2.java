package com.exercise0302;
/**
 * �����Ŀ�������ΪѰ���·��������¼��������·����

���ȵ�һ�����ж���������֮���ǿ�����ͨ�ģ���Ӧ��Ŀ���ǣ��ж��������ַ���������βƥ�䣻

��Σ�����Щ������ͨ�ĵ�֮�䣬�ҵ�һ�����·����

1����A�㿪ʼ��������A��B������ͨ����ʱ·������ΪA-B��

2���ٴ�B�㿪ʼ��������B��C������ͨ����¼��������ʱ·������ΪA-B-C��

3�������п�����ͨ��·�����ȶ���¼������Ȼ���ҳ��������
http://blog.csdn.net/wanggg2760/article/details/51818683
 */
import java.util.Scanner;  

public class StringMergeLongest2 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        String[] input = scanner.nextLine().trim().split(" ");  
        scanner.close();  
        System.out.print(longestPath(input));  
    }  
  
    private static String longestPath(String[] input) {  
        int[][] path = new int[input.length][input.length]; //���������¼�������ӵ��ִ�  
        String[][] connectString = new String[input.length][input.length];  //��������洢���������ִ���β��  
  
        for (int i = 0; i < input.length; i++) {  
            for (int j = i + 1; j < input.length; j++) {  
                if (input[j].indexOf(input[i].substring(1)) == 0) { //��һ���ִ���indexΪ1��ʼ��һ�Σ�������һ���ִ�index=0�Ĳ���  
                    path[i][j] = 1;   //��¼�������ִ�������  
                    connectString[i][j] = input[j]     
                            .substring(input[j].length() - 1); //��¼��ȡ��ĩ���ִ�  
                }  
            }  
        }  
  
        for (int i = 0; i < path.length; i++)  
            for (int j = 0; j < path.length; j++)  
                for (int k = 0; k < path.length; k++) {  
                    if (path[i][j] != 0 && path[j][k] != 0) { //���input[j]���Ժ�input[i]��input[k]ǰ�����  
                        int dist = path[i][j] + path[j][k];   //��¼�����·������  
                        if(dist > path[i][k]){  //������·������ԭʼ�ľ�������ֵ����  
                            path[i][k] = dist;  
                            connectString[i][k] = connectString[i][j] + connectString[j][k]; //����input[j]��input[k]��ĩ��  
                        }  
                    }  
                }  
          
        int max = 0;  
        int start = 0;  
        int end = 0;  
        for(int i = 0; i < path.length; i++)  
            for(int j = 0; j < path.length; j++){  //�����ҳ����·��  
                if( max < path[i][j]){  
                    max = path[i][j]; //��¼·������ʼ��ĩλ����  
                    start = i;  
                    end = j;  
                }  
            }  
          
        String result = null;  
        if(start != end)  
            result = input[start] + connectString[start][end];//����ʵ���ִ��ͺ�����ӵ�ĩ��������һ��  
        return result;  
  
    }  
} 