package newbie;

/**
 * Created by MoJiMin on 2017/3/4.
 * ��Ŀ����
    ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
    ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ�
    �ܹ��ж����ַ�����
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
