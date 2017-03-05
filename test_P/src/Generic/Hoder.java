package Generic;

/**
 * Created by MoJiMin on 2016/11/25.
 */

interface person{
    void job();
}

class doctor implements person{

    @Override
    public void job() {
        System.out.println("I am a doctor!");
    }
}

class teacher implements person{

    @Override
    public void job() {
        System.out.println("I am a teacher!");
    }
}

class layer implements person{

    @Override
    public void job() {
        System.out.println("I am a layer!");
    }
}

public class Hoder<T> {
    private T a;
    public Hoder(T a){
        this.a = a;
    }

    public void set(T a){
        this.a =a;
    }

    public T getT(){
        return a;
    }

    public static void main(String[] args){
        Hoder<person> p1 =new Hoder<person>(new doctor() );
        person D = p1.getT();
        D.job();
        p1.set(new layer());
        person L = p1.getT();
        L.job();
        p1.set(new teacher());
        person t = p1.getT();
        t.job();
    }
}
