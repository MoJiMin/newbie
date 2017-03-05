package newbie;

/**
 * Created by MoJiMin on 2017/2/27.
 */
/**   ˼·������һ��������β��ͷ��ӡ����ÿ���ڵ��ֵ
 *
 * ����������ڵ�����ݽṹ
 *    public class ListNode {
 *        int val;
 *        ListNode next = null;
 *
 *        ListNode(int val) {
 *            this.val = val;
 *        }
 *    }
 *
 */
import Collection.List.LinkList;

import java.util.ArrayList;
import java.util.LinkedList;

class ListNode{
    int val;
    ListNode next =null;

    ListNode(int val){
        this.val = val;
    }
}

public class Solution4 {

    //����������б��ͷ���
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        LinkedList<ListNode> stack =new LinkedList<ListNode>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        ListNode current = listNode;
        if (current!=null) {
            for (;current != null; current = current.next) {
                stack.push(current);
            }
        }else {
            return result;
        }


        while (!stack.isEmpty()){
            result.add(stack.pop().val);
        }
        return result;
    }
}