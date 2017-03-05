package Sort;

import java.util.Arrays;

/**
 * Created by MoJiMin on 2017/3/3.
 */
public class ShellSort {
    public static void shellSort(DataWarp[] data){
        System.out.println("排序开始：");
        int arrayLength = data.length;
        //h变量保存可变增量
        int h=1;

        while (h<=arrayLength/3){
            h = h*3 +1;
        }

        while (h>0){
            System.out.println("===h的值："+h+"===");
            for (int i =h ;i<arrayLength;i++){
                DataWarp tmp =data[i];
                if (data[i].compareTo(data[i-h])<0){
                    int j=i-h;
                    for (;j>=0&&data[j].compareTo(tmp)>0;j-=h){
                        data[j+h] = data[j];
                    }
                    data[j+h] = tmp;
                }
                System.out.println(Arrays.toString(data));
            }
            h=(h-1)/3;
        }
    }

    public static void main(String[] args){
        DataWarp[] data = {
                new DataWarp(9,""),
                new DataWarp(-16,""),
                new DataWarp(21,"*"),
                new DataWarp(23,""),
                new DataWarp(-30,""),
                new DataWarp(-49,""),
                new DataWarp(21,""),
                new DataWarp(30,"*"),
                new DataWarp(30,""),
        };
        System.out.println("排序之前：\n"
                + java.util.Arrays.toString(data));
        shellSort(data);
        System.out.println("排序之后：\n"
                + java.util.Arrays.toString(data));
    }
}
