package com.exercise0224;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Author: ������
 * Time: 2016-05-04 19:00
 * CSDN: http://blog.csdn.net/derrantcm
 * Github: https://github.com/Wang-Jun-Chao
 * Declaration: All Rights Reserved !!!
 */
public class MatrixMulti2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Scanner scanner = new Scanner(Main.class.getClassLoader().getResourceAsStream("data.txt"));
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            int[] arr = new int[num * 2];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
            String rule = scanner.next();
            System.out.println(estimate(arr, rule));


        }
        scanner.close();
    }

    /**
     * ���շ�����˷��ļ�����
     *
     * @param arr  ����Ĵ�С
     * @param rule ���㷨��
     * @return ִ�г˷��Ĵ���
     */
    private static int estimate(int[] arr, String rule) {

        Deque<Integer> stack = new LinkedList<>();
//        Deque<Character> chars = new LinkedList<>();
//
//        StringBuilder builder = new StringBuilder(rule.length());

        int idxArr = 0;
        int idx = 0;
        int result = 0;
        while (idx < rule.length()) {

            char c = rule.charAt(idx);

            // c��������
            if (c != '(' && c != ')') {
                // ����ǵ�һ���ַ�
                if (idx == 0) {
                    stack.addLast(arr[idxArr]);
                    stack.addLast(arr[idxArr + 1]);

                }
                // ���ǵ�һ���ַ�
                else {
                    // ȡǰһ���ַ�
                    char prev = rule.charAt(idx - 1);
                    // ����������ž�Ҫ���м���
                    if (prev != '(' && prev != ')') {
                        // ��һ�����������������
                        int col = stack.removeLast();
                        int row = stack.removeLast();
                        int col2 = arr[idxArr + 1];
                        result += row * col * col2;

                        stack.add(row);
                        stack.add(col2);
                    }
                    // ��������ž�Ҫ��ӵ�ջ��
                    else {
                        stack.addLast(arr[idxArr]);
                        stack.addLast(arr[idxArr + 1]);
                    }

                    // �ƶ�����һ������
                    idxArr += 2;
                }
            }
            // ������һ���ַ�
            idx++;
        }


        // ���stack��ֻ��ʣ��һ������ֻ���к���
        // Ҫ�Ӻ���ǰ����
        while (stack.size() > 2) {
            int col2 = stack.removeLast();
            int row2 = stack.removeLast();
            int col1 = stack.removeLast();
            int row1 = stack.removeLast();
            stack.addLast(row1);
            stack.addLast(col2);
            result += row1 * col1 * col2;
        }

        return result;
    }

}