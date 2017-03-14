package com.exercise0302;

/**
 * @title  :  人民币转换
 * @rank   :  101
 * @time   :  2017/3/2
 * 1. 其实思路很清晰，写起来也挺好写。自己用了1个半小时。除了比较繁琐。
 * 2. 首先肯定按照阅读习惯分。之前那道英文转换用的是每三位分一下。这里是四位。
 * 3. 在每四位里面，自己想起来一个很好的方法，就是二进制。label1哪里用switch比用else if好一点。
 * 4. 这里元，不是圆。
 * 5. label是有全为小数的。当然，只需要考虑两位，其他舍去。但是如何得到精确的小数是个难题。这里还好没有0.136
 *    这样的测试。double用scan读进来，是对的，但是一旦运算，就会近似了。比如明明五分，变成了四分。自己的解决方法
 *    就是Math.round。
 * 6. 两个单位衔接的时候只需要考虑上一个单位的最后一位和下一个单位的第一位，也就是label3哪里。
 * 7. 如果角是空的，分有，不需要加零。
 * 8. 通过乘法吧小数运算化为整数。
 */



import java.util.*;

public class RMB 
{
	public static String[] rmb = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖","拾",
			"佰","仟","万","亿","元","角","分","整"};
	
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext())
		{
			double n = scan.nextDouble();
			String s = "人民币";
			int n2 = (int)n;
			int temp = (int)( Math.round(n * 100 % 100)) ;//提取小数，化为整数操作。
			
			//label2 ： 如果是只有小数，那么直接输出小数返回。
			if(n2 == 0)
			{
				System.out.println(s + xiaoshu(temp));
				continue;
			}
			
			//根据n2的大小分别调用函数。
			if(n2 / 100000000 > 0)
			{
				s = s + yi(n2);
			}else if(n2 / 10000 > 0)
			{
				s = s + wan(n2);
			}else if(n2 > 0)
			{
				s = s + yuan(n2);
			}
			
			//判断有没有小数
			if(temp < 0.01)
			{
				if(!s.equals(""))
				{
					s = s + "元整";
				}
			}else
			{
				s = s + "元" + xiaoshu(temp);
			}
			
			System.out.println(s);
		}
	}
	
	//处理小数
	public static String xiaoshu(int d)
	{
		StringBuilder sb = new StringBuilder("");
		int shifen = d / 10;
		int baifen = d % 10;
		
		if(shifen == 0)
		{
			sb.append(rmb[baifen]+"分");
		}else if(baifen == 0)
		{
			sb.append(rmb[shifen]+"角");
		}else if(shifen != 0 && baifen != 0)
		{
			sb.append(rmb[shifen]+"角"+rmb[baifen]+"分");
		}
		
		return sb.toString();
	}
	
	//处理亿元
	public static String yi(int n)
	{
		//默认大于亿元，小于仟亿，因为千亿也无法用int读。
        StringBuilder sb = new StringBuilder("");
		
        //以亿为界分为两部分。
		int yiNum = n / 100000000;
		int wanNum = n % 100000000;
		
		String yiString = yuan(yiNum);
		String wanString = wan(wanNum);
		
		int yiTemp = yiNum % 10;
		int wanTemp = wanNum / 10000000;
		
		//label3
		if(yiTemp == 0 || wanTemp == 0)
		{
			sb.append(yiString).append("亿零").append(wanString);
		}else
		{
			sb.append(yiString).append("亿").append(wanString);
		}
		
		return sb.toString();
	}
	//处理万元：
	public static String wan(int n)
	{
		//默认传过来的一定大于一万
		StringBuilder sb = new StringBuilder("");
		
		int wanNum = n / 10000;
		int qianNum = n % 10000;
		
		String wanString = yuan(wanNum);
		String qianString = yuan(qianNum);
		
		int wanTemp = wanNum % 10;
		int qianTemp = qianNum / 1000;
		
		if(wanTemp == 0 || qianTemp == 0)
		{
			sb.append(wanString).append("万零").append(qianString);
		}else
		{
			sb.append(wanString).append("万").append(qianString);
		}
		
		return sb.toString();
	}
	
	//处理元
	public static String yuan(int n)
	{
		int amount = 0;
		StringBuilder sb = new StringBuilder("");
		n = n % 10000;
		
		int ge = n % 10;
		n = n / 10;
		amount += (ge == 0 ? 0 : 1) * Math.pow(2, 0);
		
		int shi = n % 10; 
		n = n / 10;
		amount += (shi == 0 ? 0 : 1) * Math.pow(2, 1);
		
		int bai = n % 10; 
		amount += (bai == 0 ? 0 : 1) * Math.pow(2, 2);
		
		int qian = n / 10;
		amount += (qian == 0 ? 0 : 1) * Math.pow(2, 3);
		
		//label1
		switch(amount)
		{
		case 15: 
			sb.append(rmb[qian]+rmb[12]+rmb[bai]+rmb[11]+rmb[shi]+rmb[10]+rmb[ge]);break;
		case 14: 
			sb.append(rmb[qian]+rmb[12]+rmb[bai]+rmb[11]+rmb[shi]+rmb[10]);break;
		case 13: 
			sb.append(rmb[qian]+rmb[12]+rmb[bai]+rmb[11]+rmb[0]+rmb[ge]);break;
		case 12: 
			sb.append(rmb[qian]+rmb[12]+rmb[bai]+rmb[11]);break;
		case 11: 
			sb.append(rmb[qian]+rmb[12]+rmb[0]+rmb[shi]+rmb[10]+rmb[ge]);break;
		case 10: 
			sb.append(rmb[qian]+rmb[12]+rmb[0]+rmb[shi]+rmb[10]);break;
		case 9: 
			sb.append(rmb[qian]+rmb[12]+rmb[0]+rmb[ge]);break;
		case 8: 
			sb.append(rmb[qian]+rmb[12]);break;
		case 7: 
			sb.append(rmb[bai]+rmb[11]+rmb[shi]+rmb[10]+rmb[ge]);break;
		case 6: 
			sb.append(rmb[bai]+rmb[11]+rmb[shi]+rmb[10]);break;
		case 5: 
			sb.append(rmb[bai]+rmb[11]+rmb[0]+rmb[ge]);break;
		case 4: 
			sb.append(rmb[bai]+rmb[11]);break;
		case 3: 
			if(shi == 1)//因为如果只有十位，就不用带壹了。
			{
				sb.append(rmb[10]+rmb[ge]);
			}else
			{
				sb.append(rmb[shi]+rmb[10]+rmb[ge]);
			}
			break;
		case 2: 
			sb.append(rmb[shi]+rmb[10]);break;
		case 1: 
			sb.append(rmb[ge]);break;
		}
		
		return sb.toString();
	}

}
