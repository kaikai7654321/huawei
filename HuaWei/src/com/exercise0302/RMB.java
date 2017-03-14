package com.exercise0302;

/**
 * @title  :  �����ת��
 * @rank   :  101
 * @time   :  2017/3/2
 * 1. ��ʵ˼·��������д����Ҳͦ��д���Լ�����1����Сʱ�����˱ȽϷ�����
 * 2. ���ȿ϶������Ķ�ϰ�߷֡�֮ǰ�ǵ�Ӣ��ת���õ���ÿ��λ��һ�¡���������λ��
 * 3. ��ÿ��λ���棬�Լ�������һ���ܺõķ��������Ƕ����ơ�label1������switch����else if��һ�㡣
 * 4. ����Ԫ������Բ��
 * 5. label����ȫΪС���ġ���Ȼ��ֻ��Ҫ������λ��������ȥ��������εõ���ȷ��С���Ǹ����⡣���ﻹ��û��0.136
 *    �����Ĳ��ԡ�double��scan���������ǶԵģ�����һ�����㣬�ͻ�����ˡ�����������֣�������ķ֡��Լ��Ľ������
 *    ����Math.round��
 * 6. ������λ�νӵ�ʱ��ֻ��Ҫ������һ����λ�����һλ����һ����λ�ĵ�һλ��Ҳ����label3���
 * 7. ������ǿյģ����У�����Ҫ���㡣
 * 8. ͨ���˷���С�����㻯Ϊ������
 */



import java.util.*;

public class RMB 
{
	public static String[] rmb = {"��","Ҽ","��","��","��","��","½","��","��","��","ʰ",
			"��","Ǫ","��","��","Ԫ","��","��","��"};
	
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext())
		{
			double n = scan.nextDouble();
			String s = "�����";
			int n2 = (int)n;
			int temp = (int)( Math.round(n * 100 % 100)) ;//��ȡС������Ϊ����������
			
			//label2 �� �����ֻ��С������ôֱ�����С�����ء�
			if(n2 == 0)
			{
				System.out.println(s + xiaoshu(temp));
				continue;
			}
			
			//����n2�Ĵ�С�ֱ���ú�����
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
			
			//�ж���û��С��
			if(temp < 0.01)
			{
				if(!s.equals(""))
				{
					s = s + "Ԫ��";
				}
			}else
			{
				s = s + "Ԫ" + xiaoshu(temp);
			}
			
			System.out.println(s);
		}
	}
	
	//����С��
	public static String xiaoshu(int d)
	{
		StringBuilder sb = new StringBuilder("");
		int shifen = d / 10;
		int baifen = d % 10;
		
		if(shifen == 0)
		{
			sb.append(rmb[baifen]+"��");
		}else if(baifen == 0)
		{
			sb.append(rmb[shifen]+"��");
		}else if(shifen != 0 && baifen != 0)
		{
			sb.append(rmb[shifen]+"��"+rmb[baifen]+"��");
		}
		
		return sb.toString();
	}
	
	//������Ԫ
	public static String yi(int n)
	{
		//Ĭ�ϴ�����Ԫ��С��Ǫ�ڣ���Ϊǧ��Ҳ�޷���int����
        StringBuilder sb = new StringBuilder("");
		
        //����Ϊ���Ϊ�����֡�
		int yiNum = n / 100000000;
		int wanNum = n % 100000000;
		
		String yiString = yuan(yiNum);
		String wanString = wan(wanNum);
		
		int yiTemp = yiNum % 10;
		int wanTemp = wanNum / 10000000;
		
		//label3
		if(yiTemp == 0 || wanTemp == 0)
		{
			sb.append(yiString).append("����").append(wanString);
		}else
		{
			sb.append(yiString).append("��").append(wanString);
		}
		
		return sb.toString();
	}
	//������Ԫ��
	public static String wan(int n)
	{
		//Ĭ�ϴ�������һ������һ��
		StringBuilder sb = new StringBuilder("");
		
		int wanNum = n / 10000;
		int qianNum = n % 10000;
		
		String wanString = yuan(wanNum);
		String qianString = yuan(qianNum);
		
		int wanTemp = wanNum % 10;
		int qianTemp = qianNum / 1000;
		
		if(wanTemp == 0 || qianTemp == 0)
		{
			sb.append(wanString).append("����").append(qianString);
		}else
		{
			sb.append(wanString).append("��").append(qianString);
		}
		
		return sb.toString();
	}
	
	//����Ԫ
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
			if(shi == 1)//��Ϊ���ֻ��ʮλ���Ͳ��ô�Ҽ�ˡ�
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
