package com.exercise0223;

/**
 * @title  :  24������
 * @rank   :  83
 * @time   :  2017/2/23
 * 1. ����⾹Ȼ����һ���硣��ʵ�����Ѿ���˼·�ˣ����Ҷ�д�Ĳ���ˡ����ǲ����Ű��ˡ��ܾò�д�Թ������Ŀ������
 *    �Ͳ���д����ʵ�޷Ǿ���debug��˭Ҳ�ǲ���һ��ʼ��д�Եĳ���ģ�����debug�ͺ��ˡ�ֻҪ˼·�������ɡ�
 * 2. �������ϵĶ�붼�Ǳ����ⷨ����Ϊ���ֺ�������Ŷ��ǿ��Ա�á���������Ǳ���һ�����䣬��һ��˳��ȡ������ϣ�����Ǳ���
 *    ��˼·��Ȼ�����ƥ���жϼ��ɡ���Ϊjava����û��next_permutation,�����ô˷���Ҫ�Լ�д��������ϡ������򵥡�
 * 3. Ȼ����ǵݹ��˼·�ˡ�����������ĳһ�����ѡ�����Ŀ���Ǻ��Թ�һ����ֱ�ӵݹ飨dfs,bfs��������ͨ�⡣�˷��ؼ�����֮ǰ˵���ģ���ֹ����
 *    ������ѡ�񣬵ݹ飬���ˡ�����һ�㣬���Ƕ�붼����forѭ��������Ҫ��¼·���еġ�������⡣
 * 4. ��ʵ���ַ�������Ҳ���ǵݹ��for������.������������ƣ�Ҳ���ڹ����п��ܻ��֦�������Ż���
 * 5. ����ĿҪ���Ƕ��ֿ��ܣ������һ���ɡ�����ʵ�����ǲ��еġ���ţ�����ϸ��˺ü��Σ�����ͨ���ʴ�0����90%�����ǻ�����һ��û��
 *    ͨ��������4 4 2 7�����������7-4*4*2��ţ�͸����Ĵ�7-4*2*4����˵���������򣬷��´�С�Ŀ�ʼ��������Ϊ���
 *    �˴�������ô��A��J,K�ȵĶ�ӦҲ��Ҫ�ġ����Ծ�û���������Դ˳����ͨ������90%
 * 6. label1, �������Ҫ���˳�����+��-ǰ��Ӧ��ֻҪ50%��ͨ���ʡ�
 * 7. label2��ע�͵ľ������򡣵��Ǵ˴������ᵼ�º�ԭ�����ַ��Բ��ϡ����ӲҪ�ţ�����Ҫ��취��ԭ���Ķ�Ӧ�ϡ�
 * 8. label3,label4����double����Ϊ���������п��ܳ��������ܶ�������ֱ�Ӱ����������ģ��ϸ�˵�ǲ��Եġ���ʹ���ˣ�Ҳ�ǽ���
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
		//��¼��ǰ��ʽ��ֵ
		int result;
		//�洢����ļ����ַ�
		String[] arr ;
		//�洢���������
		int[] arr2;
		//����Ƿ��ù��˴����֡�
		boolean flag[] ;
		
		while(scan.hasNext())
		{
			arr = new String[4];
			
			//���Ǵ�С����ֱ����һ����
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
			
			//�����ս�����б��
			boolean flag2 = true;
			//��¼·��
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
			
			//������
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

	//dfs�� ��Ҫע�����arr2��ʾԭʼ�ַ�����������¼·���õģ�arr��ʾ�������֣�������������main�������÷���
	public static boolean help(String [] arr2,int[] arr, boolean[] flag, double result, LinkedList<String> list2)
	{
		//��ֹ��������������Ҫ���˺����Ǹ����п����ò����ĸ���24�ˣ�����ʽ���ԡ�
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
