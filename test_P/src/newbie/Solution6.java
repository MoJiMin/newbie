package newbie;

import java.util.HashSet;

/**
 * Created by MoJiMin on 2017/2/28.
 *һ�������а����������ҳ�������Ļ�����ڽ�㡣
 *
 * ˼·��
 * 1��ÿһ������ڵ�ֻ��һ��next�ڵ�
 * 2������ʹ��HashSet�Ĳ����ظ���
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
