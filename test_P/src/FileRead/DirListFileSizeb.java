package FileRead;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * Created by MoJiMin on 2016/12/7.
 */

class filter implements FilenameFilter{
    private Pattern pattern;

    public filter(String regex){
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}

public class DirListFileSizeb {
    public static void main(String[] args){
        String path = ".//src//FileRead";
        File file = new File(path);
        String[] list;
        if (args.length == 0)
            list = file.list();
        else
        {
            list = file.list(new filter(args[0]));
            for (String item : list)
            {
                 File f2 =new File(path +"//"+item);
                 System.out.println(item+ ":  "+f2.length());
            }
        }
    }
}
