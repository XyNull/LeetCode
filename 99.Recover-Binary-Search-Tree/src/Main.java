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
        ArrayList<TreeNode> inorder = helper(root);
        int err = 0;
        int[] res = new int[2];

        for(int i = 1; i < inorder.size(); i++) {
            if (inorder.get(i - 1).val > inorder.get(i).val) {
                if(err == 0){
                    res[err++] = i - 1;
                    continue;
                }
                if(err == 1)
                    res[err++] = i;
            }
        }

        if(err == 1){
            res[err] = res[0]+1;
        }

        TreeNode n1 = inorder.get(res[0]);
        TreeNode n2 = inorder.get(res[1]);

        n1.val += n2.val;
        n2.val = n1.val - n2.val;
        n1.val = n1.val - n2.val;
    }

    public static ArrayList<TreeNode> helper(TreeNode node){
        ArrayList<TreeNode> res = new ArrayList<>();
        if(node == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pointer = node;

        while(!stack.isEmpty() || pointer != null){
            if(pointer != null){
                stack.push(pointer);
                pointer = pointer.left;
            }
            else{
                pointer = stack.pop();
                res.add(pointer);
                pointer = pointer.right;
            }
        }
        return res;
    }
}
