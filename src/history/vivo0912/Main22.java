package history.vivo0912;

/**
 * @author wangyao2221
 * @date 2020/9/12 20:51
 */
public class Main22 {
    public static void main(String[] args) {
        System.out.println(validPalindrome("abda"));
    }

    public static String validPalindrome(String s) {
        /*
        双指针法，遍历到不相等的字符时，判断子字符串是否构成回文
        比如abbca，i=1,j=3时子字符串为bbc,则分别判断bb，bc是否为回文
        */
        int i = 0, j = s.length()-1;

        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                String sub1 = s.substring(i, j);
                String sub2 = s.substring(i+1, j+1);
                if (isPalindrome(sub1)) {
                    return sub1;
                } else if (isPalindrome(sub2)) {
                    return sub2;
                }
            }
        }

        return "false";
    }

    public static boolean isPalindrome(String s) {
       /*
       双指针法，判断是不是回文
       */
        int i = 0, j = s.length()-1;
        while(i < j){
            if(s.charAt(i)-s.charAt(j) != 0) return false;
            i++;
            j--;
        }
        return true;
    }

}
