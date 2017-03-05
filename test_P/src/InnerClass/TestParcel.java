package InnerClass;

/**
 * Created by MoJiMin on 2016/11/16.
 */

interface Destination{
    String readLine();
}

class Parcel{
    private class PDestination implements Destination{

        private String label;

        public PDestination(String label){
            this.label=label;
        }

        @Override
        public String readLine() {
            return label;
        }
    }

    public Destination getPDestination(String Label){
        return new PDestination(Label);
    }

    protected class ADestination implements Destination{

        private String name = "MOJIMIN";

        @Override
        public String readLine() {
            return name;
        }
    }

//    public Destination getADestination(){
//        return new ADestination();
//    }
}

public class TestParcel extends Parcel{
    public static void main(String[] args){

        Parcel P =new TestParcel();
        Destination PD = P.getPDestination("Hello,MOJIMIN!");
        System.out.println(PD.readLine());

        Destination AD1 = P.new ADestination();
        System.out.println(AD1.readLine());

        TestParcel.ADestination AD2 =P.new ADestination();
        System.out.println(AD2.readLine());

        Parcel.ADestination AD3 = P.new ADestination();
        System.out.println(AD3.readLine());

    }

}
