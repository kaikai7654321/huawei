package com.exercise0225;


/**
 * @title  :  四则运算
 * @rank   :  97
 * @time   :  2017/2/25
 * 1. 原来是没有思路的。后来看到网上的思路，才明白需要先分开每个字，然后转为后缀表达式，然后再计算。
 * 2. 第一步的时候，需要创建一个类。就是每个单位。需要区分是不是数字。label1就是这个功能，如果是
 *    数字的话，就需要看看有几位，也就是相邻的数字提取出来。如果是字符，分两种情况，如果是+-前面没有数字，表示是符号。那么
 *    就把他和后面的数字一起提取出来。其他就是单个运算符。提取。
 * 3. 第二步是转为后缀表达式。有几个点：
 *    1. 首先需要2步里面的list， 一个存储后缀表达式的resultList， 还有一个存储运算符的栈。
 *    2. 每次从list里面取一个元素，如果是数字，直接到result， 如果是运算符（x2)，就和stack(x1)里面的比较。如果
 *       x1>x2, 分两种，一种是([{之一，压进栈;如果不是，出栈放到result里面。
 *    3. 如果x1 <= x2, 如果相等并且是括号，出栈，并list删除。其他优先级相等的运算符，就先出栈，放入result，然后
 *       吧list里面的压进栈。如果不等，是)]},就出栈，知道出现对应。如果其他，压进栈。
 *    4. 计算后缀。那就是碰到字符，就把前面两个运算一下。label31表示不要写成>0，那样不对的。label32，这个顺序也很重要。
 *       不能从小往大，不然前面对后面有影响。
 *    5. 关于3中的规矩，其实可以自己推测的。因为自己参考网上写的并不对，其中某些规矩就是自己写的。
 *
 */


import java.util.*;

public class SiZe 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Map<Character, Integer> map = new HashMap<Character, Integer> ();
		
		//label1
		map.put('#', 0);
		map.put('+', 1);
		map.put('-', 1);
		map.put('*', 2);
		map.put('/', 2);
		map.put('{', 3);
		map.put('}', 3);
		map.put('[', 4);
		map.put(']', 4);
		map.put('(', 5);
		map.put(')', 5);
		
		while(scan.hasNext())
		{
			String s = scan.next();
			LinkedList<Word> list = new LinkedList<Word>();
			
			splitString(s, list);
			//printList(list);//这是测试用的
		    LinkedList<Word> resultList = toPostfix(map, list);
		    //printList(resultList);//测试用
		    //开始计算
		    System.out.println(calculate(resultList));
		}
	}
	
	//label1: 把输入的字符串分开
    public static void splitString(String s, LinkedList<Word> list)
    {
		for(int i = 0; i < s.length(); i++)
		{
			Word word = new Word();
			char c = s.charAt(i);
			int iTemp = i;
		    boolean flag = true;
		    
			while(iTemp < s.length() && Character.isDigit(s.charAt(iTemp)))
			{
				flag = false;
				iTemp++;
			}
			
			if(flag)
			{
				word.isNum = false;
				iTemp++;
				
			}else 
			{
				word.isNum = true;
			}
			if(c == '+' || c == '-')//此处是为了整数或者负数,此处不对，因为不一定只有一位。
			{
				if(i - 1 < 0 || s.charAt(i - 1) == '(' 
						     || s.charAt(i - 1) == '['|| s.charAt(i - 1) == '{')
				{
					word.isNum = true;
					while(iTemp < s.length() && Character.isDigit(s.charAt(iTemp)))
					{
						iTemp++;
					}
				}
			}
			
			word.s = s.substring(i, iTemp);
			list.add(word);
			i = iTemp - 1;
	    }
	    
		Word word = new Word();
		word.isNum = false;
		word.s = "#";
		list.add(word);
		
    }
    
    //转为后缀表达式
    public static LinkedList<Word> toPostfix(Map<Character, Integer> map, LinkedList<Word> list)
    {
    	//开始中缀变为后缀
		LinkedList<Word> resultList = new LinkedList<Word> ();
	    LinkedList<Character> stack = new LinkedList<Character> ();
	    stack.push('#');
	    
	    while(list.size() > 0)
	    {
	    	Word word2 = list.peek();
	    	
	    	if(word2.isNum)
	    	{
	    		resultList.add(word2);
	    		list.removeFirst();
	    	}else
	    	{
	    		char c = stack.peek();
	    		char c2 = word2.s.charAt(0);
	    		
	    		int cnum = map.get(c);
	    		int c2num = map.get(c2);
	    		
	    		if(cnum > c2num)
	    		{
	    			if(c == '(' || c == '[' || c == '{')
	    			{
	    				stack.push(word2.s.charAt(0));
	    				list.removeFirst();
	    			}else
	    			{
	    			Word word3 = new Word();
	    			word3.isNum = false;
	    			word3.s = c+"";
	    			
	    			resultList.add(word3);
	    			stack.poll();
	    			}
	    		}
	    		else if( cnum <= c2num )
	    		{
	    			
	    			if(c == '#' && c2 == '#')
	    			{
	    				stack.pop();
	    				list.removeFirst();
	    				break;
	    			}
	    			else if(c == '(' && c2 == ')')
	    			{
	    				list.removeFirst();
	    				stack.pop();
	    			}
	    			else if(c == '[' && c2 == ']')
	    			{
	    				stack.pop();
	    				list.removeFirst();
	    			}
	    			else if(c == '{' && c2 == '}')
	    			{
	    				stack.pop();
	    				list.removeFirst();
	    			}else if(c2 == ')' || c2 == ']' || c2 == '}')
	    			{
	    				Word word3 = new Word();
		    			word3.isNum = false;
		    			word3.s = c+"";
		    			
		    			resultList.add(word3);
		    			stack.poll();
		    			
	    			}else if( cnum == c2num)//因为忘了else，所以导致错了很久。
	    			{
	    				Word word5 = new Word();
	    				word5.isNum = false;
	    				word5.s = stack.pop() + "";
	    				
	    				resultList.add(word5);
	    				stack.push(c2);
	    				list.removeFirst();
	    			}else
	    			{
	    				stack.push(c2);
	    				list.removeFirst();
	    			}
	    		}
	    	}
	    }
	    return resultList;
    }
	//计算后缀表达式
	public static int calculate(LinkedList<Word> list)
	{
		int result = 0;
		int i = 0;
		
		//label31
		while(list.size() > 1)
		{
			Word word = list.get(i);
			
			if(word.isNum)
			{
				i++;
				continue;
			}
			
			Word wa = list.get(i-2);
			Word wb = list.get(i-1);
			
			int a = Integer.parseInt(wa.s);
			int b = Integer.parseInt(wb.s);
			
			//label32
			list.remove(i);
			list.remove(i-1);
			list.remove(i-2);
			
			result = help(a, b, word.s.charAt(0));
			
			Word wordTemp = new Word();
			wordTemp.isNum = true;
			wordTemp.s = result + "";
			
			list.add(i-2, wordTemp);
			i = i - 1;
		}
		
		return result;
	}
	//四种运算
	public static int help(int a, int b, char c)
	{
		int result = 0;
		
		switch(c)
		{
		case '+': result = a + b; break;
		case '-': result = a - b; break;
		case '*': result = a * b; break;
		case '/': result = a / b; break;
		}
		
		return result;
	}
	//测试
	public static void printList(List<Word> list)
	{
		for(int i = 0; i < list.size(); i++ )
		{
			System.out.print(list.get(i).s+" ");
		}
		
		System.out.println();
	}

}

//class Word
//{
//	boolean isNum ;
//	String s;
//	
//}
