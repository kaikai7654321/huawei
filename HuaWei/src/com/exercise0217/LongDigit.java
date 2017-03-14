package com.exercise0217;



/**
 * @title  :  在字符串中找出连续最长的数字串
 * @rank   :  54
 * @time   :  2017/2/17
 * 1. 正则表达式非常方便
      Pattern p = Pattern.compile("\\d+");
      Matcher m = p.matcher(str); 
   2. 上面是看到的别人写的，在华为上面。但是自己是直接把longBit的代码拿过来的。
   3. 注意看题。label1哪里就是，如果是0就不输出字串。这是和牛客网不同。小心，有的在牛客网上过的在华为上面不过就是因为此。
   4。 还有一个问题，就是如果两个一样，就是一通输出。
 */


import java.util.*;
public class LongDigit
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s,result ="" ;
		while(scan.hasNext())
		{
			s = scan.next();
			int amount = 0;
			int amount2 = 0;
			int temp1,temp2;
			StringBuilder sb;
			
			for(int i = 0; i < s.length(); i++)
			{
				sb = new StringBuilder("");
				char c = s.charAt(i);
				if(Character.isDigit(c))
				{
					amount2 = 0;
					//label2
					while(Character.isDigit(c))
					{
						sb.append(c+"");
						amount2++;
						i++;
						if(i>=s.length())
							break;
						c = s.charAt(i);
						
					}
					if(amount2>amount)
					{
						amount = amount2;
						result = sb.toString();
					}
					else if(amount2==amount)
					{
						result += sb.toString();
					}
						
					
				}
			}
			//label1
			if(amount==0)
				System.out.println(0);
			else 
			    System.out.println(result+","+amount);
		}
	}

}
