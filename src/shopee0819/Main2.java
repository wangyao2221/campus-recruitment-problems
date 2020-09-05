package shopee0819;

import java.util.*;


public class Main2 {

    /**
     * 
     * @param s string字符串 
     * @return bool布尔型
     */
    public boolean checkValidString (String s) {
        char[] arr = new char[s.length()];
        return fun(s, arr, 0);
    }

    public static boolean fun(String str, char[] stackArr, int finish) {
        if (str.length() == 0) return true;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (ch == '(') {
                stackArr[finish] = '(';
                finish++;
            }
            if (ch == ')') {
                if (finish == 0) return false;
                if (stackArr[finish -  1] == '(') finish--;
                else return false;
            }

            if (ch == '*') {
                char[] tmpArr = stackArr.clone();

                boolean b1 = fun(str.substring(i + 1), tmpArr, finish);
                boolean b2 = fun("(" + str.substring(i + 1), tmpArr, finish);
                boolean b3 = fun(")" + str.substring(i + 1), tmpArr, finish);
                return b1 || b2 || b3;
            }
        }

        if (finish != 0) return false;
        return true;
    }
}