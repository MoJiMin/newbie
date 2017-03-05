package com.Test;

import javafx.beans.binding.When;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * Created by MoJiMin on 2016/11/15.
 */
public class Adapter extends Char_shipeiqi implements Readable {

    private int count;
    public Adapter(int count){ this.count=count;}



    public static void main(String[] args){
        Scanner s =new Scanner(new Adapter(5));
        while (s.hasNext()) {
            System.out.println("+++++++++++++");
            System.out.println(s.next());
        }
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count -- ==0)
            return -1;
        String result = next();
        cb.append(result);
        cb.append(" ");
        return 1;
    }
}
