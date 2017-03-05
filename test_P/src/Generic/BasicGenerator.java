package Generic;

import StoryCharacter.Generator;

/**
 * Created by MoJiMin on 2016/11/29.
 */

public class BasicGenerator<T>  implements Generator<T>{
    private Class<T> type;

    public BasicGenerator(Class<T> type){ this.type = type;}
    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> Generator<T> create(Class<T> type){
        return new BasicGenerator<T>(type);
    }
}
