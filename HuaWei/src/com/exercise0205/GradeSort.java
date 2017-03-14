package com.exercise0205;

/**
 * @title  :  �ɼ�����
 * @rank   :  35
 * @time   :  2017/2/10
 * 1. �����������ˣ��л�������Сʱ�Ÿ㶨��
 * 2. ��������hashmap��ô�����ˣ�����ֻ���Լ��š����Ǹոտ��𰸷����Լ����� ��һ����ʵ������listҲ��������Comparable
 *    �ӿڡ�
 * 3. label1�ǻ��˺ܾã���Ϊ����һ���£����ǲ��������ǽ���i,j����j,j+1.�����Լ����˺ܶ�Ρ�������ָ����ʵ�ܺ���⡣��Ϊ��
 *    ���б�������һ��ң�������ѡ�
 * 4. ���⣬���´��뺯���Ķ��󣬶��ǲ����Զ��ı�ġ����Բ��ûش��ˡ���Ҫ��label2
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
