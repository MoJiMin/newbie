package ServiceFrame;

import javax.xml.ws.Service;

/**
 * Created by MoJiMin on 2016/12/2.
 */
public class Test {
    public static void main(String[] args){
        Dog dog =new Dog();
        Cat cat =new Cat();

        provider M =new provider(dog);
        Services.registerProvider("Dog",M);
        M.setPet(cat);
        Services.registerProvider("Cat",M);

        Pet a = Services.newInstance("Dog");
        a.play();


    }
}
