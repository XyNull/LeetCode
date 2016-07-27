import java.util.ArrayList;

public class SolutionB {
	
	public void main(String[] args){
	int[] nums = new int[8];
	nums[0]=1;
	nums[1]=2;
	nums[2]=3;
	nums[3]=4;
	nums[4]=5;
	nums[5]=6;
	nums[6]=7;
	nums[7]=8;
	rotate(nums,6);
	}
	
	public void rotate(int[] nums, int k){
		int legth = nums.length;
    	if(legth==0)return;
    	
        k = k%legth;
        if(k==0)return;
        
		ArrayList tmp = new ArrayList();
		int front = nums.length-k;
		
		//��ǰ��������������
		for(int i=0; i<front; i++){
			tmp.add(nums[i]);
		}
		
		//�󼸸��ǰ��
		for(int i=0,j=k;j>0;i++){
			nums[i] = nums[legth-j];
			j--;
		}
		
		//��󼸸���ȥ
		for(int i=0,j=legth-front; j<legth; i++){
			nums[j] = (int) tmp.get(i);
			j++;
		}
	}
}
