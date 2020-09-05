package bytedance0809;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author wangyao2221
 * @date 2020/8/9 23:07
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(fun("aa", 2, 6));
    }

    public static int fun(String str, int n, int m) {
        char[] chars = str.toCharArray();

        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            characterSet.add(chars[i]);
        }

        int max = 0;
        for (Character ch : characterSet) {
            int tmpM = m;
            Queue<Integer> indexQueue = new LinkedList<>();

            int start = 0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] != ch) {
                    if (tmpM > 0) {
                        indexQueue.add(i);
                        tmpM--;
                    } else {
                        start = indexQueue.poll() + 1;
                        indexQueue.add(i);
                    }
                }

                if (i - start + 1 > max) {
                    max = i - start + 1;
                }
            }
        }
        return max;
    }
}
