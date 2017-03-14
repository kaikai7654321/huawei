package com.exercise0223;

/**
 * @title  :  24点运算
 * @rank   :  83
 * @time   :  2017/2/23
 * 1. 这道题竟然做了一下午。其实上午已经有思路了，而且都写的差不多了。但是不自信罢了。很久不写迷宫类的题目。所以
 *    就不想写。其实无非就是debug。谁也是不是一开始就写对的程序的，错了debug就好了。只要思路清晰即可。
 * 2. 首先网上的多半都是暴力解法。因为数字和运算符号都是可以变得。所以最好是保持一个不变，另一个顺序取排列组合，这就是暴力
 *    的思路，然后逐个匹配判断即可。因为java里面没有next_permutation,所以用此法还要自己写个排列组合。并不简单。
 * 3. 然后就是递归的思路了。遇到这种在某一点多种选择的题目就是和迷宫一样，直接递归（dfs,bfs）。这是通解。此法关键就是之前说过的，终止条件
 *    ，做出选择，递归，回退。还有一点，就是多半都会有for循环，还需要记录路径有的。比如此题。
 * 4. 其实两种方法本质也就是递归和for的区别.如果迭代有优势，也是在过程中可能会剪枝而有了优化。
 * 5. 本题目要求是多种可能，输出其一即可。但是实际上是不行的。在牛客网上改了好几次，终于通过率从0到了90%，但是还是有一组没有
 *    通过，就是4 4 2 7，本程序输出7-4*4*2，牛客给出的答案7-4*2*4，这说明是先排序，凡事从小的开始。但是因为如果
 *    此处排序，那么与A，J,K等的对应也需要改。所以就没有做。所以此程序的通过率是90%
 * 6. label1, 运算符需要这个顺序。如果+在-前，应该只要50%的通过率。
 * 7. label2出注释的就是排序。但是此处排序后会导致和原来的字符对不上。如果硬要排，还需要想办法和原来的对应上。
 * 8. label3,label4都是double，因为整数除法有可能除不尽。很多人这里直接按照整数除的，严格说是不对的。即使过了，也是侥幸
 * 9. 
 */


import java.util.*;

public class Point24
{
	//label1
	static char code[] = {'-','+','*','/'};
	public static void main(String[] args) 
	{
		Scanner scan  = new Scanner(System.in);
		String s;
		//记录当前算式的值
		int result;
		//存储输入的几个字符
		String[] arr ;
		//存储输入的数字
		int[] arr2;
		//标记是否用过了此数字。
		boolean flag[] ;
		
		while(scan.hasNext())
		{
			arr = new String[4];
			
			//若是大小王，直接下一个。
			boolean tempFlag = true;
			for(int i = 0; i < 4; i++)
			{
				s = scan.next();
				if(s.equals("joker") || s.equals("JOKER") || s.equals("Joker"))
				{
					System.out.println("ERROR");
					tempFlag = false;
					continue;
				}
				arr[i] = s;
			}
			
			if(tempFlag == false)
			{
				continue;
			}
			
			arr2 = new int[4];
			flag = new boolean[4];
			for(int i = 0; i < 4; i++)
			{
				flag[i] = true;
			}
			
			for(int i = 0; i < 4; i++)
			{
				arr2[i] = toDigit(arr[i]);
			}
			
			//对最终结果进行标记
			boolean flag2 = true;
			//记录路径
		    LinkedList<String> list2 = new LinkedList<String> ();;
			
			for(int i = 0; i < 4 && flag2; i++)
			{
				//label2
				//Arrays.sort(arr2);
				list2.clear();
				for(int k = 0; k < 4; k++)
				{
					flag[k] = true;
				}
				
				//label3
				double temp = (double)arr2[i];
				list2.add(arr[i]+"");
				flag[i] = false;
				
				if(help(arr,arr2,flag,temp, list2))
				{
					flag2 = false;
				}
			}
			
			//输出结果
			if(flag2)
			{
				System.out.println("NONE");
			}else 
			{
				
				for(int k = 0; k < list2.size(); k++)
				{
					System.out.print(list2.get(k));
				}
				System.out.println();
			}
		}
	}

	//dfs： 需要注意的是arr2表示原始字符串，用来记录路径用的，arr表示的是数字，用来算结果。和main里面正好反了
	public static boolean help(String [] arr2,int[] arr, boolean[] flag, double result, LinkedList<String> list2)
	{
		//终止条件有两个，不要忘了后面那个。有可能用不了四个就24了，那样式不对。
		if(result == 24 && list2.size() == 4)
		{
			return true;
		}
		
		
		for(int i = 0; i < 4; i++)
		{
			if(flag[i])
			{
				for(int j = 0; j < 4; j++)
				{
					double temp = result;
					result = compute(result, arr[i],j);
					String s = code[j]+""+arr2[i];
					
					list2.add(s);
					flag[i] = false;
					
					if(help(arr2,arr,flag, result,list2))
					{
						return true;
					}
					
					list2.remove(s);
					result = temp;
					flag[i] = true;
				}
				 
			}
		}
		
		return false;
	}

	//label4
	public static double compute(double a, int b, int type)
	{
		double result = -1;
		
		switch(type)
		{
		case 0: result = a - b; break;
		case 1: result = a + b; break;
		case 2: result = a * b; break;
		case 3: result = a / b; break;
		}
		return result;
	}
	
	public static int toDigit(String s)
	{
		int result = 0;
		char c = s.charAt(0);
		
		if(c == 'J')
		{
		    result = 11;
		}else if(c == 'Q')
		{
			result = 12;
		}else if(c == 'K')
		{
			result = 13;
		}else if(c == 'A')
		{
			result = 1;
		}else 
		{
			result = Integer.parseInt(s);
		}
		
		return result;
	}
}
