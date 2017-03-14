package com.exercise0113;
/**
 * @title  ʶ����Ч��IP��ַ�����벢���з���ͳ��
 * @rank   14
 * @time   2017/1/13
 * 1. ��ȥţ�����������ָ�һ�㡣
 * 2. �����Ӣ��
 * 3. �ֻ������ʱ�䡣��Ϊ��������©��Ȼ��debug��Ҫ�ܳ�ʱ�䡣��Ӧ�����Լ��Լ������˰ɡ����ȣ��������룬����ȫ��255��������Ҫ
 *    �ݼ��������㻨������Сʱ��IPSort��ţ����ͨ���Ĵ��롣��������Ĳ��������ʹ���ԱȲŹ��������ᡣ������debug����������
 *    ���һ����ˡ���ȡ�ļ��ȵȡ�֮ǰ���ˡ��������ջ�
 * 4. ������Ҫ�����ˡ�
 * 5. IPSort2�����Ǳ��˵Ĵ��룬���Խ��һ�¡�
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
			
			//���Ȳ��Դ���ġ�
			String ipArray[] = ip.split("\\.");
			String codeArray[] = code.split("\\.");
			int ipArray2[] =new int[4];
			int codeArray2[] =new int[4];
			
			//��ʽ���ԡ�
			if(ipArray.length!=4||codeArray.length!=4)
			{
				count[5]++;
				continue;
			}else 
			{
				//תΪ���֡�
				for(int i = 0; i < ipArray.length; i++)
				{
					
					ipArray2[i] = Integer.parseInt(ipArray[i]);
					codeArray2[i] = Integer.parseInt(codeArray[i]);
				}
				boolean flag = true;
				//���Դ���
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
                    //���һλ�ǲ�����255�ġ�
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
			//����
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
