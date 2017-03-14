/**
 * @title  :  Sudoku-Java
 * @rank   :  106
 * @time   :  2017/3/11
 * 1. 在牛客上面有最后一个例子过不了。因为答案不止一种。但是是报错的。
 * 2. 在华为就可以过了。
 * 3. 原来一直以为自己做过的。记得是用三维数组做的。但是不知道怎么找不到了。所以只能重新写。然后自己用dfs
 *    写了一遍。
 * 4. 其实思路很简单。但是有一点，就是label1哪里原来自己是吧下面那个for写到while里面的。后来发现不行。因为
 *    那样写当所有的空格都填上，还是无法跳出循环。后来二者分开就好了。
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

	// 打印
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

		//找到每次循环的入口
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

				// System.out.println("测试： "+nextx+","+nexty);
				if (dfs(nextx, nexty)) 
				{
					return true;
				}
				map[sx][sy] = 0;
			}
		}
		return false;
	}

	// 检测某个位置放某个值是否可以
	public static boolean checked(int x, int y, int key) 
	{
		// 每行
		for (int i = 0; i < 9; i++) 
		{
			if (map[x][i] == key) 
			{
				return false;
			}
		}

		// 每列
		for (int i = 0; i < 9; i++) 
		{
			if (map[i][y] == key) 
			{
				return false;
			}
		}

		// 每个方格
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
