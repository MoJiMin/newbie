package newbie;

import java.util.LinkedList;

/**
 * Created by MoJiMin on 2017/2/28.
 ��һ�����������(����������ǹؼ�����)�У������ظ��Ľ�㣬
 ��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻������
 ��������ͷָ�롣
 ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5

 ˼·��Ϊ��������һ��ͷ

 * ����������ڵ�����ݽṹ
 *
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

public class Solution5 {
    public ListNode deleteDuplication(ListNode pHead)
    {
        ListNode index = new ListNode(0);
        ListNode result = index;
        index.next=pHead;
        ListNode current = pHead;

        while(current!=null){
            if (current.next!=null&&current.val==current.next.val){
                while (current.next!=null&&current.val==current.next.val) {
                    current=current.next;
                }
                index.next=current.next;
                current.next=null;
                current=index.next;
            }else{
                index=index.next;
                current=current.next;
            }
        }

      return result.next;
    }
}
