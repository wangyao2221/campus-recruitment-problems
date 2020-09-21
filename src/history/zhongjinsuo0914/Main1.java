package history.zhongjinsuo0914;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangyao2221
 * @date 2020/9/14 21:03
 */
public class Main1 {
    public static void main(String[] args) {
        String[] arr = {"1","2", "3", "#", "5", "6", "7", "8", "#", "10"};
        List<List<String>> result = printNode(arr);
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static List<List<String>> printNode(String[] arr) {
        List<List<String>> result = new ArrayList<>();
        int n = 1;

        int index = 0;
        while (index < arr.length) {
            List<String> list = new ArrayList<>();
            for (int j = 0; j < n && index < arr.length; j++, index++) {
                if (!"#".equals(arr[index])) {
                    list.add(arr[index]);
                }
            }
            n *= 2;
            result.add(list);
        }

        return result;
    }
}
