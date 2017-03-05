package ClassFORNSME;

import java.awt.*;

/**
 * Created by MoJiMin on 2016/11/25.
 */

interface shape{ void draw();}

class shape2{
    static {
        System.out.println("Hello!");
    }
}

class Cricle extends shape2 implements shape{

    @Override
    public void draw() {
        System.out.println("I have draw a cricle");
    }
}



public class UpTest {
    public static void main(String[] args){
        Class c =null;


        c=Cricle.class;
        System.out.println(c);


        Object a =null;
        try {
             a = c.newInstance();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println("The class of a:"+a.getClass());
        ((shape)a).draw();

    }
}
