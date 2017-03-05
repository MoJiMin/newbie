package Collection.List;

import java.util.LinkedList;

/**
 * Created by MoJiMin on 2017/2/27.
 */
public class LinkList<T> {

    private class Node{
        private T data;
        private Node next;

        public Node(){}
        public Node(T data,Node next){
            this.data =data;
            this.next = next;
        }
        }


        private Node header;
        private Node tail;
        private int size;

        public LinkList(){
            header =null;
            tail =null;
        }

        public LinkList(T element){
            header = new Node(element,null);
            tail =null;
            size++;
        }

        public int length(){
            return size;
        }

        private Node getNodeByIndex(int index){
            if (index>size-1 || index<0){
                throw new IndexOutOfBoundsException("链式表索引越界");
            }
            Node current=header;
            for (int i=0;i<size&&current!=null;i++,current=current.next){
                if (i == index)
                    return current;
            }
            return null;
        }

        public T get(int index){
            return getNodeByIndex(index).data;
        }

        public int locate(T element){
            Node current = header;
            for (int i=0;i<size-1&&current!=null;i++,current=current.next){
                if (current.data.equals(element))
                    return i;
            }

            return -1;
        }

        //尾插法
        public void add(T element){
            if (header== null){
                header = new Node(element,null);
                tail =null;
            }else {
                Node newNode = new Node(element,null);
                tail.next =newNode;
                tail = newNode;
            }

            size++;
        }

        //头插法
    public void addAtHeader(T element){
        header = new Node(element,header);
        if (tail==null){
            tail = header;
        }
        size++;
    }

    //向链式表指定位置插入一个元素
    public void insert(T element,int index){
        if (index<0||index>size-1){
            throw  new IndexOutOfBoundsException("链式表索引出错");
        }
        if(header==null){
            add(element);
        }else {
            if (index==0){
                addAtHeader(element);
            }else {
                Node prev = getNodeByIndex(index-1);
                prev.next=new Node(element,prev.next);
                size++;
            }
        }
    }

    public T delete(int index){
        if(index<0||index>size-1){
            throw new IndexOutOfBoundsException("脸型表索引错误");
        }
        Node del = null;
        if (index==0){
            del=header;
            header=header.next;
        }else {
            Node pre = getNodeByIndex(index-1);
            del=pre.next;
            pre.next=del.next;
            del.next=null;
        }
        size--;
        return del.data;
    }

    public T remove(){
        return delete(size-1);
    }
    }

