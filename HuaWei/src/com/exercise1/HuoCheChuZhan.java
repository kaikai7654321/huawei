package com.exercise1;
/**
 * 1. @title : �𳵳�վ
 * 2. @rank  : 6
 * 3. @time  : 2017/1/10
 * 4. �������˴���죬��Ϊ�о����˺þ�û�������ס���֪����ôģ�⡣����׶η�Ϊ�����ȵ�һ�׶Σ�����ͬʱ��Ҫ���input��mystack
 *    ���е���ҡ������Լ������ף������Ȱ�input�ŵ�myStack���棬������ֻ��Ҫ��myStack��
 *    ����һ�㣬������ôģ���һ���������Բ���ջ��Ҳ���Գ�ջ���Լ�д����Ӧ�����ȵ��õݹ飬Ȼ��������ѡ�񡣵��Ǻ���������ϸһ������
 *    ���̣������ˡ����Ծ���������һЩ����ģ��ĳ��򣬸о����ã������ˡ���֮ǰ�Լ�д�Ĵ��²�࣬���Ǳ���д���ˡ��Լ�����ôһ�㡣
 *    ����û�и����ס���Ȼ����������������
 * 5. ��Ҫע���ʽ��ÿ����������м����пո�ġ�
 * 6. label1������whileҲ�ǿ��Եġ����ǣ���������˼·��˵�����ǰ����ݸ������ף������ͽ����������֧�����⡣���߻���Ӱ�졣��
 *    ��ÿ����֧������һ�㻹��������֧�������ܺ���⡣���ң�ÿ��ջ����һ�׸�����������whileѭ�����˷��ˡ�
 * 7. �����linkedList�Ĳ����ϴ���һ�Ρ�Ҫ���ţ�pop��push�����Ķ���list��ǰ��ġ�
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
	    //��������
		int num = scan.nextInt();
		for(int i = 0; i < num; i++)
		{
			int temp = scan.nextInt();
			//labelList.push(label[temp-1]);
			labelList.addLast(label[temp-1]);
			//labelList.push((char)temp);
		}
		//�������㷨
		outStack(labelList,new LinkedList<Character>(), new String());
		Collections.sort(list);
		for(int i = 0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}

	//��Ҫʹ�õݹ�ģ�⣬��ʵ
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
			//System.out.println("���ԣ� "+output);
			list.add(output);
			return;
		}
		//���ȸ���
		//LinkedList<Character> input1 = (LinkedList<Character>) input.clone();
		LinkedList<Character> input1 = new LinkedList<Character>(input);
		LinkedList<Character> input2 = new LinkedList<Character>(input);
		//��ԭ����ÿ����ĸ�����Գ������Բ���������״̬��
		LinkedList<Character> myStack1 = new LinkedList<Character>(myStack);
		LinkedList<Character> myStack2 = new LinkedList<Character>(myStack);
		//inputӦ�ð��ն���
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
