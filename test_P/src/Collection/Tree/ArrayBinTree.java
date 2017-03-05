package Collection.Tree;

import java.util.Map;

/**
 * Created by MoJiMin on 2017/2/28.
 */
public class ArrayBinTree<T> {
    //使用数组来记录该树所有节点
    private Object[] datas;
    private int DEFAULT_DEEP = 8;
    //保存该树的深度
    private int deep;
    private int arraySize;
    //以默认深度来创建该树
    public ArrayBinTree(){
        this.deep = DEFAULT_DEEP;
        this.arraySize = (int)Math.pow(2,deep)-1;
        datas = new Object[arraySize];
    }

    //以指定深度来创建二叉树
    public ArrayBinTree(int deep){
        this.deep = deep;
        this.arraySize = (int)Math.pow(2,deep)-1;
        datas = new Object[arraySize];
    }
    //以指定深度、指定根节点创建二叉树
    public ArrayBinTree(int deep,T data){
        this.deep =deep;
        this.arraySize =(int) Math.pow(2,deep)-1;
        datas = new Object[arraySize];
        datas[0] = data;
    }

    /**
     * 为指定节点添加子节点
     * @param index 需要添加子节点的父节点的索引
     * @param data 新子节点的数据
     * @param left 是否为左节点
     */

    public void add(int index, T data, boolean left){
        if (datas[index]==null){
            throw new RuntimeException("此处节点为空，无法添加子节点！");
        }
        if (2*index+1>=arraySize){
            throw new RuntimeException("树底节点的数组已满，树越界异常！");
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
            throw new RuntimeException("该节点为叶子节点，无子节点");
        }
        return (T)datas[index*2+1];
    }


    public T right(int index){
        if (2*index +1>=arraySize){
            throw new RuntimeException("该节点为叶子节点，无子节点");
        }
        return (T)datas[index*2+2];
    }



















}
