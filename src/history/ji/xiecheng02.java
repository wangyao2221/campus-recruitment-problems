package history.ji;

import java.util.*;

public class xiecheng02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String sentense = in.nextLine();
        String newWord = in.nextLine();
        char[] wordArr = word.toCharArray();
//        int [] arr = new int[wordArr.length];
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < wordArr.length; i++) {
            set.add(wordArr[i]);
        }
        int count = 0;
        String[] strArr = sentense.split(" " );
//        for (int i = 0; i < strArr.length; i++) {
//            System.out.println(strArr[i]);
//        }
        int len = word.length();
        for (int i = 0; i < strArr.length; i++) {
            StringBuilder rz = new StringBuilder();
            count = 0;
            HashSet<Character> tmp = new HashSet<>();
            for (int j = 0; j < strArr[i].length(); j++) {
                char tmpChar = strArr[i].charAt(j);
                if(tmpChar == '.'){
                    if(count == len){
                        rz.append(newWord);
                        rz.append(".");
                        count = 0;
                        continue;
                    }
                    else{
                        rz.append(strArr[i].subSequence(0,j));
                        count = 0;
                        rz.append(".");
                        continue;
                    }
                }
                if(tmpChar == ','){
                    if(count == len){
                        rz.append(newWord);
                        rz.append(",");
                        count = 0;
                        continue;
                    }
                    else{
                        rz.append(strArr[i].subSequence(0,j));
                        rz.append(",");
                        count = 0;
                        continue;
                    }
                }
                if(count == len)break;
                if(set.contains(tmpChar)){
                    count ++;
                    tmp.add(tmpChar);
                }
                else {
                    break;
                }
            }
            if(count >= len){
                rz.append(newWord);
                strArr[i] = rz.toString();
            }
            if(rz.length()!=0){
                strArr[i] = rz.toString();
            }

        }
        StringBuilder svb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if(i != strArr.length - 1) svb.append(strArr[i] + " ");
            else svb.append(strArr[i]);
        }
        System.out.println(svb.toString());


//        int len = set.size();
//        int i = 0;
//        int j = 0;
//        StringBuilder sb = new StringBuilder();
//        int flag = 1;
//        int count = 0;
//        while (j < sentense.length()){
//            char tmp = sentense.charAt(j);
//            if(set.contains(tmp)){
//                count++;
//            }
//            else{
//                if(i == j){
//                    sb.append(sentense.charAt(j));
//                }
//                if(count < len)
//                else sb.append(sentense.subSequence(i,j));
//
//            }
//            j++;
//        }
    }
}
