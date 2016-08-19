
//this code do not pass all the test
package test;

import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.Scanner;

public class test {
	public static void main(String args[]) 
    {
        Scanner cin = new Scanner(System.in); 
        //获得组别长度
        int groups;
        String s = cin.nextLine();
        groups = Integer.parseInt(s);
        
        for(int i=0;i<groups;i++){
        	//获得当前组别的人数
        	String a = cin.nextLine();
        	int nums = Integer.parseInt(a);
        	String[] persons = new String[nums];
        	
        	for(int j = 0;j<nums;j++){
        		persons[j]=cin.nextLine();
        	}
        	int ii=i+1;
        	System.out.println("Case #"+ii+": "+choose(persons));
        }
    }  
    		
	public static String choose(String[] persons){
		int big=0;
		
		for(int i=0;i+1<=persons.length-1;i++){
			//判断不同字母数量并赋值到big
				if(count(persons[i])>count(persons[i+1]))
					big = i;
			
				else if(count(persons[i])<count(persons[i+1]))
					big = i+1;
			
				 	else //如果相同，调用same函数判断字母顺序
				 		if(same(persons[i],persons[i+1])==1)
						big = i;
			
				 		else big = i+1;
			
		}
		
		String biggst = persons[big];
		return biggst;
	}

	public static int count(String input) {
		Hashtable<Character, Integer> Hmap = new Hashtable<Character, Integer>();

		for (int i = 0; i < input.length(); i++)
			if(input.charAt(i)!=32)
			Hmap.put(input.charAt(i), 1);

		return Hmap.size();
	}
	
	public static int same(String a,String b){
		char aa = a.charAt(0),bb = a.charAt(0);
		//判断a字符串最先字母
		for(int i = 0; i+1<=a.length()-1 ;i++){
				aa = a.charAt(i);
				bb = a.charAt(i+1);
				if(aa>bb) aa=bb;
			
		}
		//判断b字符串最先字母
		for(int j = 0; j+1<=b.length()-1 ;j++){
			aa = b.charAt(j);
			bb = b.charAt(j+1);
			if(aa<bb) bb=aa;
		}
		
		if(aa<bb) return 1;
		if(aa>bb) return 2;
		else return 1;
		
	}
}
