package Didi0913.jyh;

import java.util.ArrayList;
import java.util.Scanner;

public class baidu01 {
    static int flag = 0;
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int[][] visited = new int[n][n];
        for(int i = 0;i < n;i++){
            for (int j = 0; j < n; j++) {
                if(visited[i][j] == 0 && arr[i][j] == 0){
                    flag = 0;
                    dfs(arr,visited,i,j);
                    if(flag == 0){
                        for (int k = 0; k  + 1 < list.size(); k+=2) {
                            int x = list.get(k);
                            int y = list.get(k+1);
                            arr[x][y] = 1;

                        }
                    }
                    list.clear();
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void dfs(int[][] arr, int[][] visited, int i, int j) {
        if(i < 0 || i >= arr.length || j < 0 || j >= arr.length){
            flag = 1;
            return;
        }
        if(visited[i][j] == 1)return;
        visited[i][j] = 1;
        if(arr[i][j] == 1){
            return;
        }
        list.add(i);
        list.add(j);
        dfs(arr,visited,i + 1,j);
        dfs(arr,visited,i - 1,j);
        dfs(arr,visited,i,j + 1);
        dfs(arr,visited,i,j - 1);

    }
}
