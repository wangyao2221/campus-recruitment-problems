package history.P0927;

/**
 * @author wangyao2221
 * @date 2020/9/25 15:20
 */
public class Huawei03 {
    public static void main(String[] args) {
        String[] mask = {"1101", "1010", "1111", "1110"};
        String[] chars = {"ABCD", "EFGH", "IJKL", "MNPQ"};
        System.out.println(fun(mask, chars));
    }

    public static String fun(String[] mask, String[] chars) {
        int n = mask.length;
//        List<int[]> zeroIndexes = new ArrayList<>();
        StringBuffer a = new StringBuffer();
        StringBuffer b = new StringBuffer();
        StringBuffer c = new StringBuffer();
        StringBuffer d = new StringBuffer();
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < mask.length; i++) {
            char[] chs = mask[i].toCharArray();
            for (int j = 0; j < chs.length; j++) {
                if (chs[i] == '0') {
                    a.append(chars[i].charAt(j));
                    b.append(chars[j].charAt(n - i - 1));
                    c.append(chars[n - i - 1].charAt(n - j - 1));
                    d.append(chars[n - j - 1].charAt(i));
                }
            }
        }

        result.append(a).append(b).append(c).append(d);
        return result.toString();

//        for (int i = 0; i < zeroIndexes.size(); i++) {
//            int x = zeroIndexes.get(i)[0];
//            int y = zeroIndexes.get(i)[1];
//            char ch = chars[y].charAt(n - x - 1);
//            result.append(ch);
//        }
//
//        for (int i = 0; i < zeroIndexes.size(); i++) {
//            int x = zeroIndexes.get(i)[0];
//            int y = zeroIndexes.get(i)[1];
//            char ch = chars[y].charAt(n - x - 1);
//            result.append(ch);
//        }
    }
}