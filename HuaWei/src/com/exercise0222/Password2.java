package com.exercise0222;

import java.util.Scanner;
public class Password2 {
    public static void main(String[] args) {

        int len;
        int lowercase = 0;
        int uppercase = 0;
        int number = 0;
        int otherletter = 0;
        int score = 0;

        Scanner sca = new Scanner(System.in);
        char ch[] = sca.nextLine().toCharArray();

        len = ch.length;
        for (int i = 0; i < len; i++)
            if (Character.isDigit(ch[i]))
                number++;
            else if (Character.isLowerCase(ch[i]))
                lowercase++;
            else if (Character.isUpperCase(ch[i]))
                uppercase++;
            else
                otherletter++;

        // len
        if (len <= 4)
            score += 5;
        else if (len >= 5 && len <= 7)
            score += 10;
        else 
            score += 25;
        
        // letter
        if ((lowercase + uppercase) == 0)
            score += 0;
        else if (lowercase == 0 || uppercase == 0)
            score += 10;
        else
            score += 20;
        
        // number
        if (number == 0)
            score += 0;
        else if (number == 1)
            score += 10;
        else
            score += 20;
        
        // otherletter
        if (otherletter == 0)
            score += 0;
        else if (otherletter == 1)
            score += 10;
        else
            score += 25;
        
        // other    
        if (lowercase > 0 && uppercase > 0 && number > 0 && otherletter > 0)
            score += 5;
        else if ((lowercase + uppercase) > 0 && number > 0 && otherletter > 0)
            score += 3;
        else if ((lowercase + uppercase) > 0 && number > 0)
            score += 2;

        if (score >= 90)
            System.out.print("VERY_SECURE");
        else if (score >= 80)
            System.out.print("SECURE");
        else if (score >= 70)
            System.out.print("VERY_STRONG");
        else if (score >= 60)
            System.out.print("STRONG");
        else if (score >= 50)
            System.out.print("AVERAGE");
        else if (score >= 25)
            System.out.print("WEAK");
        else
            System.out.print("VERY_WEAK");
    }
}