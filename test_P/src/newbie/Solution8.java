package newbie;

import java.util.Stack;

/**
 * Created by MoJiMin on 2017/3/1.
 * 题目：
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *
 */
public class Solution8 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
            stack1.push(node);
    }

    public int pop() {
        min();
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }else {
            return -1;
        }
    }

    public void min(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
    }
}
