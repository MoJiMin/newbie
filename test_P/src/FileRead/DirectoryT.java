package FileRead;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * Created by MoJiMin on 2016/12/7.
 */
public class DirectoryT {
    public static File[]
    local(File dir, final String regex) {
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            public boolean accept(File dir, String name) {
                System.out.println("@@@@:"+name);
                return pattern.matcher(
                        new File(name).getName()).matches();
//                return pattern.matcher(name).matches();
            }
        });
    }
    public static File[]
    local(String path, final String regex) { // Overloaded
        return local(new File(path), regex);
    }

    public static void main(String[] args){
        DirectoryT.local(".",".");
    }
}
