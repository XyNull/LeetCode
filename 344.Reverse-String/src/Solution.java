public class Solution {
    public String reverseString(String s) {
        int slow = 0;
        int fast = s.length()-1;
    	StringBuilder sb=new StringBuilder(s);
        while(fast>slow){
        	char temp=s.charAt(slow);
        	sb.replace(slow, slow, s.substring(slow, slow));
        	sb.replace(fast, fast, String.valueOf(temp));
        	fast--;
        	slow++;       	
        }
        return sb.toString();
    }
}