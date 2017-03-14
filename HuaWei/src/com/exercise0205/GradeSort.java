package com.exercise0205;

/**
 * @title  :  成绩排序
 * @rank   :  35
 * @time   :  2017/2/10
 * 1. 由于排序忘了，有花了两个小时才搞定。
 * 2. 由于忘了hashmap怎么排序了，所以只能自己排。但是刚刚看答案发现自己忽略 了一个事实，就是list也可以重载Comparable
 *    接口。
 * 3. label1徘徊了很久，因为忘了一件事，就是插入排序不是交换i,j而是j,j+1.导致自己错了很多次。而关于指针其实很好理解。因为，
 *    所有变量都是一个遥控器而已。
 * 4. 另外，凡事传入函数的对象，都是不会自动改变的。可以不用回传了。主要是label2
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class GradeSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Grade> list;
		int n, type;

		while (scan.hasNext()) {
			list = new ArrayList<Grade>();
			n = scan.nextInt();
			type = scan.nextInt();
			for (int i = 0; i < n; i++) {
				Grade g = new Grade();
				g.name = scan.next();
				g.grade = scan.nextInt();
				list.add(g);
			}
			//label2
			//ArrayList<Grade> result = sortAsc(list, type);
			sortAsc(list, type);
			for (int i = 0; i < list.size(); i++) {
				Grade g = list.get(i);
				System.out.println(g.name + " " + g.grade);
			}

		}
	}

	public static ArrayList<Grade> sortAsc(ArrayList<Grade> list, int type) {
		for (int i = 1; i < list.size(); i++) {
			Grade temp;
			Grade g = list.get(i);
			for (int j = i - 1; j >= 0; j--) {
				Grade g2 = list.get(j);
				if (type == 0) {
					if (g2.grade < g.grade) {

						//label1
						list.set(j, g);
						list.set(j + 1, g2);
					}
				} else if (type == 1) {
					if (g2.grade > g.grade) {
						list.set(j, g);
						list.set(j + 1, g2);
					}
				}
			}
		}
		return list;
	}
}

class Grade {
	String name;
	int grade;

	public Grade() {

	}

	public Grade(Grade g) {
		this.name = g.name;
		this.grade = g.grade;
	}
}
