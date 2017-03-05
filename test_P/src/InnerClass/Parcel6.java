package InnerClass;

/**
 * Created by MoJiMin on 2016/11/16.
 */
public class Parcel6 {
    private String s2;

    private void internalTracking(boolean b){
        if (b){
            class TrackingSlip{
                private String id;
                TrackingSlip(String s){
                    id =s;
                }

                String getSlip(){
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("SLIP");
            String s = ts.getSlip();
            s2=s;
        }
    }

//    public static void main(String[] args){
//        Parcel6 p = new Parcel6();
//        System.out.println(p.s2);
//        p.internalTracking(true);
//        System.out.println(p.s2);
//    }
//}

}
