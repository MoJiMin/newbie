package Sort;



/**
 * Created by MoJiMin on 2017/3/2.
 */
public class HeapSort {
    //��data�����0��LastIndex���󶥶�
    private static void buildMaxHeap(DataWarp[] data,int lastIndex){
        //�����һ���ڵ�ĸ��ڵ㿪ʼ
        for (int i = (lastIndex-1)/2;i>=0;i--){
            //�Ѹ��ڵ��¼����
            int k =i;
            //�����ǰ�ڵ����
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

    //��������
    private static void swap (DataWarp[] data,int i,int j){
        DataWarp tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    //������
    public static void heapSort(DataWarp[] data){
        System.out.println("��ʼ����!");
        int arraySize = data.length;
        //ѭ������
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
        System.out.println("����֮ǰ��\n"
                + java.util.Arrays.toString(data));
        heapSort(data);
        System.out.println("����֮��\n"
                + java.util.Arrays.toString(data));
    }
}
