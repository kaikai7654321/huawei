package com.exercise0112;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main 
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
			//System.out.println("≤‚ ‘"+sTemp);
			String sTemp2[] = sTemp.split("~");
			String ip = sTemp2[0];
			String code = sTemp2[1];
			//System.out.println("ip: "+ip);
			// ◊œ»≤‚ ‘¥ÌŒÛµƒ°£
			String ipArray[] = ip.split("\\.");
			String codeArray[] = code.split("\\.");
			int ipArray2[] =new int[4];
			int codeArray2[] =new int[4];
			
			//System.out.println("≤‚ ‘2£∫ "+ipArray.length);
			if(ipArray.length!=4||codeArray.length!=4)
			{
				count[5]++;
				continue;
			}else 
			{
				for(int i = 0; i < ipArray.length; i++)
				{
					//System.out.println("≤‚ ‘1£∫ "+ipArray.length);
					ipArray2[i] = Integer.parseInt(ipArray[i]);
					codeArray2[i] = Integer.parseInt(codeArray[i]);
				}
				boolean flag = true;
				for(int i = 0;flag && i<4; i++)
				{
					int inum = ipArray2[i];
					int cnum = codeArray2[i];
					if(inum>255||inum<0||cnum>255||cnum<0)
					{
						flag = false;
						//System.out.println("≤‚ ‘5");
					}
					if(cnum!=255&&cnum!=254&&cnum!=252&&cnum!=248&&cnum!=240&&cnum!=224&&cnum!=192
							&&cnum!=128&&cnum!=0)
					{
						//System.out.println("≤‚ ‘4");
						flag=false;
					}
                    if (i<3&&cnum<codeArray2[i+1])
					{
						//System.out.println("≤‚ ‘4");
						flag=false;
					}
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
			//System.out.println("≤‚ ‘3");
			int inum2 = ipArray2[0];
			//∑÷¿‡
			if(inum2>=1&&inum2<=126)
			{
				if(inum2==10)
				{
					count[6]++;
					//System.out.println("≤‚ ‘£∫"+ip+","+code);
				}
				count[0]++;
				continue;
			}else if(inum2>=128&&inum2<=191)
			{
				if(inum2 == 172&&ipArray2[1]>=16&&ipArray2[1]<=31)
				{
					count[6]++;
					//System.out.println("≤‚ ‘£∫"+ip+","+code);
				}
				count[1]++;
				continue;
			}else if(inum2>=192&&inum2<=223)
			{
				if(inum2 == 192&&ipArray2[1]==168)
				{
					count[6]++;
					//System.out.println("≤‚ ‘£∫"+ip+","+code);
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
