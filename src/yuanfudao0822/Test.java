package yuanfudao0822;

/**
 * @author wangyao2221
 * @date 2020/8/22 19:07
 */
public class Test {
    public static int fun1(int i) {
        return i < 2 ? i : fun1(i - 1) - fun2(i - 1);
    }

    public static int fun2(int i) {
        return i < 2 ? i + 1 : fun2(i - 1) - fun1(i - 1);
    }

    public static int fun3(int i) {
        return fun1(i) / fun2(i) + 2020;
    }

    public static void main(String[] args) {
        System.out.println(fun3(60) % 4);
    }
}
