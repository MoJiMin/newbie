package ServiceFrame;

/**
 * Created by MoJiMin on 2016/12/2.
 */
public class Dog implements Pet {

    public String getMaster() {
        return Master;
    }

    private String Master;


    @Override
    public void master(String name) {
        Master = name;
    }

    @Override
    public void play() {
          System.out.println("WOW!");
    }
}
