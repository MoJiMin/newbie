package Collection;

import java.lang.reflect.Array;
import java.util.*;
import util.TextFile;

/**
 * Created by MoJiMin on 2016/11/21.
 */

public class SetTest {
    public static void main(String[] args){

        int ALL=0;

        List<String> C = new ArrayList<String>(Arrays.asList("a","e","i","o","u","A","E","I","O","U"));
        Set<String> yin =new HashSet<String>(C);
        List<String> word1 = new TextFile("F:\\intellij_Project\\src\\Collection\\SetTest.java","\\W+");
        Set<String> words = new HashSet<String>(word1);
        Map<String,Integer> countword = new HashMap<String,Integer>();

        Iterator it = words.iterator();

        while (it.hasNext()){
            String a = (String) it.next();
            int count = 0;
            for(String s2: a.split("")){
                if(yin.contains(s2))
                    count++;
            }
            countword.put(a,count);
            ALL += count;
        }
        System.out.println(countword.toString());
        System.out.println("All:"+ALL);
    }
}
