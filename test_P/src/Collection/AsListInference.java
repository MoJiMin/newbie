package Collection;

/**
 * Created by MoJiMin on 2016/11/20.
 */

import java.util.*;

class Snow{}
class Power extends Snow{}
class Light extends Power{}
class Heavy extends Power{}
class Crusty extends Snow{}
class Slush extends Snow{}

public class AsListInference {
    public static void main(String[] args){
        List<Snow> snow1 = Arrays.asList(
                new Crusty(),new Slush(),new Power()
        );


        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3,new Light(),new Heavy());

        List<Snow> snow4 =Arrays.<Snow>asList(new Light(),new Heavy());
    }
}
