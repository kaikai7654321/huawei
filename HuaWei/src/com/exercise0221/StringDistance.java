package com.exercise0221;
/**
 * @title  :  �����ַ����ľ���
 * @rank   :  68
 * @time   :  2017/2/21
 * 1. 1)Ѱ��AB��󹫹��Ӵ� 

2)��A/B��󹫹��ִ��޳� ʣ�µ����жԽ��Ժ� ����Ѱ����󹫹��Ӵ� ֱ����󹫹��Ӵ�Ϊ0

3)ʣ�µ�AB�нϳ����ַ������Ⱦ��Ǳ༭����
 * 4. ԭ���Լ�һֱ��lcs��Ȼ������ļ�ȥ����������������仰�������Լ��Ǻ������м��һЩ����ġ�
 * 5. �����ö�̬�滮ֱ���㣬��ʹSD2�����˼·��Ȼ���Լ�д����SD3.SD3�����������Ҫע��ĵط���
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class StringDistance 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("C:\\Users\\23192\\Desktop\\input.txt");
		Scanner scan = new Scanner(file);
		String s1, s2;
		//Scanner scan = new Scanner (System.in);
		int [][]matrix;
		while(scan.hasNext())
		{
			
			s1 = scan.next();
			s2 = scan.next();
			int max = 0;
			if(s1.length()>max) max = s1.length();
			if(s2.length()>max) max = s2.length();
			int result = 0;
			matrix = new int[s1.length()+1][s2.length()+1];
			for(int i = 1; i <= s1.length(); i++)
			{
				char c = s1.charAt(i-1);
				for(int j = 1; j <= s2.length(); j++)
				{
					char c2 = s2.charAt(j-1);
					if(c==c2)
					{
						matrix[i][j] = matrix[i-1][j-1] +1;
						if(matrix[i][j]>result)
							result = matrix[i][j];
					}
					else 
					{
						matrix[i][j] = matrix[i][j-1];
						if(matrix[i-1][j]>matrix[i][j-1])
							matrix[i][j] = matrix[i-1][j];
					}
				}
			}
			System.out.println(max-result);
		}
	}

}
