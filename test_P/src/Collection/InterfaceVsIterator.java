package Collection;

import java.util.Iterator;

/**
 * Created by MoJiMin on 2016/11/22.
 */
public class InterfaceVsIterator {
    public static void display(Iterator<String> it){
        while(it.hasNext()){
            System.out.println("The element is:" + (String) it.next());

        }
    }
}
