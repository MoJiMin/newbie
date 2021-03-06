package newbie;

/**
 * Created by MoJiMin on 2017/3/4.
 * 题目：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 输入一个非递减排序的数组(递增？)的一个旋转，输出旋转数组的最小元素。
 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 NOTE：给出的所有元素都大于0!!!!，若数组大小为0，请返回0。
 思路：
 */

public class Solution9 {
    public int minNumberInRotateArray(int [] array) {
        if (array.length>0){
            int pre = 0;

            for (int current = 1;current<array.length;current++){
                if (array[current]<array[0]){
                    return array[current];
                }
                pre=current;
            }
            return array[0];

        }else if (array.length==0){
            return 0;
        }else if (array.length==1){
            return array[0];
        }
        return 0;
    }
}
