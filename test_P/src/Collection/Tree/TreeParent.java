package Collection.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MoJiMin on 2017/2/28.
 * ʹ��һ���ڵ����������������ÿ���ڵ㣬����ÿһ���ڵ��¼�丸�ڵ��������е�λ��
 * ���ڵ��ʾ��
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

    //ʹ��һ��Node<E>[]��������¼��������нڵ�
    private Node<E>[] nodes;
    //��¼�ڵ����
    private int nodeNums;

    //��ָ�����ڵ㴴����
    //���캯��1
    @SuppressWarnings("unchecked")
    public TreeParent(E data){
        treeSize = DEAFULT_TREE_SIZE;
        nodes = new Node[treeSize];
        nodes[0] = new Node<E>(data,-1);
        nodeNums++;
    }

    //��ָ���ڵ�����ӽڵ�
    public void addNode(E data,Node parent){
        for (int i=0;i<treeSize;i++){
            //�ҵ������е�һ��Ϊnulld��Ԫ�أ������ڱ����½ڵ�
            if (nodes[i]==null){
                nodes[i] =new Node<E>(data,pos(parent));
                nodeNums++;
                return;
            }
        }
        throw new RuntimeException("�����������޷�����ӽڵ�");
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

    //����ָ���ڵ�������ӽڵ�
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
        //���ڼ�¼�ڵ��������
        int max = 0;
        for (int i=0;i<treeSize&&nodes[i]!=null;i++){
            // ��ʼ�����ڵ�����
            int def =1;
            //��¼��ǰ�ڵ�ĸ��ڵ��λ��
            int m = nodes[i].parent;
            //����丸�ڵ����
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

    //����ָ���ڵ��������е�λ��
    public int pos(Node node){
        for (int i=0;i<treeSize;i++){
            if (nodes[i]==node)
                return i;
        }

        return -1;
    }

}











