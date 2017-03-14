package com.exercise0302;



/**
 * @title  :  迷宫问题
 * @rank   :  103
 * @time   :  2017/3/10
 * 1. 简单的迷宫问题。没啥说的。就是自己忘了应该怎么写了。感觉使用Point的类有点浪费。但是记录点有不能不用。
 */
//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.*;

public class Maze 
{
	public static ArrayList<Point> result = new ArrayList<Point> ();
	static int longest = 999999;
	static int[] X = {-1,0,1,0};
	static int[] Y = {0,1,0,-1};
	static int [][]maze;
	static boolean [][]flag;
	static int r,c;
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
//		File file = new File("C:\\Users\\23192\\Desktop\\文件\\input.txt");
//		Scanner scan = new Scanner(file);
		
		while(scan.hasNext())
		{
			
			
			r = scan.nextInt();
			c = scan.nextInt();
			
			maze = new int[r][c];
			flag = new boolean[r][c];
			
			for(int i = 0; i < r; i++)
			{
				for(int j = 0; j < c; j++)
				{
					
					maze[i][j] = scan.nextInt();
					flag[i][j] = true;
				}
			}
			
			Point p = new Point();
			p.x = 0;
			p.y = 0;
			ArrayList<Point> list = new ArrayList<Point> ();
			
			list.add(p);
			
			dfs(0,0,list);
			
			for(int i = 0; i < result.size(); i++)
			{
				Point temp = result.get(i);
				System.out.println("("+temp.x+","+temp.y+")");
			}
			
		}
	}

	public static void dfs(int x, int y, ArrayList<Point> list)
	{
		//System.out.println("x,y: "+x+","+y);
		//System.out.println("r,c"+r+","+c);
		if(x == r-1 && y == c-1)
		{
			if(list.size() < longest)
			{
				result = new ArrayList<Point>(list);
				return;
			}
		}
		
		for(int i = 0; i < 4; i++)
		{
			int nextx = x + X[i];
			int nexty = y + Y[i];
			//System.out.println("next: "+nextx+","+nexty);
			if(nextx >= 0 && nextx < r&&nexty>=0&&nexty<c)
			{
				//System.out.println("flag: "+flag[nextx][nexty]+",maze: "+maze[nextx][nexty]);
				if(flag[nextx][nexty] && maze[nextx][nexty] == 0)
				{
					Point p = new Point();
					p.x = nextx;
					p.y = nexty;
					
					list.add(p);
					flag[nextx][nexty] = false;
					
					dfs(nextx, nexty, list);
					
					flag[nextx][nexty] = true;
					list.remove(p);
				}
			}
		}
		
	}
	
	
}

class Point
{
	int x;
	int y;
	boolean flag;
}