package com.exercise0112;
/**
 * @title  �򵥴����¼
 * @author 23192
 * @rank   13
 * @time   2017/1/12
 * 1. ���������'\'������������Ҫ��split('\\\\')�ſ��ԡ�
 * 2. �����ļ�������ֱ�ӿո�ֹһ����split�������ֱ����������ʽ��
 * 3. ���������ǿ��Թ��ġ���ţ�����ϵ����������Ǻ��ź����޷�ͨ����
 * 4. �о���ʼ�ܶ�û���뵽����������ţ���ϱ��˵Ĵ��룬�о��ü�ࡣԭ��һ��linkedHashMap���ɡ������Լ�̫��֪�����´���д��
 *    ̫������Խ������Խ��Ҫ���Ǻܶ��¡�
 * 5. ����Ҳ��Ҫע�⡣
 * 6. ac���뿴ErrorRecord2
 * 7. label1,�����������붼�ǿ��Եġ�
 * 8. ���˲²�Ҳ������Ϊ�Լ�û�а��ղ����˳Ѷ���������ԲŴ�ġ�
 * 9. 
 */
/*��������
ȥţ����
 */

import java.util.*;

public class ErrorRecord
{

	public static void main(String[] args)
	{
		Map<String,Integer> map = new HashMap<String,Integer>();
		Scanner scan = new Scanner(System.in);
		LinkedList<String> list = new LinkedList<String>();
		while(scan.hasNext())
		{
			//label1
			//String row = scan.nextLine();
			//String sTemp[] = row.split(" +");
			//String addr = sTemp[0];
			//String rowNum = sTemp[1];
			String addr = scan.next();
			int rowNum = scan.nextInt();
			String sTemp2[] = addr.split("\\\\");
			String fileName = addr;
			if(sTemp2.length>1)
			 fileName= sTemp2[sTemp2.length-1];
			
			if(fileName.length()>16)
			{
				fileName = fileName.substring(fileName.length()-16, fileName.length());
			}
			String item = fileName+" "+rowNum;
			if(map.containsKey(item))
			{
				map.put(item, map.get(item)+1);
			}else 
			{
				map.put(item, 1);
			}
			list.addLast(item);
			if(map.size()>8)
			{
				//list = new ArrayList<String>(list.subList(list.size()-8, list.size()));
				
				String sTemp4 = list.poll();
				//System.out.println("Ҫɾ���ģ� "+sTemp4+" : "+map.get(sTemp4.toString()));
				map.remove(sTemp4.toString());
				for(int i = 0; i <list.size(); i++)
				{
					String sTemp5 = list.get(i);
					if(sTemp5.equals(sTemp4))
					{
						list.remove(i);
					}
				}
			}
		}
		
		Set set = map.keySet();
		Iterator iter = set.iterator();
		while(iter.hasNext())
		{
			String item = (String) iter.next();
			int t = map.get(item);
			System.out.println(item+" "+t);
		}

	}

}


