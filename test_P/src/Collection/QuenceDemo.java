package Collection;

/**
 * Created by MoJiMin on 2016/11/21.
 */
import java.util.*;

public class QuenceDemo {
    public static void printQ(Queue quence){
        while(quence.peek()!=null)
            System.out.print(quence.remove()+" ");
        System.out.println();
    }

    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<Integer>();
        Random rand =new Random(47);
        for(int i=0;i<10;i++)
            queue.offer(rand.nextInt(i+10));
        printQ(queue);

        Queue<Character> qc =new LinkedList<Character>();
        for (char c:"Brontosaurus".toCharArray())
            qc.offer(c);
        printQ(qc);
    }
}
