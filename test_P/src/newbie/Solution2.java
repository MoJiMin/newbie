package newbie;

/**
 * Created by MoJiMin on 2017/2/27.
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 *
 * 思路：通过String自己本身的一些方法，要学会Stringbuffer和String和StringBuilder的应用
 * 思路二：
 * 链接：https://www.nowcoder.com/questionTerminal/4060ac7e3e404ad1a894ef3e17650423
 来源：牛客网

 //思路
 //1：从前往后插入，这样移动·的次数多不建议
 //2：从后往前插入
 class Solution {
 public:
 void replaceSpace(char *str,int length) {
 //遍历一边字符串找出空格的数量
 if(str==NULL||length<0)
 return ;
 int i=0;
 int oldnumber=0;//记录以前的长度
 int replacenumber=0;//记录空格的数量
 while(str[i]!='\0')
 {
 oldnumber++;
 if(str[i]==' ')
 {
 replacenumber++;
 }
 i++;
 }
 int newlength=oldnumber+replacenumber*2;//插入后的长度
 if(newlength>length)//如果计算后的长度大于总长度就无法插入
 return ;
 int pOldlength=oldnumber; //注意不要减一因为隐藏个‘\0’也要算里
 int pNewlength=newlength;
 while(pOldlength>=0&&pNewlength>pOldlength)//放字符
 {
 if(str[pOldlength]==' ') //碰到空格就替换
 {
 str[pNewlength--]='0';
 str[pNewlength--]='2';
 str[pNewlength--]='%';

 }
 else //不是空格就把pOldlength指向的字符装入pNewlength指向的位置
 {
 str[pNewlength--]=str[pOldlength];

 }
 pOldlength--; //不管是if还是elsr都要把pOldlength前移

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
