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

    //����dataʵ����������������DataWarp�Ĵ�С
    @Override
    public int compareTo(DataWarp dataWarp) {
        return this.data > dataWarp.data ? 1:
                (this.data == dataWarp.data ? 0: -1 );
    }
}

public class SelectSort {
    public static void selectSort(DataWarp[] data) {
        System.out.println("��ʼ����");
        int arrayLength = data.length;
        //���ν���n-1�˱Ƚϣ���i�˱ȽϽ���i���ֵѡ������iλ����
        for (int i = 0; i < arrayLength - 1; i++) {
            //��i������ֻ�������������ݱȽ�
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
        System.out.println("����֮ǰ��\n"
            + java.util.Arrays.toString(data));
        selectSort(data);
        System.out.println("����֮��\n"
            + java.util.Arrays.toString(data));
    }
}