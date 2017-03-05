package Collection.Tree;

import java.util.Map;

/**
 * Created by MoJiMin on 2017/2/28.
 */
public class ArrayBinTree<T> {
    //ʹ����������¼�������нڵ�
    private Object[] datas;
    private int DEFAULT_DEEP = 8;
    //������������
    private int deep;
    private int arraySize;
    //��Ĭ���������������
    public ArrayBinTree(){
        this.deep = DEFAULT_DEEP;
        this.arraySize = (int)Math.pow(2,deep)-1;
        datas = new Object[arraySize];
    }

    //��ָ�����������������
    public ArrayBinTree(int deep){
        this.deep = deep;
        this.arraySize = (int)Math.pow(2,deep)-1;
        datas = new Object[arraySize];
    }
    //��ָ����ȡ�ָ�����ڵ㴴��������
    public ArrayBinTree(int deep,T data){
        this.deep =deep;
        this.arraySize =(int) Math.pow(2,deep)-1;
        datas = new Object[arraySize];
        datas[0] = data;
    }

    /**
     * Ϊָ���ڵ�����ӽڵ�
     * @param index ��Ҫ����ӽڵ�ĸ��ڵ������
     * @param data ���ӽڵ������
     * @param left �Ƿ�Ϊ��ڵ�
     */

    public void add(int index, T data, boolean left){
        if (datas[index]==null){
            throw new RuntimeException("�˴��ڵ�Ϊ�գ��޷�����ӽڵ㣡");
        }
        if (2*index+1>=arraySize){
            throw new RuntimeException("���׽ڵ��������������Խ���쳣��");
        }
        if (left){
            datas[2*index+1] =data;
        }else {
            datas[2*index+2]=data;
        }
    }

    public boolean empty() {
        return datas[0] == null;
    }

    @SuppressWarnings("unchecked")
    public T root(){
        return (T)datas[0];
    }

    @SuppressWarnings("unchecked")
    public T parent(int index){
        return (T)datas[(index-1)/2];
    }

    public T left(int index){
        if (2*index +1>=arraySize){
            throw new RuntimeException("�ýڵ�ΪҶ�ӽڵ㣬���ӽڵ�");
        }
        return (T)datas[index*2+1];
    }


    public T right(int index){
        if (2*index +1>=arraySize){
            throw new RuntimeException("�ýڵ�ΪҶ�ӽڵ㣬���ӽڵ�");
        }
        return (T)datas[index*2+2];
    }



















}
