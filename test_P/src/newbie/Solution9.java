package newbie;

/**
 * Created by MoJiMin on 2017/3/4.
 * ��Ŀ����һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 ����һ���ǵݼ����������(������)��һ����ת�������ת�������СԪ�ء�
 ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 NOTE������������Ԫ�ض�����0!!!!���������СΪ0���뷵��0��
 ˼·��
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
