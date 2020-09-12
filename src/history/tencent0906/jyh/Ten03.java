package history.tencent0906.jyh;


import java.util.*;

public class Ten03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = 0,K = 0;
        N = in.nextLong();
        K = in.nextLong();
        String[] arr = new String[(int)N];
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            arr[i] = in.next();

            if(map.containsKey(arr[i]))map.put(arr[i],map.get(arr[i]) + 1);
            else map.put(arr[i], 1);
        }

        ArrayList<Map.Entry<String,Integer>> allCom = new ArrayList<>(map.entrySet()) ;
        ArrayList<Map.Entry<String,Integer>> leaveCom = new ArrayList<>(map.entrySet()) ;
        allCom.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> stringIntegerEntry, Map.Entry<String, Integer> t1) {
                if(stringIntegerEntry.getValue().equals(t1.getValue())){
                    return stringIntegerEntry.getKey().compareTo(t1.getKey());
                }

                return -stringIntegerEntry.getValue().compareTo(t1.getValue());
            }
        });
        leaveCom.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> stringIntegerEntry, Map.Entry<String, Integer> t1) {
                if(stringIntegerEntry.getValue().equals(t1.getValue())){
                    return stringIntegerEntry.getKey().compareTo(t1.getKey());
                }

                return stringIntegerEntry.getValue().compareTo(t1.getValue());
            }
        });
        for (int i = 0; i < K; i++) {
            System.out.println(allCom.get(i).getKey() + " " + allCom.get(i).getValue());
        }
        for (int i = 0; i < K; i++) {
            System.out.println(leaveCom.get(i).getKey() + " " + leaveCom.get(i).getValue());
        }
    }
}
