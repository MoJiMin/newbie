package Collection.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MoJiMin on 2017/2/28.
 * 使用一个节点数组来保存树里的每个节点，并让每一个节点记录其父节点在数组中的位置
 * 父节点表示法
 */
public class TreeParent<E> {
    public static class Node<T>{
        T data;
        int parent;
        public Node(){

        }
        public Node(T data){
            this.data=data;
        }
        public Node(T data,int parent){
            this.data=data;
            this.parent=parent;
        }

        public String toString(){
            return "TreeParent$Node[data=" + data+", parent="+ parent +"]";
        }
    }

    private final int DEAFULT_TREE_SIZE = 100;
    private int treeSize = 0;

    //使用一个Node<E>[]数组来记录树里的所有节点
    private Node<E>[] nodes;
    //记录节点个数
    private int nodeNums;

    //以指定根节点创建树
    //构造函数1
    @SuppressWarnings("unchecked")
    public TreeParent(E data){
        treeSize = DEAFULT_TREE_SIZE;
        nodes = new Node[treeSize];
        nodes[0] = new Node<E>(data,-1);
        nodeNums++;
    }

    //以指定节点添加子节点
    public void addNode(E data,Node parent){
        for (int i=0;i<treeSize;i++){
            //找到数组中第一个为nulld的元素，以用于保存新节点
            if (nodes[i]==null){
                nodes[i] =new Node<E>(data,pos(parent));
                nodeNums++;
                return;
            }
        }
        throw new RuntimeException("该树已满，无法添加子节点");
    }

    public boolean empty(){
        return nodes[0]==null;
    }

    public Node<E> root(){
        return nodes[0];
    }

    public Node<E> parent(Node node){
        return nodes[node.parent];
    }

    //返回指定节点的所有子节点
    public List<Node<E>> children(Node parent){
        List<Node<E>> list = new ArrayList<Node<E>>();
        for (int i=0;i<treeSize;i++){
            if (nodes[i]!=null&&
                    nodes[i].parent==pos(parent))
            {
                list.add(nodes[i]);
            }
        }
        return list;
    }

    public int deep(){
        //用于记录节点的最大深度
        int max = 0;
        for (int i=0;i<treeSize&&nodes[i]!=null;i++){
            // 初始化本节点的深度
            int def =1;
            //记录当前节点的父节点的位置
            int m = nodes[i].parent;
            //如果其父节点存在
            while(m != -1 && nodes[m] !=null){
                m=nodes[m].parent;
                def++;
            }

            if (max<def){
                max =def;
            }

        }
        return max;
    }

    //返回指定节点在数组中的位置
    public int pos(Node node){
        for (int i=0;i<treeSize;i++){
            if (nodes[i]==node)
                return i;
        }

        return -1;
    }

}











