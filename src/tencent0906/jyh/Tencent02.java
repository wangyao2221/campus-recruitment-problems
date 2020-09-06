package tencent0906.jyh;

import java.lang.reflect.Array;
import java.util.*;

public class Tencent02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        List<HashSet<Integer>> list = new ArrayList<>();
//        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < m; i++) {
            int num = in.nextInt();
//            List<Integer> tmpList = new ArrayList<>();
            HashSet<Integer> tmpSet = new HashSet<>();
            int flag = 0;
            for (int j = 0; j < num; j++) {
                int tmp = in.nextInt();
                tmpSet.add(tmp);
                if(tmp == 0){
                    flag = 1;
                }
            }
            list.add(tmpSet);
            if(flag == 1)set.addAll(tmpSet);
//            if(flag == 1){
//                for (int j = 0; j < tmpList.size(); j++) {
//                    set.add(tmpList.get(j));
//                }
//                set.addAll(tmpList);
            }

        for (int i = 0; i < list.size(); i++) {
            Iterator<Integer> it = list.get(i).iterator();
            while(it.hasNext()) {
                if(set.contains(it.next())) {
                    set.addAll(list.get(i));
                    break;
                }
            }
        }
        System.out.println(set.size());
    }

}
