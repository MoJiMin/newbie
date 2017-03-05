package FileRead;

import java.io.File;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by MoJiMin on 2016/12/7.
 */


public class SortDirList2b {

    private String[] List;

    public SortDirList2b(String path){
        File FileDir = new File(path);
        List = FileDir.list();
        Arrays.sort(List,String.CASE_INSENSITIVE_ORDER);
    }

    public String[] List(){
        return List;
    }

    public String[] List(String regx){
        Pattern pattern = Pattern.compile(regx);
        ArrayList<String> alist =new ArrayList<String>();

        int count = 0;

        for (String item : List) {
            if (pattern.matcher(item).matches())
                alist.add(item);
            count++;
        }
        return alist.toArray(new String[count]);
    }

    public String toString(){
        StringBuffer buffer =new StringBuffer();

        for (String a : List)
            buffer.append(a+"\n");
        return buffer.toString();
    }

    public static void main(String[] args){
        SortDirList2b sd =new SortDirList2b(".\\src\\FileRead");
        System.out.println(sd);

        System.out.println("*****************");
        String[] list=sd.List(".+\\.java");
        for (String item : list)
            System.out.println(item);
    }
}

