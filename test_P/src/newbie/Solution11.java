package newbie;

/**
 * Created by MoJiMin on 2017/3/4.
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 * ！！！！！！重要思路！！！！！！
 * 对于第n个台阶来说，只能从n-1或者n-2的台阶跳上来，所以
   F(n) = F(n-1) + F(n-2)
   斐波拉契数序列，初始条件
   n=1:只能一种方法
   n=2:两种
 */
public class Solution11 {
    public int JumpFloor(int target) {

        if (target == 1){
            return 1;
        }

        if (target==2){
            return 2;
        }

        int i = 1;
        int tmp1=1;
        int tmp2 =2;
        int result =0;

        while (i<=target-2){
            result = tmp1+tmp2;
            tmp1 = tmp2;
            tmp2 = result;
            i++;
        }
        return result;

    }
}
