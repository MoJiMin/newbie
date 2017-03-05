package Sort;

/**
 * Created by MoJiMin on 2017/3/3.
 */
public class MergeSort {
    /**
     * �����������������й鲢���鲢����Ȼ����
     * @param data �������
     * @param left ������ĵ�һ��Ԫ������
     * @param center ����������һ��Ԫ��������center+1��������ĵ�һ��Ԫ������
     * @param right ����������һ��Ԫ������
     */
    private static void merge(DataWarp[] data,int left,int center,int right){
        //����һ������������鳤����ͬ����ʱ����
        DataWarp[] tmpArr = new DataWarp[data.length];
        int mid = center+1;
        //third��¼�м���������
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

        //���н������е����ݸ��ƻ�ԭ����
        //��ԭleft��right��Χ�ڵ����ݣ�
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
        System.out.println("����֮ǰ��\n"
                + java.util.Arrays.toString(data));
        mergSort(data);
        System.out.println("����֮��\n"
                + java.util.Arrays.toString(data));
    }
}
