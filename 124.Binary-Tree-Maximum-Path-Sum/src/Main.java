
public class Main {
    int res;
    public int maxPathSum(TreeNode root) {
        res = root.val;
        return Math.max(path(root),res);
    }

    public int path(TreeNode root){
        if(root == null) return Integer.MIN_VALUE;

        int val = root.val,tempMax;
        int left = path(root.left), right = path(root.right);
        tempMax = Math.max(Math.max(Math.max(val,left),Math.max(right,val+left)),Math.max(val+right,val+right+left));

        res = Math.max(res,tempMax);

        if(tempMax == val+left+right) {
            if (left > right)
                return val+left;
            else return val+right;
        }

        if(tempMax == left)
            return val+left;

        if(tempMax == right)
            return val+right;

        else return tempMax;
    }
}
