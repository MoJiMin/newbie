package Generic;

/**
 * Created by MoJiMin on 2016/11/25.
 */

import typeinfo.pets.*;

public class Hoder3<T> {
    private T a;
    public Hoder3(T a){
        this.a =a;
    }
    public void Set(T a){
        this.a =a;
    }
    public T get(){
        return a;
    }

    public static void main(String[] args){
        Hoder3<Pet> H3 =new Hoder3<Pet>(new Dog("Lucky"));
        Pet a= H3.get();
        System.out.println(a);
    }

}
