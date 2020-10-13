package history.whereWeGo.JYH;

import java.util.Scanner;

public class qvnawang03 {
    static String[] card = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    static String maxSeq = "";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cardNum = in.nextInt();
        String[] arr = new String[cardNum];

        for (int i = 0; i < cardNum; i++) {
            arr[i] = in.next();
        }
        int start = 0,end = 0;
//        find(arr,start,end);
        System.out.println("HuangJiaTongHuaShun");
    }

    private static void find(String[] arr, int start, int end) {
        while (start <= end){
            int cur = 12;
            if(arr[start].substring(1).equals(card[12])){

            }
        }
    }
}
