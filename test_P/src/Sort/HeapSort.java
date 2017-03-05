package Sort;



/**
 * Created by MoJiMin on 2017/3/2.
 */
public class HeapSort {
    //对data数组从0到LastIndex建大顶堆
    private static void buildMaxHeap(DataWarp[] data,int lastIndex){
        //从最后一个节点的父节点开始
        for (int i = (lastIndex-1)/2;i>=0;i--){
            //把父节点记录起来
            int k =i;
            //如果当前节点存在
            while(2*k+1<= lastIndex){
                int biggerIndex = 2*k+1;
                if (biggerIndex<lastIndex){
                    if (data[biggerIndex].compareTo(data[biggerIndex+1])<0){
                        biggerIndex = biggerIndex+1;
                    }
                }
                if (data[k].compareTo(data[biggerIndex])<0){
                    swap(data,k,biggerIndex);
                    k=biggerIndex;
                }else {
                    break;
                }

            }
        }
    }

    //交换函数
    private static void swap (DataWarp[] data,int i,int j){
        DataWarp tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    //排序函数
    public static void heapSort(DataWarp[] data){
        System.out.println("开始排序!");
        int arraySize = data.length;
        //循环建堆
        for (int i=0;i<arraySize-1;i++){
            buildMaxHeap(data,arraySize-1-i);
            swap(data,0,arraySize-i-1);
            System.out.println(java.util.Arrays.toString(data));
        }
    }

    public static void main(String[] args){
        DataWarp[] data = {
                new DataWarp(21,""),
                new DataWarp(30,""),
                new DataWarp(49,""),
                new DataWarp(30,"*"),
                new DataWarp(21,"*"),
                new DataWarp(16,""),
                new DataWarp(9,"")
        };
        System.out.println("排序之前：\n"
                + java.util.Arrays.toString(data));
        heapSort(data);
        System.out.println("排序之后：\n"
                + java.util.Arrays.toString(data));
    }
}
