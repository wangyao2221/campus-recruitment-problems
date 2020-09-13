package history.netease0912.jyh;

import java.util.Arrays;
import java.util.Scanner;

public class wangyi01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = str.length();
        int[] arr = new int[1 << 6];
        Arrays.fill(arr,-1);
        int rz = 0, bits = 0;
        arr[0] = 0;
        for (int i = 0; i < n; i++) {
            char tmp = str.charAt(i);
            if(tmp == 'a'){
                bits ^= (1 << 0);
            }else if(tmp == 'b'){
                bits ^= (1 << 1);
            }else if(tmp == 'c'){
                bits ^= (1 << 2);
            }else if(tmp == 'x'){
                bits ^= (1 << 3);
            }else if(tmp == 'y'){
                bits ^= (1 << 4);
            }else if(tmp == 'z'){
                bits ^= (1 << 5);
            }
            if(arr[bits] >= 0){
                rz = Math.max(rz,i + 1 - arr[bits]);
            }else {
                arr[bits] = i + 1;
            }

        }
        System.out.println(rz);
    }
}
