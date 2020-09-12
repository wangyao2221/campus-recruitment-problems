package netease0912.jyh;

import java.util.HashSet;
import java.util.Scanner;

public class wangyi03 {
    static int maxNum = 0;
    static HashSet<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n - 1; i++) {
            int tmp = in.nextInt();
            int x = i + 1;
            int y = tmp;
            if(arr[x][y] == 0)arr[x][y] = 1;
            if(arr[y][x] == 0)arr[y][x] = 1;
        }
        set.contains(0);
        int count = 1;
        find(arr,0,n,k,count);
        System.out.println(maxNum);
    }

    private static void find(int[][] arr, int loc,int n, int k, int count) {
        if(k == 0){
            maxNum = Math.max(maxNum,count);
            return;
        }
        for (int i = 0; i < n; i++) {
            if(arr[loc][i] == 1 && !set.contains(i)){
                set.add(i);
                find(arr,i,n,k-1,count + 1);
                set.remove(i);
            }
        }
        if(k >= 0)maxNum = Math.max(maxNum,count);
        return;
    }
}
