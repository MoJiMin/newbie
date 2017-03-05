package Sort;

/**
 * Created by MoJiMin on 2017/3/2.
 */

class DataWarp implements Comparable<DataWarp>{

    int data;
    String flag;
    public DataWarp(int data,String flag){
        this.data = data;
        this.flag = flag;
    }

    public String toString(){
        return data+ flag;
    }

    //根据data实例变量来决定两个DataWarp的大小
    @Override
    public int compareTo(DataWarp dataWarp) {
        return this.data > dataWarp.data ? 1:
                (this.data == dataWarp.data ? 0: -1 );
    }
}

public class SelectSort {
    public static void selectSort(DataWarp[] data) {
        System.out.println("开始排序");
        int arrayLength = data.length;
        //依次进行n-1趟比较，第i趟比较将第i大的值选出放在i位置上
        for (int i = 0; i < arrayLength - 1; i++) {
            //第i个数据只需和它后面的数据比较
            for (int j = i + 1; j < arrayLength; j++) {
                    if (data[i].compareTo(data[j]) > 0) {
                        DataWarp tmp = data[i];
                        data[i] = data[j];
                        data[j] = tmp;
                    }
                }
            System.out.println(java.util.Arrays.toString(data));
            }

        }


    public static void main(String[] args){
        DataWarp[] data = {
                new DataWarp(21,""),
                new DataWarp(30,""),
                new DataWarp(49,""),
                new DataWarp(30,"*"),
                new DataWarp(16,""),
                new DataWarp(9,"")
        };
        System.out.println("排序之前：\n"
            + java.util.Arrays.toString(data));
        selectSort(data);
        System.out.println("排序之后：\n"
            + java.util.Arrays.toString(data));
    }
}