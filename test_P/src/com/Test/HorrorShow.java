package com.Test;

/**
 * Created by MoJiMin on 2016/11/15.
 * 实验多继承的向上转型问题
 */

interface Monster{
    void menace();
}

interface DangerousMonster extends Monster{
    void destory();
}

interface Lethal{
    void kill();
}

class DragonZilla implements DangerousMonster{
    public void addtional(){}
    public void destory() {}
    public void menace() {}
}

interface Vampire extends DangerousMonster, Lethal{
    void drinkBlood();
}

class VeryBadVampire implements Vampire{
    public void menace() {}
    public void destory() {}
    public void drinkBlood() {}
    public void kill() {}

}

public class HorrorShow {
    static void u(Monster b) {b.menace(); }
    static void v(DangerousMonster d){
        d.menace();
        d.destory();
    }

    static void w(Lethal l) {l.kill();}

    public static void main(String[] args){
        DangerousMonster barrney =new DragonZilla();
        u(barrney);
        v(barrney);

    }

}
