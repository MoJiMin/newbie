package newbie;

/**
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������
 * ÿһ�ж����մ��ϵ��µ�����˳�����������һ��������
 * ����������һ����ά�����һ���������ж��������Ƿ��и�����
 *
 *
 * * ˼·
 * ����������ģ������½��������������ֵݼ����������ֵ�����
 * ��˴����½ǿ�ʼ���ң���Ҫ�������ֱ����½����ִ�ʱ������
 * Ҫ�������ֱ����½�����Сʱ������
 */

public class Solution1 {

    public static boolean Find(int target, int [][] array) {

        if(array!=null){
            int col = array[0].length-1;
            int row = array.length-1;

            int R=row;
            int C=0;

            while(R>=0&&C<=col){
                if(target>array[R][C]){
                    C++;
                }else if(target<array[R][C]){
                    R--;
                }else if(target==array[R][C]){
                    return true;
                }

            }

        }
        return false;
    }


    public static void main(String[] args){
       int[][] a= {{1,2,8,9},
                    {2,4,9,12},
                    {4,7,10,13},
                    {6,8,11,15}
        };

        System.out.println(Find(7,a));

    }
}