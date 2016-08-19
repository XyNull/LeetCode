import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args){
		int[] a = {4,2,5,1,6,3,7};
		int[] b = {4,5,2,6,7,3,1};
		buildTree(a,b);
	}
	
    public static TreeNode buildTree(int[] in, int[] post) {
    	if(in.length == 0 || post.length == 0) return null;
    	
        int rootVal = post[post.length-1];
        TreeNode root = new TreeNode(rootVal);
        
        int meet = 0;
        for(int i = 0;i < in.length; i++){
        	if(in[i] == rootVal){
        		meet = i;
        		break;
        	}
        }
        
        int[] leftIn = new int[meet],
        	  rightIn = new int[in.length-1-meet];
        
        int[] leftPost = new int[leftIn.length],
        	  rightPost = new int[rightIn.length];
        
        for(int i = 0,j = 0; i < in.length; i++){
        	if(i < meet) leftIn[i] = in[i];
        	else{
        		if(i > meet){
        		rightIn[j] = in[i];
        		j++;
        		}
        	}
        }
        
        for(int i = 0, j = 0; i < post.length-1; i++){
        	if(i <= leftPost.length-1) leftPost[i] = post[i];
        	else{
        		if(j <= rightPost.length-1){
        			rightPost[j] = post[i];
            		j++;
        		}
        		else break;
        	}
        }
        
        root.left = buildTree(leftIn,leftPost);
        root.right = buildTree(rightIn,rightPost);
        
        return root;
    }
}
