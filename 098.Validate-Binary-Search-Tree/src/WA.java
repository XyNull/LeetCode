/**
 * Created by XyNull on 2016/9/5.
 */

//如果忽略Integer边界值可行
public class WA {
    public static boolean isValidBST(TreeNode root) {
        return helper(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }

    public static boolean helper(TreeNode node,int max,int min){
        if(node == null) return true;

        if(node.left != null){
            if(node.left.val >= node.val || node.left.val <= min)
                return false;
        }

        if(node.right != null){
            if(node.right.val <= node.val || node.right.val >= max)
                return false;
        }

        if(helper(node.left,node.val,min) && helper(node.right,max,node.val))
            return true;
        else return false;
    }
}
