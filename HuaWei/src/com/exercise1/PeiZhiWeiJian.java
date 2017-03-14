package com.exercise1;
/*
 * 1. @titile : ≈‰÷√Œƒº˛ª÷∏¥
 * 2. @rank   : 5
 * 3. @time   : 2017/1/10
 * 1. 
 * 
 */
//
//import java.util.*;
//public class PeiZhiWeiJian {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Map<String,Instruction> map = new HashMap<String,Instruction>();
//		List<Instruction> list = new ArrayList<Instruction>();
//		Scanner scan = new Scanner (System.in);
//		String result1 = "reset what";
//		Instruction ins1 = new Instruction(1, "reset",null,result1);
//		list.add(ins1);
//		result1 = "board fault";
//		Instruction ins2 = new Instruction(2, "reset","board",result1);
//		list.add(ins2);
//		result1 = "where to add";
//		Instruction ins3 = new Instruction(2, "board","add",result1);
//		list.add(ins3);
//		result1 = "no board at all";
//		Instruction ins4 = new Instruction(2, "board","delet",result1);
//		list.add(ins4);
//		result1 = "impossible";
//		Instruction ins5 = new Instruction(2, "reboot","backplane",result1);
//		list.add(ins5);
//		result1 = "install first";
//		Instruction ins6 = new Instruction(2, "backplane","abort",result1);
//		list.add(ins6);
//		
//		while(scan.hasNext())
//		{
//			String s = scan.nextLine();
//			//System.out.println(s);
//			String []sTemp = s.split(" ");
//			//System.out.println("size: "+sTemp.length);
//			if(sTemp.length==1)
//			{
//				if(compareString("reset",s)==true)
//				{
//					//System.out.println("≤‚ ‘");
//					System.out.println(list.get(0).result);
//					continue;
//				}
//			}else if(sTemp.length==2)
//			{
//				int t = 0;
//				String result = "";
//				for(int i = 1; i<=5; i++)
//				{
//					Instruction ins = list.get(i);
//					if(compareString(ins.first,sTemp[0]))
//					{
//						if(compareString(ins.second,sTemp[1]))
//						{
//							t++;
//							result=ins.result;
//						}
//					}
//					
//				}
//				if(t==1)
//				{
//					System.out.println(result);
//					continue;
//				}
//			}
//		    System.out.println("unkown command");
//			
//		}
//	}
//	
//	//∆•≈‰∫Ø ˝
//	static boolean compareString(String ins,String input)
//	{
//		boolean flag = true;
//		if(ins.length()<input.length())
//			return false;
//		int index = 0;
//		while(index<input.length())
//		{
//			if(ins.charAt(index)!=input.charAt(index))
//			{
//				return false;
//			}
//			index++;
//		}
//			return flag;
//	}
//
//}
//
//class Instruction
//{
//	public int len;
//	public String first;
//	public String second;
//	public String result;
//	public Instruction(int len,String first,String second,String result)
//	{
//		this.len = len;
//		this.first = first;
//		this.second = second;
//		this.result = result;
//	}
//	
//	
//}
