package wenjing0910;

/**
 * @author wangyao2221
 * @date 2020/9/10 10:19
 */
public class Main2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long i = 0;
        for (;;) {
            if (i++ == 1000000000) {
                long end = System.currentTimeMillis();
                System.out.println(end - start);
            }
        }
    }
}
