package FileRead;

/**
 * Created by MoJiMin on 2016/12/7.
 */
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class SortedDirList {
    private String[] dirList;
    public SortedDirList(File dir) {

        //注意，这里的list并没有一开始指定了数组的空间大小

        dirList = dir.list();
        Arrays.sort(dirList, String.CASE_INSENSITIVE_ORDER);
    }

    public String[] list() { return dirList; }

    public String[] list(String regex) {
        Pattern pattern = Pattern.compile(regex);
        ArrayList<String> slist = new ArrayList<String>();
        int count = 0;
        for(String s : dirList) {
            if(pattern.matcher(s).matches()) {
                count++;
                slist.add(s);
            }
        }
        return slist.toArray(new String[count]); //集合转字符串数组
}
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(String s : dirList) sb.append(s + '\n');
        return sb.toString();
    }

    public static void main(String[] args) {
        SortedDirList dirList = new SortedDirList(new File("."+"\\src\\FileRead"));
        //一开始的目前目录
        System.out.println(dirList);

        for(String s : dirList.list())
            System.out.println(s);
        System.out.println();

        for(String s : dirList.list(".+\\.java"))
            System.out.println(s);
    }
}