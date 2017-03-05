package Collection.List;

import java.util.Arrays;

/**
 * Created by MoJiMin on 2017/2/27.
 * ʵ��˳���Ļ�������
 */
public class SequenceList<T> {
    //Ĭ���ܳ���
    private int DEFAULT_SIZE = 16;
    //��������ĳ���
    private int capacity;
    //����һ���������ڱ���˳�����Ա��Ԫ��
    private Object[] elementData;
    //����˳�����Ԫ�صĵ�ǰ������
    private int size = 0;
    //��Ĭ�����鳤�ȴ�����˳�����Ա�
    public SequenceList(){
        capacity = DEFAULT_SIZE;
        elementData = new Object[capacity];
    }
    //��һ����ʼ��Ԫ��������˳���
    public SequenceList(T element){
        this();
        elementData[0] = element;
        size++;
    }

    /**
     * ָ�����ȵ�����������˳���
     * @param element ָ��˳�����Ա��еĵ�һ��Ԫ��
     * @param initSize ָ��˳�����Ա�ײ�����ĳ���
     */

    public SequenceList(T element,int initSize){
        capacity = 1;
        while(capacity < initSize){
            capacity <<= 1;
        }

        elementData = new Object[capacity];
        elementData[0] = element;
        size++;
    }

    public int length(){
        return size;
    }

    @SuppressWarnings("unchecked")
    public T get(int i){
        if (i<0||i>size-1){
            throw new IndexOutOfBoundsException("���Ա�����Խ��");
        }
        return (T)elementData[i];
    }

    public int locate(T element){
        for (int i=0;i<size;i++){
            if (elementData[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    //����ײ����鳤��
    private void ensureCapacity(int minCapacity){
        if (minCapacity > capacity){
            while(capacity<minCapacity)
            {
                capacity<<=1;
            }
            elementData = Arrays.copyOf(elementData,capacity);
        }
    }

    //��ָ��λ�ò���Ԫ��
    public void insert(T element,int index){
        if (index <0 || index>size){
            throw new IndexOutOfBoundsException("���Ա�����Խ��");
        }

        ensureCapacity(size+1);
        System.arraycopy(elementData,index,elementData,index+1,size-index);
        elementData[index] = element;
        size++;
    }

    public void add(T element){
        insert(element,size);
    }

    public T delete(int index){
        if (index <0|| index>size-1){
            throw new IndexOutOfBoundsException("���Ա�����Խ��");
        }
        T oldValue = (T)elementData[index];
        int numMoved = size -index-1;
        if (numMoved>0){
            System.arraycopy(elementData,index+1,elementData,index,numMoved);
        }

        elementData[--size]=null;
        return oldValue;
    }

    public T remove(){
        return delete(size-1);
    }

    public boolean empty(){
        return size==0;
    }

    public void clear(){
        Arrays.fill(elementData,null);
        size=0;
    }
}
