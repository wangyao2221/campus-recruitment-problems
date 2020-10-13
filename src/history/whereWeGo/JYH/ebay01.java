package history.whereWeGo.JYH;

import java.util.Scanner;

public class ebay01 {
    static int jumpNum = 0;
    static long[] arr ;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        arr = new long[N+1];
        int start = 1;
        long rz = find(start,N);
        System.out.println(rz);
//        System.out.println(Arrays.toString(arr));
    }

    private static long find(int start, int end) {

        if(start == end){
            jumpNum ++;
            return 1;
        }

        long tmp  = 0;
        if(start < end) {
            for (int i = 0; start + Math.pow(2, i) <= end; i++) {
                if(arr[(int) (start + Math.pow(2, i))] != 0){
                    tmp += arr[(int) (start + Math.pow(2, i))];
                }
                else tmp += find((int) (start + Math.pow(2, i)), end);
            }
            arr[start] = tmp;
            return tmp;
        }
        return 0;

    }
}
