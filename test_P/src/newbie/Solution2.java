package newbie;

/**
 * Created by MoJiMin on 2017/2/27.
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.
 * �򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 *
 * ˼·��ͨ��String�Լ������һЩ������Ҫѧ��Stringbuffer��String��StringBuilder��Ӧ��
 * ˼·����
 * ���ӣ�https://www.nowcoder.com/questionTerminal/4060ac7e3e404ad1a894ef3e17650423
 ��Դ��ţ����

 //˼·
 //1����ǰ������룬�����ƶ����Ĵ����಻����
 //2���Ӻ���ǰ����
 class Solution {
 public:
 void replaceSpace(char *str,int length) {
 //����һ���ַ����ҳ��ո������
 if(str==NULL||length<0)
 return ;
 int i=0;
 int oldnumber=0;//��¼��ǰ�ĳ���
 int replacenumber=0;//��¼�ո������
 while(str[i]!='\0')
 {
 oldnumber++;
 if(str[i]==' ')
 {
 replacenumber++;
 }
 i++;
 }
 int newlength=oldnumber+replacenumber*2;//�����ĳ���
 if(newlength>length)//��������ĳ��ȴ����ܳ��Ⱦ��޷�����
 return ;
 int pOldlength=oldnumber; //ע�ⲻҪ��һ��Ϊ���ظ���\0��ҲҪ����
 int pNewlength=newlength;
 while(pOldlength>=0&&pNewlength>pOldlength)//���ַ�
 {
 if(str[pOldlength]==' ') //�����ո���滻
 {
 str[pNewlength--]='0';
 str[pNewlength--]='2';
 str[pNewlength--]='%';

 }
 else //���ǿո�Ͱ�pOldlengthָ����ַ�װ��pNewlengthָ���λ��
 {
 str[pNewlength--]=str[pOldlength];

 }
 pOldlength--; //������if����elsr��Ҫ��pOldlengthǰ��

 }


 }
 };
 */
public class Solution2 {


    public static String replaceSpace1(StringBuffer str) {

        String s1 = new String(str).replace(" ","%20");
        System.out.println(s1);
        return null;
    }

    public static void main(String[] args){
        Solution2.replaceSpace1(new StringBuffer("We  Are Happy."));
    }
}
