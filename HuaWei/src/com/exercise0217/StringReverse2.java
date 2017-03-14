package com.exercise0217;
/**
 * @title  :  ×Ö·û´®·´×ª
 * @author 23192
 *
 */

import java.util.Scanner;
public class  StringReverse2
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
String str= sc.nextLine();
StringBuilder sb = new StringBuilder(str);
sb = sb.reverse();
System.out.println(sb);
}
}