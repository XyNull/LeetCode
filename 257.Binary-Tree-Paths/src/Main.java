import java.util.ArrayList;
import java.util.List;

public class Main {
	public void result(TreeNode node,String path,List<String> list){
		if(node == null)
			return;
		
		else{
			if(node.left == null && node.right == null){
			list.add(path);
			return;
			}
			
			if(node.left != null)
			result(node.left,path + "->" + String.valueOf(node.left.val),list);
		
			if(node.right != null)
			result(node.right,path + "->" + String.valueOf(node.right.val),list);
		}
	}


	public List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new ArrayList();
		if(root == null)
			return list;
		result(root,String.valueOf(root.val),list);
		return list;
	}

}