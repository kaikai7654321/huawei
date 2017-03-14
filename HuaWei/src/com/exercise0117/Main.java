package com.exercise0117;



import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n ;
		int count = 0;
		int temp1;
		// ‰»Î ˝◊÷
		while(scan.hasNext())
		{
			count = 0;
			n = scan.nextInt();
			temp1 = 0;
			while(n!=0)
			{
				
				temp1= n%2;
				n = n/2;
				if(temp1==1)
					count++;
				//System.out.println("≤‚ ‘£∫"+n);
			}
			System.out.println(count);
		}
	}

}
