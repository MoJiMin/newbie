package Sort;

import java.util.Arrays;

/**
 * Created by MoJiMin on 2017/3/2.
 */
public class BubbleSort {
    public static void bubbleSort(DataWarp[] data){
        System.out.println("开始排序！");
        int arraylength = data.length;

        for (int i=0;i<arraylength-1;i++){
            boolean flag = false;

            for (int j =0;j<arraylength-i-1;j++){
                if (data[j].compareTo(data[j+1])>0){
                    DataWarp tmp = data[j];
                    data[j]=data[j+1];
                    data[j+1]=tmp;
                    flag = true;
                }

            }
            System.out.println(Arrays.toString(data));
            if (!flag){
                break;
            }
        }

    }

    public static void main(String[] args){
        DataWarp[] data = {
                new DataWarp(9,""),
                new DataWarp(16,""),
                new DataWarp(21,"*"),
                new DataWarp(23,""),
                new DataWarp(30,""),
                new DataWarp(49,""),
                new DataWarp(21,""),
                new DataWarp(30,"*"),
        };
        System.out.println("排序之前：\n"
                + java.util.Arrays.toString(data));
        bubbleSort(data);
        System.out.println("排序之后：\n"
                + java.util.Arrays.toString(data));
    }
}
