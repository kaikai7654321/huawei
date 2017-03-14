package com.exercise0113;
/**
 * 1. @title  坐标移动
 * 2. @rank   15
 * 3. @time   2017/1/13
 * 4. 很简单，就是怎么测试是不是数字需要小心。
 * 5. 需要使用hasNext，因为有多次输入。
 */

import java.io.File;
import java.util.*;

public class DimensionMove {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String sTemp = scan.nextLine();
			int rx = 0;
			int ry = 0;
			String[] sTemp2 = sTemp.split(";");
			for (int i = 0; i < sTemp2.length; i++) {
				String s = sTemp2[i];
				if (s.equals("") || s == null)
					continue;
				if (s.length() != 2 && s.length() != 3)
					continue;
				char d = s.charAt(0);
				char temp1 = s.charAt(1);
				if (!Character.isDigit(temp1)) {
					continue;
				}
				if (s.length() == 3) {
					char temp2 = s.charAt(2);
					if (!Character.isDigit(temp2)) {
						continue;
					}
				}
				int m = Integer.parseInt(s.substring(1, s.length()));
				if (d == 'A') {
					rx = rx - m;
				} else if (d == 'D') {
					rx = rx + m;
				} else if (d == 'W') {
					ry = ry + m;
				} else if (d == 'S') {
					ry = ry - m;
				}
			}
			System.out.println(rx + "," + ry);

		}
	}
}
