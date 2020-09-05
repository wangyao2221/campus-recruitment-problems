package history.iqiyi0823;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author wangyao2221
 * @date 2020/8/23 15:22
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chs = str.toCharArray();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < chs.length; i++) {
            if (chs[i] == '[' || chs[i] == '(' || chs[i] == '{') {
                stack.push(chs[i]);
            } else {
                char top = stack.peek();
                if (map.get(chs[i]) != top) {
                    System.out.println("False");
                    return;
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
