package Collection.List;

import java.util.Arrays;

/**
 * Created by MoJiMin on 2017/2/28.
 */
public class LoopQueue<T> {

    private int DEFULT_SIZE =10;

    private int capacity;

    private Object[] elementData;

    private int front = 0;
    private int rear = 0;

    public LoopQueue(){
        capacity =DEFULT_SIZE;
        elementData = new Object[capacity];
    }

    public LoopQueue(T element){
        this();
        elementData[0] = element;
        rear++;
    }

    public LoopQueue(T element,int initSize){
        this.capacity = initSize;
        elementData =new Object[capacity];
        elementData[0]=element;
        rear++;
    }


    public int length(){
        if (empty()){
            return 0;
        }
        return rear>front ? rear -front: capacity-(front-rear);
    }

    public void add(T element){
        if (rear == front&& elementData[front]!=null){

            throw new IndexOutOfBoundsException("队列已满！");
        }

        elementData[rear++] = element;

        //如果队列已经到头了，那就转头
        rear = rear == capacity ? 0:rear;
    }

    public T remove(){
        if (empty()){
            throw new IndexOutOfBoundsException("队列异常！");
        }
        T oldValue  = (T) elementData[front];
        elementData[front++] = null;

        front = front == capacity? 0 : front;
        return  oldValue;
    }

    public T element(){
        if (empty()){
            throw new IndexOutOfBoundsException("队列空异常!");
        }

        return (T)elementData[front];
    }

    public boolean empty(){
        return rear == front && elementData[front]==null;
    }

    public void clear(){
        Arrays.fill(elementData,null);
        front=0;
        rear=0;
    }
}
