package xiecheng.ji;

import java.util.*;

public class xie02 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<int[]> list = new ArrayList<>();
        ArrayList<Integer> cList = new ArrayList<>();
        while (cin.hasNextInt()) {
            int incomeOfA = cin.nextInt();
            int incomeOfB = cin.nextInt();
            int[] tmpArr = new int[2];
            tmpArr[0] = incomeOfA;
            tmpArr[1] = incomeOfB;
            list.add(tmpArr);
            cList.add(Math.max(incomeOfA, incomeOfB));
            //Start coding -- Input Data
        }
        Collections.sort(cList);
        int sum = 0;
        for (int i = cList.size() - 1; i >= 0; i--) {
            sum += cList.get(i);
        }
        System.out.println(sum);
    }
        //Start coding
}
