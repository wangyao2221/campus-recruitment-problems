package tiger0816;

/**
 * @author wangyao2221
 * @date 2020/8/16 16:10
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(fun(fun(1)));
    }

    static int fun(int x) {
        return ((x > 0) ? x * fun(x - 1) : 2);
    }
}
