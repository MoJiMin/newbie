package com.Test;

/**
 * Created by MoJiMin on 11/9/2016.
 */

class super1{
    String name = "mojimin";

   public String getString(){
        return name;
    }
}
class super2 extends super1{
    String name = "MOJIMIN";
    int age = 23;

    public int getInt(){
        return age;
    }

    public String getString(){
        return name;
    }


}
public class Override_Test
{
    public static void main(String[] args){
        super1 a = new super2();
        System.out.println(a.getString());
//        System.out.println(((super2) a).getInt());
        System.out.println();
    }
}
