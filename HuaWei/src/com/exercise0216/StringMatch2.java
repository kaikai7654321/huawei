package com.exercise0216;

import java.util.*;

public class StringMatch2 {
    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        while(jin.hasNextLine()) {
            String sh = jin.nextLine();
            String lo = jin.nextLine();
            System.out.println(isMatch(sh, lo));
        }
    }
    public static boolean isMatch(String sh, String lo) {
        for(int i = 0; i < sh.length(); i++) {
            if(!lo.contains(Character.toString(sh.charAt(i))))
                return false;
        }
        return true;
    }
}