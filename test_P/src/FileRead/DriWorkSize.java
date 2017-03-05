package FileRead;

import java.io.File;

/**
 * Created by MoJiMin on 2016/12/7.
 */
public class DriWorkSize {
    public static void main(String[] args){
        for (File f : Directory.walk(".",".+\\.java").files){
            System.out.println(f.getName()+":  "+ f.length());
        }
    }
}
