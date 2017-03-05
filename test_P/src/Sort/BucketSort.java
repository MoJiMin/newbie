package Sort;

/**
 * Created by MoJiMin on 2017/3/3.
 */
public class BucketSort {
    public static void bucketSort(DataWarp[] data,int min,int max){
        System.out.println("开始排序：");
        int arrayLength = data.length;
        DataWarp[] tmp = new DataWarp[arrayLength];
        //buckets数组相当与定义max-min个桶
        //buckets数组用于记录排序元素的信息
        int[] buckets = new int[max-min];
        //记录每个元素在序列中出现的次数
        for (int i=0; i<arrayLength;i++){
            //buckets数组记录了DataWarp出现的次数
            buckets[data[i].data-min]++;
        }
    }
}
