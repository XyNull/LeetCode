import java.util.Stack;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(1);
        a.left = new TreeNode(2);
        a.right = new TreeNode(3);
        flatten(a);
    }
        public static void flatten(TreeNode root) {
            if(root == null) return;
            Stack<TreeNode> stack = new Stack<TreeNode>();
            stack.push(root);

            while(true){
                TreeNode pointer = stack.pop();
                if(pointer.right != null)
                    stack.push(pointer.right);
                if(pointer.left != null)
                    stack.push(pointer.left);
                if(stack.isEmpty()) break;
                pointer.left = null;
                pointer.right = stack.lastElement();
            }
        }
}
