import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sums = in.nextInt();
        while(sums-- > 0){
            int size = in.nextInt();
            int washNum = in.nextInt();

            int[] res = new int[size * 2];
            for(int i = 0; i < res.length; i++){
                int tmp = i + 1;
                for(int j = 0; j < washNum; j++){
                    if (tmp <= size) tmp = 2*tmp - 1;
                    else tmp = 2 * (tmp - size);
                }
                res[tmp - 1] = in.nextInt();
            }

            for(int j = 0; j < res.length; j++) {
                System.out.print(res[j]);
                if(j != res.length - 1)
                    System.out.print(" ");
            }
        }
    }
}
