import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/16 19:41
 */
public class Test {
    public static void main(String[] args) {
        int[] passSequence = {0,1,2,3,4,3,2,1,5,6,5,7,8,9,8,7,5,1,0};
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] numStrs = line.split(",");
        int[] sequence = new int[numStrs.length];

        for (int i = 0; i < numStrs.length; i++) {
            try {
                sequence[i] = Integer.parseInt(numStrs[i]);
                if (sequence[i] == -1) {
                    System.out.println("Out of path");
                    return;
                }
            } catch (Exception e) {
                System.out.println("Collision");
                return;
            }
        }

        int i = 0, j = 0;
        while (i < sequence.length && j < passSequence.length) {
            if (sequence[i] == passSequence[j]) {
                i++;
                j++;
            } else {
                i++;
            }
        }

        if (i == sequence.length && j == passSequence.length) {
            System.out.println("Success");
        }
    }
}
