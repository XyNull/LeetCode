import java.util.Hashtable;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		int []nums1={};
		int []nums2={};
		intersection(nums1,nums2);
	}
	public static int[] intersection(int[] nums1, int[] nums2) {
    	ArrayList tmp = new ArrayList();
    	int p1=0,p2=0;
    	
    	int[] nul = {};
    	if(nums1==nul || nums2==nul)
    		return nul;
    	
    	Hashtable a = new Hashtable(nums1.length);
    	
    	for(;p1>=nums1.length-1;p1++)
    		a.put(nums1[p1], nums1[p1]);
    	
    	for(;p2>=nums2.length-1;p2++){
    		if(a.get(nums2[p2])!=null)
    			tmp.add(a.get(nums2[p2]));
    	}
    	
    	int array[] = new int[tmp.size()];
    	for(int i=0;i<=tmp.size()-1;i++)
    		array[i]=(int) tmp.get(i);
    	
    	return array;

    }
}