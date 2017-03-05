package newbie;

import java.util.HashSet;

/**
 * Created by MoJiMin on 2017/2/28.
 *一个链表中包含环，请找出该链表的环的入口结点。
 *
 * 思路：
 * 1、每一个链表节点只有一个next节点
 * 2、可以使用HashSet的不可重复性
 *
 * class ListNode{
    int val;
    ListNode next =null;

    ListNode(int val){
    this.val = val;
    }
    }
 */
public class Solution6 {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        HashSet<ListNode> store = new HashSet<ListNode>();

        if (pHead!=null) {
            ListNode current = pHead;
            while (current!=null){
                if (!store.add(current)){
                    return current;
                }else {
                    current=current.next;
                }
            }
        }
        return null;
    }
}
