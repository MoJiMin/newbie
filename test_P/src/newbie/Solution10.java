package newbie;

/**
 * Created by MoJiMin on 2017/3/4.
 * 쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n�
    n<=39
 */
public class Solution10 {
    public static int Fibonacci(int n) {

        if (n==1){
            return 1;
        }

        if (n==0){
            return 0;
        }

        int i = 0;
        int tmp1=0;
        int tmp2 =1;
        int result =0;

        while (i<=n-2){
            result = tmp1+tmp2;
            tmp1 = tmp2;
            tmp2 = result;
            i++;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(Fibonacci(5));
    }
}
