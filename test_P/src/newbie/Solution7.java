package newbie;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by MoJiMin on 2017/3/1.
 * /**
 *
 * 输入某二叉树的前序遍历和中序遍历的结果，
 * 请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入
 * 前序遍历序列{1,2,4,7,3,5,6,8}
 * 和
 * 中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 *
 * 思路：1、递归
 *
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){ val = x;}
}

public class Solution7 {

    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {

        TreeNode root= Treemaka(pre,in,pre.length);

        return root;
    }

    public static TreeNode Treemaka(int [] pre,int [] in,int length){
        if (length==0){
            return null;
        }else{


         TreeNode root =new TreeNode(pre[0]);
            int i=0;
            for (;i<in.length-1;i++){
                if (in[i]==pre[0]){
                    break;
                }
            }
            int L_Length = i;
            int R_Length = in.length-i-1;
            int[] pre1 = new int[L_Length];
            int[] pre2 = new int[R_Length];
            int[] in1 = new int[L_Length];
            int[] in2 = new int[R_Length];
            System.arraycopy(pre,1,pre1,0,L_Length);
            System.arraycopy(pre,1+L_Length,pre2,0,R_Length);
            System.arraycopy(in,0,in1,0,L_Length);
            System.arraycopy(in,1+L_Length,in2,0,R_Length);

            root.left=Treemaka(pre1,in1,L_Length);
            root.right=Treemaka(pre2,in2,R_Length);

            return root;
        }
    }
}
