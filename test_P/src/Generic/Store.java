package Generic;

import util.*;

/**
 * Created by MoJiMin on 2016/12/2.
 */

class Product{
    private final int id;
    private String description;
    private double price;
    public Product(int IDnumber,String descr, double price){
        id = IDnumber;
        description = descr;
        this.price = price;
        System.out.println(toString());
    }
    public String toString(){
        return id +": " +description +", price: $" +price;
    }
    public void priceChange(double change){
        price += change;
    }
}

public class Store {
}
