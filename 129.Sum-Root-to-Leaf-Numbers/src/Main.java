import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by XyNull on 2016/9/7.
 */
public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(1);
        a.left = new TreeNode(2);
        a.right = new TreeNode(3);
        sumNumbers(a);
    }

    static int res = 0;
    public static int sumNumbers(TreeNode root) {
        if(root == null)
            return 0;
        sum(root,0);
        return res;
    }
    public static void sum(TreeNode root,int tempsum){
        if(root.left == null && root.right == null)
            res += tempsum * 10 + root.val;
        if(root.left != null)
            sum(root.left, tempsum*10+root.val);
        if(root.right != null)
            sum(root.right, tempsum*10+root.val);
    }
}
