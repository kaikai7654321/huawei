package com.exercise0225;


/**
 * @title  :  ��������
 * @rank   :  97
 * @time   :  2017/2/25
 * 1. ԭ����û��˼·�ġ������������ϵ�˼·����������Ҫ�ȷֿ�ÿ���֣�Ȼ��תΪ��׺���ʽ��Ȼ���ټ��㡣
 * 2. ��һ����ʱ����Ҫ����һ���ࡣ����ÿ����λ����Ҫ�����ǲ������֡�label1����������ܣ������
 *    ���ֵĻ�������Ҫ�����м�λ��Ҳ�������ڵ�������ȡ������������ַ�������������������+-ǰ��û�����֣���ʾ�Ƿ��š���ô
 *    �Ͱ����ͺ��������һ����ȡ�������������ǵ������������ȡ��
 * 3. �ڶ�����תΪ��׺���ʽ���м����㣺
 *    1. ������Ҫ2�������list�� һ���洢��׺���ʽ��resultList�� ����һ���洢�������ջ��
 *    2. ÿ�δ�list����ȡһ��Ԫ�أ���������֣�ֱ�ӵ�result�� ������������x2)���ͺ�stack(x1)����ıȽϡ����
 *       x1>x2, �����֣�һ����([{֮һ��ѹ��ջ;������ǣ���ջ�ŵ�result���档
 *    3. ���x1 <= x2, �����Ȳ��������ţ���ջ����listɾ�����������ȼ���ȵ�����������ȳ�ջ������result��Ȼ��
 *       ��list�����ѹ��ջ��������ȣ���)]},�ͳ�ջ��֪�����ֶ�Ӧ�����������ѹ��ջ��
 *    4. �����׺���Ǿ��������ַ����Ͱ�ǰ����������һ�¡�label31��ʾ��Ҫд��>0���������Եġ�label32�����˳��Ҳ����Ҫ��
 *       ���ܴ�С���󣬲�Ȼǰ��Ժ�����Ӱ�졣
 *    5. ����3�еĹ�أ���ʵ�����Լ��Ʋ�ġ���Ϊ�Լ��ο�����д�Ĳ����ԣ�����ĳЩ��ؾ����Լ�д�ġ�
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
			//printList(list);//���ǲ����õ�
		    LinkedList<Word> resultList = toPostfix(map, list);
		    //printList(resultList);//������
		    //��ʼ����
		    System.out.println(calculate(resultList));
		}
	}
	
	//label1: ��������ַ����ֿ�
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
			if(c == '+' || c == '-')//�˴���Ϊ���������߸���,�˴����ԣ���Ϊ��һ��ֻ��һλ��
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
    
    //תΪ��׺���ʽ
    public static LinkedList<Word> toPostfix(Map<Character, Integer> map, LinkedList<Word> list)
    {
    	//��ʼ��׺��Ϊ��׺
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
		    			
	    			}else if( cnum == c2num)//��Ϊ����else�����Ե��´��˺ܾá�
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
	//�����׺���ʽ
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
	//��������
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
	//����
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
