
public class Main {
    public static void main(String[] args){
        int[] a = {1,11,111,32,1024,11111,22,33};
        int[] b = {22,1024,111,55,33,1025};
        boolean[] c = task(a,b);
        for (boolean d :
                c) {
            System.out.println(d ? 1 : 0);
        }
    }

    public static boolean[] task(int finishs[], int checks[]){
        long[] storge = new long[32];
        for(int i = 0; i < 32 ; i++){
            storge[i] = 0;
        }

        for (int finish:
                finishs) {
            if(finish > 1024) {
                System.err.println(finish);
                continue;
            }
            int i = (finish - 1) / 32, j = ((finish - 1) % 32);
            storge[i] += (long) 1 << j;
        }

        boolean[] res = new boolean[checks.length];
        int re = 0;
        for (long check :
                checks) {
            if(check > 1024) {
                System.err.println(check);
                continue;
            }
            int i = (int) (check - 1) / 32;
            long j = (long)1 << ((check - (long)1) % (long)32);

            res[re++] = (storge[i] & j) == j;
        }
        return res;
    }
}
