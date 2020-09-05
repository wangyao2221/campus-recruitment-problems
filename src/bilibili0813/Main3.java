package bilibili0813;

/**
 * @author wangyao2221
 * @date 2020/8/13 18:58
 */
public class Main3 {
    public static void main(String[] args) {

    }

    public int GetCoinCount(int N) {
        // write code here
        int res = 1024 - N;

        int count = 0;
        int tmp = 0;
        if(res == 0) return count;
        if (res >= 64) {
            tmp = res / 64;
            count += tmp;
            res = res - 64 * tmp;
        }

        if (res >= 16) {
            tmp = res / 16;
            count += tmp;
            res = res - 16 * tmp;
        }

        if (res >= 4) {
            tmp = res / 4;
            count += tmp;
            res = res - 4 * tmp;
        }

        if (res > 0) count += res;
        return count;
    }
}
