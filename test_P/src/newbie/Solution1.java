package newbie;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 *
 *
 * * 思路
 * 矩阵是有序的，从左下角来看，向上数字递减，向右数字递增，
 * 因此从左下角开始查找，当要查找数字比左下角数字大时。右移
 * 要查找数字比左下角数字小时，上移
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