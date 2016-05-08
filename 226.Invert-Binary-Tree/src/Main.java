
public class Main {
    public TreeNode invertTree(TreeNode root) {
       TreeNode temp;
    	if(root != null ){
        		temp = root.left;
        		root.left = root.right;
        		root.right = temp;
        }else return null;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}