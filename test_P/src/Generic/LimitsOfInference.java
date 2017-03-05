package Generic;

/**
 * Created by MoJiMin on 2016/11/27.
 */
import typeinfo.pets.*;

import java.beans.PersistenceDelegate;
import java.util.*;

public class LimitsOfInference {
    static void
    f( Map<Person, List< Pet>> PetPeople) {
        System.out.println(PetPeople);
    }

    public static void main(String[] args){
        f(New.<Person,List<Pet>>map());
    }
}
