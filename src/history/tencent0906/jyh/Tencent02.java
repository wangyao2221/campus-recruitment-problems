package history.tencent0906.jyh;

import java.util.*;

public class Tencent02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if(n == 0 || m == 0){
            System.out.println(0);
            return;
        }
        List<HashSet<Integer>> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < m; i++) {
            int num = in.nextInt();
            HashSet<Integer> tmpSet = new HashSet<>();
            int flag = 0;
            for (int j = 0; j < num; j++) {
                int tmp = in.nextInt();
                tmpSet.add(tmp);
                if(tmp == 0 || set.contains(tmp)){
                    flag = 1;
                }
            }
            list.add(tmpSet);
            if(flag == 1)set.addAll(tmpSet);
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
