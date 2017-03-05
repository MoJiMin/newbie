package StoryCharacter;

/**
 * Created by MoJiMin on 2016/11/25.
 */
public class StoryCharacter {
  	private static long counter = 0;
  	private final long id = counter++;
 	public String toString() {
    		return getClass().getSimpleName() + " " + id;
  	}
 }