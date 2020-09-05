package history.bilibili0904;

/**
 * @author wangyao2221
 * @date 2020/9/4 19:32
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(fun("aaabbaaac"));
    }

    public static int fun(String str) {
        if (str.length() == 0) return 0;
        char[] chs = str.toCharArray();

        int kind = 1;
        int sum = chs.length;
        char ch = chs[0];
        for (int i = 1; i < chs.length; i++) {
            if (chs[i] != ch) {
                kind++;
                ch = chs[i];
            }
        }

        return sum / kind;
    }
}
