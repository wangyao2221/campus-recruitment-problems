package history.huawei0819;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/8/19 18:58
 */
public class Main3 extends ArrayList {
    public Main3() {
    }
    // 先补全frame
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String frame = sc.nextLine();
//        String brick = sc.nextLine();
//
//        int[] frameArr = new int[frame.length()];
//        int[] brickArr = new int[brick.length()];
//
////        for (int i = 0; i < frameArr.length - brickArr.length; i++) {
////
////        }
//        int maxx = 0;
//        for (int i = 0; i < frameArr.length; i++) {
//            frameArr[i] = frame.charAt(i) - '0';
//            if (frameArr[i] > maxx) maxx = frameArr[i];
//        }
//
//        int num = 0;
//
//        for (int i = 0; i < frameArr.length; i++) {
//            num += maxx - frameArr[i];
//        }
//
//        int brickNum = Integer.parseInt(brick);
//        if (brickNum == num) System.out.println(0);
//        else if (brickNum > num) {
//            if ((brickNum - num) % maxx == 0) {
//                System.out.println((brickNum - num) / maxx);
//            } else {
//                System.out.println((brickNum - num) / maxx + 1);
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frame = sc.nextLine();
        String brick = sc.nextLine();

        int[][] fBlock = new int[10][4];
        int[][] bBlock = new int[10][4];
        int[] addFrame = new int[10];
        int fLen = frame.length();
        int bLen = brick.length();
        int dnum = 0;
        int minNum = Integer.MAX_VALUE;
        int maxNum = 0;

        int fHighest = 0;
        int bHighest = 0;
        for (int i = 0; i < fLen; i++) {
            if (fHighest < frame.charAt(i) - '0') {
                fHighest = frame.charAt(i) - '0';
            }
            for (int j = 0; j < frame.charAt(i) - '0'; i++) {
                fBlock[j][i] = 1;
            }
        }

        for (int i = 0; i < bLen; i++) {
            if (bHighest < brick.charAt(i) - '0') {
                bHighest = brick.charAt(i) - '0';
            }

            for (int j = 0; j < brick.charAt(i) - '0'; j++) {
                bBlock[j][i] = 1;
            }
        }

        for (int i = 0; i < fLen - bLen; i++) {
            int num = 0;
            int index = i;

            for (int j = 0; j < bLen; j++) {
                addFrame[i + j] = frame.charAt(i + j) - '0' + brick.charAt(j) - '0';
                if (num < addFrame[i + j]) {
                    num = addFrame[i + j];
                    index = i + j;
                }
            }
            for (int k = 0; k < bLen; k++) {
                for (int l = 0; l < bHighest; l++) {
                    if (bBlock[l][k] == 1) {
                        fBlock[num - l - 1][k + i] = 1;
                    }
                }
            }

            dnum = 0;

            for (int g = 0; g < num; g++) {
                int ss = 0;
                for (int h = 0; h < fLen; h++) {
                    ss += fBlock[g][h];
                }
                if (ss == fLen) {
                    dnum++;
                }
            }
            if (maxNum < dnum) {
                maxNum = dnum;
            }
            System.out.println(fHighest - maxNum);
        }
    }


    public static int clear(int[] frameArr, int[] brickArr, int index) {
        int result = 0;

        // 先把brick最小面一层给消除掉，首先找最高的一列


        return 0;
    }
}
