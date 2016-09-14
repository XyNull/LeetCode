import java.util.*;

/**
 * Created by XyNull on 2016/9/11.
 */
public class Main {

    public static TreeNode treeBuilder(int[] n){
        if(n.length == 0)
            return null;

        TreeNode root = new TreeNode(n[0]);
        Queue<TreeNode> curLv = new LinkedList<>();
        Queue<TreeNode> nextLv = new LinkedList<>();
        curLv.add(root);
        int num = 1,lv = 1,cu = 1,ne = 0;

        //levels traversal
        while(num < n.length){

            //new all the nodes at next level and push them into queue
            for(int i = 0; i < 2<<(lv-1); i++){
                if(num > n.length-1) break;
                if(n[num] != 0) nextLv.add(new TreeNode(n[num]));
                else nextLv.add(null);
                num++;
            }

            //connect each nodes from this level to new nodes from queue
            while(cu > 0){
                TreeNode cur = curLv.poll();
                cu--;
                TreeNode left = nextLv.poll();
                TreeNode right = nextLv.poll();
                if(cur != null){
                    cur.left = left;
                    cur.right = right;
                }
                curLv.add(left);
                curLv.add(right);
                ne += 2;
            }
            cu = ne;
            ne = 0;
            lv++;
        }

        return root;
    }

    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7};
        zigzagLevelOrder(treeBuilder(a));
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);
        int curLv = 1, nextLv = 0, lv = 0;

        while(!treeNodes.isEmpty()){
            List<Integer> cur = new ArrayList<>();
            while(curLv-- > 0){
                TreeNode pointer = treeNodes.poll();
                cur.add(pointer.val);
                if(pointer.left != null){
                    treeNodes.add(pointer.left);
                    nextLv++;
                }
                if(pointer.right != null){
                    treeNodes.add(pointer.right);
                    nextLv++;
                }
            }
            if(lv++ % 2 != 0){
                Collections.reverse(cur);
            }
            res.add(cur);
            curLv = nextLv;
            nextLv = 0;
        }
        return res;
    }
}
