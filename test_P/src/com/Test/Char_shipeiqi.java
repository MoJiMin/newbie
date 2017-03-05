package com.Test;

import java.util.Random;

/**
 * Created by MoJiMin on 2016/11/15.
 */
public class Char_shipeiqi {
    private  static Random rand =new Random(47);
    private static final char[] capitals =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers =
            "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels =
            "aeiou".toCharArray();


    public String next(){
        String result = null;
           result=""+capitals[rand.nextInt(capitals.length)];
        for (int i=0;i<4;i++) {
            result += vowels[rand.nextInt(vowels.length)];
            result += "" + lowers[rand.nextInt(lowers.length)];
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(new Char_shipeiqi().next());
    }
}
