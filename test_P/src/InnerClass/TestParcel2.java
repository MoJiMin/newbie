package InnerClass;

/**
 * Created by MoJiMin on 2016/11/16.
 */
public class TestParcel2 {
   public Destination destination(String s){
       class PDestination implements Destination{
           private String label;
           private PDestination(String whereTo){
               label = whereTo;
           }

           @Override
           public String readLine() {
               return label;
           }
       }
       return new PDestination(s);
   }

   public static void main(String[] args){
       TestParcel2 P1 = new TestParcel2();
       Destination PD =P1.destination("MOJIMIN");

       System.out.println(PD.readLine());
   }
}
