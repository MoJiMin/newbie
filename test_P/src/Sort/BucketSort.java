package Sort;

/**
 * Created by MoJiMin on 2017/3/3.
 */
public class BucketSort {
    public static void bucketSort(DataWarp[] data,int min,int max){
        System.out.println("��ʼ����");
        int arrayLength = data.length;
        DataWarp[] tmp = new DataWarp[arrayLength];
        //buckets�����൱�붨��max-min��Ͱ
        //buckets�������ڼ�¼����Ԫ�ص���Ϣ
        int[] buckets = new int[max-min];
        //��¼ÿ��Ԫ���������г��ֵĴ���
        for (int i=0; i<arrayLength;i++){
            //buckets�����¼��DataWarp���ֵĴ���
            buckets[data[i].data-min]++;
        }
    }
}
