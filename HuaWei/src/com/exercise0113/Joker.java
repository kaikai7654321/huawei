package com.exercise0113;
/**
 * @title  扑克牌大小
 * @author 23192
 * @rank   17
 * @time   2017/1/13
 * 1. 首先理解题意。一手牌其实不是原来自己理解的很多。只是一对而已。也就是比较大小的。
 * 2. 所以题目一下就变得简单了。
 * 3. 然后学会封装。学会全面考虑。
 *
 */
import java.util.HashMap;
import java.util.Scanner;
public class Joker
{
	static HashMap<String,Integer> map = new HashMap<String,Integer>();
	public static void main(String[] args) 
	{
		
		String []rank = {"3","4","5","6","7","8","9","10","J","Q","K","A","2","joker","JOKER"};
		int count = 1;
		for(int i = 0; i < rank.length; i++)
		{
			map.put(rank[i], count++);
		}
		//总共五种牌，个，双，三个，顺子，炸弹，对王，而且只有一对牌。
		int type1 = 1,type2=1;//按上面顺序依次是1,2,3,4,5,6,
		Scanner scan = new Scanner(System.in);
		String joker = scan.nextLine();
		String[]sTemp = joker.split("-");
		String joker1 = sTemp[0];
		String joker2 = sTemp[1];
		
		String j1[] = joker1.split(" ");
		String j2[] = joker2.split(" ");
		String jTemp1 = j1[0];
		String jTemp2 = j2[0];
		type1 = type(joker1);
		type2 = type(joker2);
		//System.out.println("type1: "+type1+",type2: "+type2);
		if(type1 == 6)
			System.out.println(joker1);
		else if(type2 == 6)
			System.out.println(joker2);
		else if(type1 == 5)
		{
			if(type2 == 5)
			{
				if(compareJoker(jTemp1,jTemp2)==1)
				{
					System.out.println(joker1);
				}else 
				{
					System.out.println(joker2);
				}
			}else 
			{
				System.out.println(joker1);
			}
			
		}else if(type2==5)
		{
			System.out.println(joker2);
		}else if(type1 == 4)
		{
			if(type2==4)
			{
				if(compareJoker(jTemp1,jTemp2)==1)
				{
					System.out.println(joker1);
				}else 
				{
					System.out.println(joker2);
				}
					
			}else 
			{
				System.out.println("ERROR");
			}
		}else if(type1==type2)
		{
			
			{
				if(compareJoker(jTemp1,jTemp2)==1)
				{
					System.out.println(joker1);
				}else 
				{
					System.out.println(joker2);
				}
					
			}
		}else 
		{
			System.out.println("ERROR");
		}
		
		
	}

	public static int type(String joker)
	{
		int typeTemp = 1;
		String sTemp1[] = joker.split(" ");
		if(sTemp1.length==1)
		{
			typeTemp=1;
		}else if(sTemp1.length==2)
		{
			if(sTemp1[0].equals("joker")||sTemp1[0].equals("JOKER"))
			{
				typeTemp = 6;
			}else 
			{
				typeTemp = 2;
			}
		}else if(sTemp1.length == 3)
		{
			typeTemp = 3;
		}
		else if(sTemp1.length == 4)
		{
			typeTemp = 5;
		}else if(sTemp1.length==5)
		{
			typeTemp = 4;
		}
		return typeTemp;
	}
	public static int compareJoker(String s1, String s2)
	{
		int result = 1;//s1>s2
		if(map.get(s1)<map.get(s2))
			result = 0;
		return result;
	}
}

