package Generic;

/**
 * Created by MoJiMin on 2016/11/29.
 */
public class CountObject {
    private static long counter =0;
    private final long id =  counter++ ;
    public long id() {return id;}
    public String toString() {return "CountedObject: " +id;}
}
