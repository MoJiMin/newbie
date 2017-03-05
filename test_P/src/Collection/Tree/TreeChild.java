package Collection.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MoJiMin on 2017/2/28.
 */
public class TreeChild<E> {
    private static class SonNode{

        //记录当前节点的位置
        private int pos;
        private SonNode next;
        public SonNode(int pos,SonNode next){
            this.pos=pos;
            this.next=next;
        }
    }

    public static class Node<T>{
        T data;
        //记录第一个节点
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
    //使用一个Node[]记录树的所有节点
    private Node<E>[] nodes;
    //记录节点数量
    int nodeNums;
    //以指定根节点创建树
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
        throw new RuntimeException("该树已满，无法添加新节点！");
    }

    public boolean empty(){
        return nodes[0]==null;
    }

    public Node<E> root(){
        return nodes[0];
    }

    //返回指定节点的所有子节点
    public List<Node<E>> children(Node parent){
        List<Node<E>> list = new ArrayList<Node<E>>();
        SonNode next = parent.first;
        while (next!=null){
            list.add(nodes[next.pos]);
            next =next.next;
        }
        return list;
    }

    //这是一个递归方法：每棵子树的深度为其所有子树的最大深度+1！！！！！！！
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
