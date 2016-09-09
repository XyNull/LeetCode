
public class Main {
    public static void main(String[] args){
        String a = numberToWords(12345678);
        a.toString();
    }

    public static String numberToWords(int num){
        if(num == 0)
            return "Zero";
        String res = helper(num);
        while(res.charAt(res.length()-1) == 32){
            res = res.substring(0,res.length()-2);
        }
        return res;
    }

    public static String helper(int num){
        String[] nums =
                {"","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine ","Ten ","Eleven ","Twelve ","Thirteen ","Fourteen ","Fifteen ","Sixteen ","Seventeen ","Eighteen ","Nineteen "};
        String[] big = {"","Ten ","Twenty ","Thirty ","Forty ","Fifty ","Sixty ","Seventy ","Eighty ","Ninety "};
        String[] digits = {"Hundred ","Thousand ","Million ","Billion "};

        StringBuilder res = new StringBuilder();
        int remainder = 0;
        if(num/1000000000 >= 1){
            remainder = num % 1000000000;
            res.append(helper(num/1000000000) + digits[3]);
            res.append(helper(remainder));
        }

        else if(num/1000000 >= 1){
            remainder = num % 1000000;
            res.append(helper(num/1000000) + digits[2]);
            res.append(helper(remainder));
        }

        else if(num/1000 >= 1){
            remainder = num % 1000;
            res.append(helper(num/1000) + digits[1]);
            res.append(helper(remainder));
        }

        else if(num/100 >= 1){
            remainder = num % 100;
            res.append(helper(num/100) + digits[0]);
            res.append(helper(remainder));
        }

        else if(num / 10 >= 2){
            remainder = num % 10;
            res.append(big[num/10]);
            res.append(helper(remainder));
        }

        else res.append(nums[num]);

        return res.toString();
    }
}
