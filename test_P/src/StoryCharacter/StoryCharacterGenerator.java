package StoryCharacter;

import coffee.CoffeeGenerator;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by MoJiMin on 2016/11/25.
 */
public class StoryCharacterGenerator
                implements Generator<StoryCharacter>,Iterable<StoryCharacter>{
    private Class[] types = { DarthVader.class,Yoda.class,
        LukeSkywalker.class, JabbaTheHut.class
    };

    public StoryCharacterGenerator(){}

    private int size = 0;
    private Random rand =new Random(47);
    public StoryCharacterGenerator(int size){ this.size = size;}

    @Override
    public StoryCharacter next() {
        try {
            return (StoryCharacter)types[rand.nextInt(types.length)].newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    class StoryCharactorIterator implements Iterator<StoryCharacter>{

        int count = size;

        @Override
        public boolean hasNext() {
            return count>0;
        }

        public void remove(){
            throw new UnsupportedOperationException();
        }
        @Override
        public StoryCharacter next() {
            count--;
            return StoryCharacterGenerator.this.next();
        }
    }

    @Override
    public Iterator<StoryCharacter> iterator() {
        return new StoryCharactorIterator();
    }

    public static void main(String[] args){
        StoryCharacterGenerator gen =new StoryCharacterGenerator();
        for (int i=0;i<4;i++)
            System.out.println(gen.next());
        for (StoryCharacter s: new StoryCharacterGenerator(4))
            System.out.println(s);
    }
}
