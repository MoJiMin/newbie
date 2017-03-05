package com.Test;

import java.util.Random;

/**
 * Created by MoJiMin on 2016/11/15.
 */
public class shipeiqi {
    private static Random rand =new Random(47);
    public double next() {return rand.nextDouble();}

    public static void main(String[] args){
        shipeiqi rd =new shipeiqi();
        for(int i=0;i<7;i++){
            System.out.print(rd.next() +" ");
        }
    }
}
