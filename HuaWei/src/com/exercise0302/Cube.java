/**
 * @title  :  ���������
 * @rank   :  100
 * @time   :  2017/3/2
 * 
 * 1. �Լ�Ū������̩��չ��ʽ�����ǻ���û������ţ�ٷ�����������֮�������ˣ����ǻ����޷�д������
 *    ��Ϊ����û���������ס����㷽������ıƽ����ǰ�ѧ�ˡ���֪��y�������ʲô��
 */

package com.exercise0302;

import java.text.DecimalFormat;
import java.util.*;

public class Cube 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext())
		{
			double n = scan.nextDouble();
			
			System.out.println(getCubeRoot(n));
			
			
		}
	}
	
	
		public static double getCubeRoot(double input) 
		{
			double x0 = 1;
		    double x1 = x0 - (x0 * x0 * x0 - input) / (3 * x0 * x0);
			while (Math.abs(x1 - x0) > 0.000001) 
			{
				x0 = x1;
				x1 = x0 - (x0 * x0 * x0 - input) / (3 * x0 * x0);
		    }
			DecimalFormat df = new DecimalFormat("#0.0");
			return Double.parseDouble(df.format(x1));
		}

}
