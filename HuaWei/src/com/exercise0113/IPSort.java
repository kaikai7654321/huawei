package com.exercise0113;
/**
 * @title  识别有效的IP地址和掩码并进行分类统计
 * @rank   14
 * @time   2017/1/13
 * 1. 先去牛客网，这样分高一点。
 * 2. 掩码的英文
 * 3. 又花了许多时间。因为总是有遗漏，然后debug需要很长时间。这应该是自己对计网忘了吧。首先，关于掩码，不能全是255，而且需要
 *    递减。这两点花了两个小时。IPSort是牛客上通过的代码。借助上面的测试用例和代码对比才过。好心酸。不过，debug的能力算是
 *    又找回来了。读取文件等等。之前忘了。这算是收获。
 * 4. 计网需要看看了。
 * 5. IPSort2里面是别人的代码，可以借鉴一下。
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class IPSort 
{
	public static void main(String[] args) throws Exception
	{
//		File file = new File("C:\\Users\\23192\\Desktop\\input2.txt");
//		Scanner scan = new Scanner(file);
		Scanner scan = new Scanner(System.in);
		int count[] =  new int [7];
		while(scan.hasNext())
		{
			String sTemp = scan.next();
			
			String sTemp2[] = sTemp.split("~");
			String ip = sTemp2[0];
			String code = sTemp2[1];
			
			//首先测试错误的。
			String ipArray[] = ip.split("\\.");
			String codeArray[] = code.split("\\.");
			int ipArray2[] =new int[4];
			int codeArray2[] =new int[4];
			
			//格式不对。
			if(ipArray.length!=4||codeArray.length!=4)
			{
				count[5]++;
				continue;
			}else 
			{
				//转为数字。
				for(int i = 0; i < ipArray.length; i++)
				{
					
					ipArray2[i] = Integer.parseInt(ipArray[i]);
					codeArray2[i] = Integer.parseInt(codeArray[i]);
				}
				boolean flag = true;
				//测试错误
				for(int i = 0;flag && i<4; i++)
				{
					int inum = ipArray2[i];
					int cnum = codeArray2[i];
					if(inum>255||inum<0||cnum>255||cnum<0)
					{
						flag = false;
						
					}
					if(cnum!=255&&cnum!=254&&cnum!=252&&cnum!=248&&cnum!=240&&cnum!=224&&cnum!=192
							&&cnum!=128&&cnum!=0)
					{
						
						flag=false;
					}
                    if (i<3&&cnum<codeArray2[i+1])
					{
						
						flag=false;
					}
                    //最后一位是不能是255的。
                    if(codeArray2[3]==255)
                    {
                    	flag=false;
                    }
				}
				if(flag==false)
				{
					count[5]++;
					continue;
				}
			}
			
			int inum2 = ipArray2[0];
			//分类
			if(inum2>=1&&inum2<=126)
			{
				if(inum2==10)
				{
					count[6]++;
					
				}
				count[0]++;
				continue;
			}else if(inum2>=128&&inum2<=191)
			{
				if(inum2 == 172&&ipArray2[1]>=16&&ipArray2[1]<=31)
				{
					count[6]++;
					
				}
				count[1]++;
				continue;
			}else if(inum2>=192&&inum2<=223)
			{
				if(inum2 == 192&&ipArray2[1]==168)
				{
					count[6]++;
					
				}
				count[2]++;
				continue;
			}else if(inum2>=224&&inum2<=239)
			{
				count[3]++;
				continue;
			}else if(inum2>=240&&inum2<=255)
			{
				count[4]++;
				continue;
			}
			
		}
		for(int i = 0; i < 7; i++)
		{
			System.out.print(count[i]);
			if(i!=6)
				System.out.print(" ");
		}
		System.out.println();
	}
	
}
