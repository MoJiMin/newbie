package Collection.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MoJiMin on 2017/2/28.
 */
public class TreeChild<E> {
    private static class SonNode{

        //��¼��ǰ�ڵ��λ��
        private int pos;
        private SonNode next;
        public SonNode(int pos,SonNode next){
            this.pos=pos;
            this.next=next;
        }
    }

    public static class Node<T>{
        T data;
        //��¼��һ���ڵ�
        SonNode first;
        public Node(T data){
            this.data =data;
            this.first = null;
        }

        public String toString(){
            if (first!=null){
                return "TreeChild$Node[data="+data
                        +",first="+first.pos+"]";
            }else {
                return "TreeChild$Node[data="+data+", first=-1";
            }
        }
    }

    private final int DEAFULT_TREE_SIZE =100;
    private int treeSize;
    //ʹ��һ��Node[]��¼�������нڵ�
    private Node<E>[] nodes;
    //��¼�ڵ�����
    int nodeNums;
    //��ָ�����ڵ㴴����
    @SuppressWarnings("unchecked")
    public TreeChild(E data,int treeSize){
        this.treeSize = treeSize;
        nodes = new Node[treeSize];
        nodes[0] = new Node<E>(data);
        nodeNums++;
    }

    public void addNode(E data,Node parent){
        for (int i=0;i<treeSize;i++){
            if (nodes[i]==null){
                nodes[i]=new Node<E>(data);
                if (parent.first==null){
                    parent.first = new SonNode(i,null);
                }else{
                    SonNode next = parent.first;
                    while (next.next!=null){
                        next=next.next;
                    }
                    next.next=new SonNode(i,null);
                }
                nodeNums++;
                return;
            }
        }
        throw new RuntimeException("�����������޷�����½ڵ㣡");
    }

    public boolean empty(){
        return nodes[0]==null;
    }

    public Node<E> root(){
        return nodes[0];
    }

    //����ָ���ڵ�������ӽڵ�
    public List<Node<E>> children(Node parent){
        List<Node<E>> list = new ArrayList<Node<E>>();
        SonNode next = parent.first;
        while (next!=null){
            list.add(nodes[next.pos]);
            next =next.next;
        }
        return list;
    }

    //����һ���ݹ鷽����ÿ�����������Ϊ������������������+1��������������
    private int deep(Node node){
        if (node.first==null){
            return 1;
        }else {
            int max =0;
            SonNode next = node.first;

            while (next!=null){
                int tmp =deep(nodes[next.pos]);
                if (tmp >max){
                    max=tmp;
                }

                next=next.next;
            }

            return max+1;
        }
    }









}
