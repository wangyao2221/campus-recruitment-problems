package history.netease0912.jyh;

import java.util.*;

public class wangyi04 {
    static HashSet<Integer> matchedGirl = new HashSet<>();
    static int maxNum = 0;
    static int maxboy = 0;
    static int maxGirl = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String[] arr1 = str1.split(" ");
        String[] arr2 = str2.split(" ");
        int[] boys = new int[arr1.length];
        int[] girls = new int[arr2.length];
        HashMap<Integer,ArrayList<Integer>> boyList = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            boys[i] = Integer.parseInt(arr1[i]);
            boyList.put(boys[i],new ArrayList<Integer>());
        }

        for (int i = 0; i < arr1.length; i++) {
            girls[i] = Integer.parseInt(arr2[i]);
        }
        maxboy = arr1.length;
        maxGirl = arr2.length;
        int n = in.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            int boy = in.nextInt();
            int girl = in.nextInt();
            boyList.get(boy).add(girl);
        }
        
        find(boyList,0,boys);
        System.out.println(maxNum);
//        System.out.println(Math.min(maxGirl,maxboy));
    }

    private static void find(HashMap<Integer, ArrayList<Integer>> boyList, int i,int[] boys) {
        if(i == maxboy){
//            int curSize = matchedGirl.size();
            maxNum = Math.max(matchedGirl.size(),maxNum);
            return;
        }

        List<Integer> tmp = boyList.get(boys[i]);
        for (int j = 0; j < tmp.size(); j++) {
            int girl = tmp.get(j);
            if(!matchedGirl.contains(girl)) {
                matchedGirl.add(girl);
                find(boyList, i + 1,boys);
                matchedGirl.remove(girl);
            }
        }
    }
    


}
