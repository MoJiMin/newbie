package Sort;

/**
 * Created by MoJiMin on 2017/3/3.
 */
public class MergeSort {
    /**
     * 将两个有序的数组进行归并，归并后依然有序
     * @param data 数组对象
     * @param left 左数组的第一个元素索引
     * @param center 做数组的最后一个元素索引，center+1是右数组的第一个元素索引
     * @param right 右数组的最后一个元素索引
     */
    private static void merge(DataWarp[] data,int left,int center,int right){
        //定义一个与待排序数组长度相同的临时数组
        DataWarp[] tmpArr = new DataWarp[data.length];
        int mid = center+1;
        //third记录中间数组索引
        int third = left;
        int tmp = left;
        while (left<=center&& mid<=right){
            if (data[left].compareTo(data[mid])<=0){
                tmpArr[third++] = data[left++];
            }else {
                tmpArr[third++] = data[mid++];
            }
        }
        while(mid<=right){
            tmpArr[third++] = data[mid++];
        }
        while (left<=center){
            tmpArr[third++] = data[left++];
        }

        //将中建数组中的内容复制回原数组
        //（原left至right范围内的内容）
        while (tmp<=right){
            data[tmp] = tmpArr[tmp++];
        }
    }


    private static void sort(DataWarp[] data,int left,int right){
        if (left<right){
            int center = (left+right)/2;
            sort(data,left,center);
            sort(data,center+1,right);
            merge(data,left,center,right);
        }
    }

    public static void mergSort(DataWarp[] data){
        sort(data,0,data.length-1);
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
        mergSort(data);
        System.out.println("排序之后：\n"
                + java.util.Arrays.toString(data));
    }
}
