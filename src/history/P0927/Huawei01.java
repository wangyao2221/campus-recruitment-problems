package history.P0927;

import java.util.Stack;

/**
 * @author wangyao2221
 * @date 2020/9/25 10:31
 */
public class Huawei01 {
    public static void main(String[] args) {

    }

    // 1.1.1.1.. 1.1.1.1
    public static void checkIpList(String ipList) {
        int i = 0;
        int j = 0;

        char[] chs = ipList.toCharArray();

        Stack<Integer> stack = new Stack<>();
        int tmpIndex = 0;
        int tmpNum = 0;
        boolean firstIsDot = false;
        while (i < chs.length && j < chs.length) {
            if (tmpIndex == 0 && chs[j] == '.') {
                firstIsDot = true;
            }

            if (chs[j] != '.') {
                if (tmpNum == 0) {

                }
                tmpNum += (chs[j] - '0') * 10;
            } else {
                stack.push(tmpNum);
            }

            if (stack.size() == 4) {
                if (!firstIsDot) {
                    boolean flag = checkIp(stack);
                    System.out.println(flag);
                } else if (j + 1 < chs.length && chs[j + 1] == '.') {
                    System.out.println(false);
                }
            }
        }
    }

    public static boolean checkIp(Stack<Integer> stack) {
        int index = 0;
        while (!stack.isEmpty()) {
            int tmp = stack.pop();
            if (index == 0 && tmp == 0) return false;
            if (tmp < 0 && tmp > 255) return false;
        }

        return true;
    }
}
