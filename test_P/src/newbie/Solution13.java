package newbie;

/**
 * Created by MoJiMin on 2017/3/4.
 * 题目描述
    我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
    请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，
    总共有多少种方法？
 */
public class Solution13 {

    public int RectCover(int target) {

        if (target == 1){
            return 1;
        }
        if (target == 2){
            return 2;
        }

        int i = 3;
        int result =0;
        int tmp1=1;
        int tmp2=2;

        while (i<= target){
            result = tmp1+tmp2;
            tmp1 = tmp2;
            tmp2 = result;
            i++;
        }
        return result;
    }

}
