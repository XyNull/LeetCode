import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by XyNull on 2016/9/7.
 */
public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(2);
        a.left = new TreeNode(3);
        a.right = new TreeNode(1);
        recoverTree(a);
    }
    public static void recoverTree(TreeNode root) {
        ArrayList<TreeNode> inorder = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        TreeNode pointer = root,pre = null;
        TreeNode[] res = new TreeNode[2];

        while(!stack.isEmpty() || pointer != null){
            if(pointer != null){
                stack.push(pointer);
                pointer = pointer.left;
            }
            else{
                pointer = stack.pop();
                inorder.add(pointer);
                if(pre != null && pointer.val < pre.val){
                    res[0] = res[0] == null? pre : res[0];
                    res[1] = pointer;
                }
                    pre = pointer;
                    pointer = pointer.right;
            }
        }

        res[0].val += res[1].val;
        res[1].val = res[0].val - res[1].val;
        res[0].val = res[0].val - res[1].val;
    }
}
