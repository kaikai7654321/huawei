package com.exercise0113;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class IPSort2 {
 
    public static void main(String[] args) throws Exception{
    	
        File file = new File("C:\\Users\\23192\\Desktop\\input2.txt");
	
		Scanner scanner = new Scanner(file);
        //Scanner scanner = new Scanner(System.in);
        int typeA = 0;
        int typeB = 0;
        int typeC = 0;
        int typeD = 0;
        int typeE = 0;
        int errorIpOrMaskCode = 0;
        int privIp = 0;
         
        while (scanner.hasNext()) {
            String ipt = scanner.next();
            String[] ipAndMaskCode = ipt.split("~");
            String ip = ipAndMaskCode[0];
            String maskCode = ipAndMaskCode[1];
            // �жϸ�ʽ
            if (!isValidFormat(ip) || !isValidFormat(maskCode)) {
            	System.out.println("���ϸ�"+ip+";"+maskCode);
                errorIpOrMaskCode++;
                continue;
            }
 
            // �ж������Ƿ����
            if (!validMaskCode(maskCode)) {
            	System.out.println("���ϸ�"+ip+";"+maskCode);
                errorIpOrMaskCode++;
                continue;
            }
 
            // �ж�ip���
            String fnStr = ip.substring(0, ip.indexOf("."));
            int fn = Integer.valueOf(fnStr);
            if (fn >= 1 && fn < 127) {
                // A
                typeA++;
            } else if (fn >= 128 && fn < 192) {
                // B
                typeB++;
            } else if (fn >= 192 && fn < 224) {
                // C
                typeC++;
            } else if (fn >= 224 && fn < 240) {
                // D
                typeD++;
            } else if (fn >= 240 && fn <= 255) {
                // E
                typeE++;
            }
 
            // �ж��Ƿ���˽��IP
            String ipSubStr = ip.substring(ip.indexOf(".") + 1);
            String snStr = ipSubStr.substring(0, ipSubStr.indexOf("."));
            int sn = Integer.valueOf(snStr);
            if (fn == 10 || (fn == 172 && sn >= 16 && sn <= 31) || (fn == 192 && sn == 168)) {
                privIp++;
            }
//          System.out.printf("%d %d%n", fn, sn);
 
        }
        scanner.close();
 
        System.out.printf("%d %d %d %d %d %d %d%n", typeA, typeB, typeC, typeD, typeE, errorIpOrMaskCode, privIp);
 
    }
 
    /**
     * �ж�ip�������Ƿ���xxx.xxx.xxx.xxx��ʽ
     *
     * @param ip
     * @return
     */
    private static boolean isValidFormat(String ip) {
        boolean res = true;
        if (ip == null || "".equals(ip))
            return false;
        Pattern pattern = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$");
        Matcher matcher = pattern.matcher(ip);
         
        if (matcher.matches()) {
            String[] nums = ip.split("\\.");
            for (String num : nums) {
                int n = Integer.valueOf(num);
                if (n < 0 || n > 255) {
                    res = false;
                    break;
                }
            }
        } else {
            res = false;
        }
         
        return res;
    }
 
    /**
     * �ж������Ƿ���ǰ��ȫΪ1����ȫΪ0 �ĸ�ʽ
     *
     * @param maskCode
     * @return
     */
    private static boolean validMaskCode(String maskCode) {
        boolean res = true;
        String[] nums = maskCode.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (String num : nums) {
            int n = Integer.valueOf(num);
            sb.append(binaryString(n));
        }
        int firstIndexOf0 = sb.indexOf("0");
        int lastIndexOf1 = sb.lastIndexOf("1");
        if (firstIndexOf0 < lastIndexOf1) {
            res = false;
        }
        return res;
    }
     
    /**
     * ������ת�ɶ�Ӧ�İ�λ�������ַ���
     * @param num
     * @return
     */
    private static String binaryString(int num) {
        StringBuilder result = new StringBuilder();
        int flag = 1 << 7;
        for (int i = 0; i < 8; i++) {
            int val = (flag & num) == 0 ? 0 : 1;
            result.append(val);
            num <<= 1;
        }
        return result.toString();
    }
 
}
