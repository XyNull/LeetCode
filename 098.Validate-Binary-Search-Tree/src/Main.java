/**
 * Created by XyNull on 2016/9/5.
 */
public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(2);
        a.left = new TreeNode(1);
        a.right = new TreeNode(3);
        isValidBST(a);
    }

    public static boolean isValidBST(TreeNode root){
        if(root == null) return true;

        if(root.left != null){
            TreeNode pointer = root.left;
            while(pointer.right != null)
                pointer = pointer.right;
            if(pointer.val >= root.val) return false;
        }

        if(root.right != null){
            TreeNode pointer = root.right;
            while(pointer.left != null)
                pointer = pointer.left;
            if(pointer.val <= root.val) return false;
        }

        return isValidBST(root.left) && isValidBST(root.right);
    }
}
