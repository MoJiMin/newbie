package Collection.List;

import java.util.Arrays;

/**
 * Created by MoJiMin on 2017/2/27.
 * 实现顺序表的基本操作
 */
public class SequenceList<T> {
    //默认总长度
    private int DEFAULT_SIZE = 16;
    //保存数组的长度
    private int capacity;
    //定义一个数组用于保存顺序线性表的元素
    private Object[] elementData;
    //保存顺序表中元素的当前个数；
    private int size = 0;
    //以默认数组长度创建空顺序线性表
    public SequenceList(){
        capacity = DEFAULT_SIZE;
        elementData = new Object[capacity];
    }
    //以一个初始化元素来创建顺序表
    public SequenceList(T element){
        this();
        elementData[0] = element;
        size++;
    }

    /**
     * 指定长度的数组来创建顺序表
     * @param element 指定顺序线性表中的第一个元素
     * @param initSize 指定顺序线性表底层数组的长度
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
            throw new IndexOutOfBoundsException("线性表索引越界");
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

    //扩充底层数组长度
    private void ensureCapacity(int minCapacity){
        if (minCapacity > capacity){
            while(capacity<minCapacity)
            {
                capacity<<=1;
            }
            elementData = Arrays.copyOf(elementData,capacity);
        }
    }

    //向指定位置插入元素
    public void insert(T element,int index){
        if (index <0 || index>size){
            throw new IndexOutOfBoundsException("线性表索引越界");
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
            throw new IndexOutOfBoundsException("线性表索引越界");
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
