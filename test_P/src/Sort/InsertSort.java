package Sort;

import java.util.Arrays;

/**
 * Created by MoJiMin on 2017/3/2.
 */
public class InsertSort {
    public static void insertSort(DataWarp[] data){
        int arrayLength = data.length;

        System.out.println("排序开始：");
        for (int i=1;i<arrayLength;i++){
            DataWarp tmp = data[i];
            if (data[i].compareTo(data[i-1])<0){
                int j=i-1;
                for (;j>=0&&data[j].compareTo(tmp)>0;j--){
                    data[j+1]=data[j];
                }
                data[j+1] = tmp;
            }
            System.out.println(Arrays.toString(data));
        }
    }

    public static void main(String[] args){
        DataWarp[] data ={
                new DataWarp(9,""),
                new DataWarp(-16,""),
                new DataWarp(21,"*"),
                new DataWarp(23,""),
                new DataWarp(-30,""),
                new DataWarp(-49,""),
                new DataWarp(21,""),
                new DataWarp(30,"*"),
                new DataWarp(30,"")
        };

        System.out.println("排序之前：\n"
                + java.util.Arrays.toString(data));
        insertSort(data);
        System.out.println("排序之后：\n"
                + java.util.Arrays.toString(data));
    }
}
