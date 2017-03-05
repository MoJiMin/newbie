package Collection;

/**
 * Created by MoJiMin on 2016/11/22.
 */

import java.util.*;

public class DoubleQueue {
    public static void main(String[] args){
        Random rand =new Random();
        PriorityQueue<Double> DoubleQ =new PriorityQueue<Double>();

        for(int i=0;i<10;i++)

            DoubleQ.offer(rand.nextDouble());

        QuenceDemo.printQ(DoubleQ);
    }
}
