package newbie;

import java.util.LinkedList;

/**
 * Created by MoJiMin on 2017/2/28.
 在一个排序的链表(排序的链表是关键条件)中，存在重复的结点，
 请删除该链表中重复的结点，重复的结点不保留，
 返回链表头指针。
 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5

 思路：为链表增加一个头

 * 以下是链表节点的数据结构
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
