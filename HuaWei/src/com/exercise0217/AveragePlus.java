package com.exercise0217;

/**
 * @title  :  记负均正
 * @rank   :  50
 * @time   :  2017/2/17
 * 1. 保留一位整数。和C里面的一样使用printf还是比较方便的。也可以DecimalFormat
 * 2. label1是牛客网和华为不同之处，因为华为上面如果是整除的话，就直接输出即可。
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AveragePlus 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
	
		
		Scanner scan = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		int n,m;
		int amount ,amount2;
		double result ;
		while(scan.hasNext())
		{
			n = scan.nextInt();
			amount = 0;
			amount2 = 0;
			result = 0;
			for(int i = 0; i < n; i++)
			{
				//list.add(scan.nextInt());
				
				m = scan.nextInt();
				if(m<0)amount++;
				else if(m>0)
					{
					result += m;
					amount2++;
					}
				
			}
			System.out.print(amount+" ");
			//label1
			if(result%amount2==0)
				System.out.printf("%d\n",(int)result/(amount2));
			else 
			    System.out.printf("%.1f\n",result/(amount2));
		}
	}

}