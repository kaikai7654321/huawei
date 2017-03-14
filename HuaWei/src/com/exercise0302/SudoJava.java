/**
 * @title  :  Sudoku-Java
 * @rank   :  106
 * @time   :  2017/3/11
 * 1. ��ţ�����������һ�����ӹ����ˡ���Ϊ�𰸲�ֹһ�֡������Ǳ���ġ�
 * 2. �ڻ�Ϊ�Ϳ��Թ��ˡ�
 * 3. ԭ��һֱ��Ϊ�Լ������ġ��ǵ�������ά�������ġ����ǲ�֪����ô�Ҳ����ˡ�����ֻ������д��Ȼ���Լ���dfs
 *    д��һ�顣
 * 4. ��ʵ˼·�ܼ򵥡�������һ�㣬����label1����ԭ���Լ��ǰ������Ǹ�forд��while����ġ��������ֲ��С���Ϊ
 *    ����д�����еĿո����ϣ������޷�����ѭ�����������߷ֿ��ͺ��ˡ�
 */

package com.exercise0302;

import java.util.Scanner;

public class SudoJava 
{

	static int[][] map;

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) 
		{
			map = new int[9][9];
			// col
			for (int i = 0; i < 9; i++) 
			{
				for (int j = 0; j < 9; j++) 
				{
					map[i][j] = scan.nextInt();
				}
			}

			if (dfs(0, 0)) 
			{
				printMap();
			}
		}
	}

	// ��ӡ
	public static void printMap() 
	{
		for (int i = 0; i < 9; i++) 
		{
			for (int j = 0; j < 9; j++) 
			{
				System.out.print(map[i][j]);
				if (j != 8) 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	// dfs
	public static boolean dfs(int x, int y) 
	{
		if (x >= 9 || y == 9) 
		{
			return true;
		}

		//�ҵ�ÿ��ѭ�������
		int sx = 0, sy = 0;
		int i = x;
		int j = y;
		//label1
		while (i < 9 && j < 9) 
		{
			if (map[i][j] == 0) 
			{
				sx = i;
				sy = j;
				break;
			}
			i = (j + 1) / 9 + i;
			j = (j + 1) % 9;
		}

		if (i == 9) 
		{
			return true;
		}
		for (int k = 1; k <= 9; k++) 
		{
			if (checked(sx, sy, k)) 
			{
				map[sx][sy] = k;
				int nextx = sx + (sy + 1) / 9;
				int nexty = (sy + 1) % 9;

				// System.out.println("���ԣ� "+nextx+","+nexty);
				if (dfs(nextx, nexty)) 
				{
					return true;
				}
				map[sx][sy] = 0;
			}
		}
		return false;
	}

	// ���ĳ��λ�÷�ĳ��ֵ�Ƿ����
	public static boolean checked(int x, int y, int key) 
	{
		// ÿ��
		for (int i = 0; i < 9; i++) 
		{
			if (map[x][i] == key) 
			{
				return false;
			}
		}

		// ÿ��
		for (int i = 0; i < 9; i++) 
		{
			if (map[i][y] == key) 
			{
				return false;
			}
		}

		// ÿ������
		int tablex = x / 3;
		int tabley = y / 3;

		for (int i = tablex * 3; i < tablex * 3 + 3; i++) 
		{
			for (int j = tabley * 3; j < tabley * 3 + 3; j++) 
			{
				if (map[i][j] == key) 
				{
					return false;
				}
			}
		}

		return true;
	}

}
