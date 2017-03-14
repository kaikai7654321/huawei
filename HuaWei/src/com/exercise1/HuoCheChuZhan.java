package com.exercise1;
/**
 * 1. @title : 火车出站
 * 2. @rank  : 6
 * 3. @time  : 2017/1/10
 * 4. 这里用了大半天，因为感觉想了好久没有想明白。不知道怎么模拟。具体阶段分为，首先第一阶段，觉得同时需要兼顾input和mystack
 *    是有点混乱。后来自己想明白，可以先把input放到myStack里面，这样就只需要看myStack。
 *    还有一点，就是怎么模拟对一个数，可以不出栈，也可以出栈。自己写出来应该是先调用递归，然后是做出选择。但是后来觉得仔细一想整个
 *    过程，就乱了。所以就上午搜了一些别人模拟的程序，感觉还好，消化了。和之前自己写的大致差不多，但是别人写对了。自己差那么一点。
 *    还是没有搞明白。不然不会出现这种情况。
 * 5. 还要注意格式，每行输出的数中间是有空格的。
 * 6. label1哪里用while也是可以的。但是，从整个的思路来说，就是把数据复制两套，这样就解决了两个分支的问题。二者互不影响。就
 *    而每个分支到了下一层还有两个分支。这样很好理解。而且，每层栈都有一套副本。这样，while循环就浪费了。
 * 7. 最后还在linkedList的操作上错了一次。要记着，pop和push操作的都是list最前面的。
 *    
 */

import java.util.*;

public class HuoCheChuZhan {

	static List<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] label = {'1','2','3','4','5','6','7','8','9'};
		
		LinkedList<Character> labelList = new LinkedList<Character>();
		Scanner scan = new Scanner(System.in);
	    //数据输入
		int num = scan.nextInt();
		for(int i = 0; i < num; i++)
		{
			int temp = scan.nextInt();
			//labelList.push(label[temp-1]);
			labelList.addLast(label[temp-1]);
			//labelList.push((char)temp);
		}
		//下面是算法
		outStack(labelList,new LinkedList<Character>(), new String());
		Collections.sort(list);
		for(int i = 0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}

	//需要使用递归模拟，其实
	static void outStack(LinkedList<Character> input,LinkedList<Character> myStack,String output)
	{
	
		if(input.size()<=0)
		{

			while(!myStack.isEmpty())
			{
				if(output.equals(""))
					output = output+myStack.pop();
				else 
				   output = output+" "+myStack.pop();
			}
			//System.out.println("测试： "+output);
			list.add(output);
			return;
		}
		//首先复制
		//LinkedList<Character> input1 = (LinkedList<Character>) input.clone();
		LinkedList<Character> input1 = new LinkedList<Character>(input);
		LinkedList<Character> input2 = new LinkedList<Character>(input);
		//对原来的每个字母，可以出，可以不出。两种状态。
		LinkedList<Character> myStack1 = new LinkedList<Character>(myStack);
		LinkedList<Character> myStack2 = new LinkedList<Character>(myStack);
		//input应该按照队列
		myStack1.push(input1.poll());
		outStack(input1,myStack1,new String(output));
		
		//label1
		//while(!myStack2.isEmpty())
		if(!myStack2.isEmpty())
		{
			if(output.equals(""))
				output = output+myStack2.pop();
			else 
			   output = output+" "+myStack2.pop();
			
			outStack(input2,myStack2,new String(output));
		}
		
	}
}
