package Didi0913.jyh;

import java.util.Scanner;

public class didi01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nn = in.nextLine();
        int n = Integer.valueOf(nn);
        String str = in.nextLine();
//        System.out.println(str);
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        if(str.length() <= n){
            for (int i = str.length() - 1; i >= 0 ; i--) {
                sb.append(arr[i]);
            }
            System.out.println(sb.toString());
            return;
        }
        int pre = -1;
        int i = 0;
        for (i = n - 1; i < arr.length; i += n) {
            int j = i;
            while(j > pre) {
                sb.append(arr[j]);
                j--;
            }
            pre = i;
        }
        int start = arr.length - arr.length % n;
        int j = arr.length - 1;
        while (j >= start){
            sb.append(arr[j]);
            j--;
        }
        System.out.println(sb.toString());
    }
}
