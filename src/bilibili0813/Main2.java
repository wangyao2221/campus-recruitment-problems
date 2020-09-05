package bilibili0813;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author wangyao2221
 * @date 2020/8/13 18:58
 */
public class Main2 {
    static HashMap<Character, Character> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(new Main2().IsValidExp("([)]"));
    }

    public boolean IsValidExp_ (String s) {
        char[] stackArr = new char[s.length()];
        int p = -1;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stackArr[++p] = ')';
            } else if (ch == '[') {
                stackArr[++p] = ']';
            } else if (ch == '{') {
                stackArr[++p] = '}';
            } else if (p >= 0) {
                char top = stackArr[p];

                if (top == ch) p--;
                else return false;
            } else {
                return false;
            }
        }

        return p < 0;
    }

    public boolean IsValidExp (String s) {
        // write code here
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                char top = stack.empty() ? '#' : stack.pop();
                if (top != map.get(ch)) {
                    return false;
                } else {
                    stack.push(ch);
                }
            }
        }

        return stack.isEmpty();
    }

//    public boolean IsValidExp (String s) {
//        // write code here
//        char[] chs = s.toCharArray();
//        int rz = check(chs);
//        if (rz == 1) return true;
//        if (rz == 0) return true;
//        return false;
//    }

    public int check(char[] str) {
        int len = str.length;
        if (len == 0) return 1;
        if (len == 1) return 0;
        int i = 0;
        int j = len - 1;

        while (i < j) {
            if (checkFlag(str[i], str[j])) {
                return 0;
            }
            i++;
            j--;
        }

        return 1;
    }

    private boolean checkFlag(char c1, char c2) {
        if (c1 == ' ' && c2 == ' ') return true;
        if (c1 == '{' && c2 == '}') return true;
        if (c1 == '(' && c2 == ')') return true;
        if (c1 == '[' && c2 == ']') return true;
        return false;
    }
}
