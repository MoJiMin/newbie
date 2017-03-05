package Collection;

/**
 * Created by MoJiMin on 2016/11/20.
 */
import java.util.*;

public class stackTest {

    public static void main(String[] args) {
        int flag =0;
        Stack<String> stack = new Stack<String>();
        String a = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
        for(String s : a.split("")){

            if(flag ==1 ){
                stack.push(s);
                System.out.println("in:"+s);
                flag =0;
            }

            if (flag ==2 ){
                System.out.println("out:"+stack.pop());
                flag =0;
            }

            if(s.equals("+"))
                flag =1;

            if (s.equals("-"))
                flag =2;
        }
    }
}
