package newbie;

/**
 * Created by MoJiMin on 2017/3/4.
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
 * �����������һ��n����̨���ܹ��ж�����������
 *
 * ��������������Ҫ˼·������������
 * ���ڵ�n��̨����˵��ֻ�ܴ�n-1����n-2��̨��������������
   F(n) = F(n-1) + F(n-2)
   쳲����������У���ʼ����
   n=1:ֻ��һ�ַ���
   n=2:����
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
