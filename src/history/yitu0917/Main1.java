package history.yitu0917;

import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/17 19:03
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int preX = sc.nextInt(), preY = sc.nextInt(), preZ = sc.nextInt(), preTime = sc.nextInt();
        int result = 0;
        float highest = 0;
        for (int i = 1; i < n; i++) {
            int time = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int deltaX = x - preX;
            int deltaY = y - preY;
            int deltaZ = z - preZ;
            int deltaTime = time - preTime;

            preX = x;
            preY = y;
            preZ = z;

            int distance = deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ;
            float speed = distance / (deltaTime * deltaTime * 1.0f);
            if (speed > highest) {
                highest = speed;
                result = i;
            }
        }

        System.out.println(result);
    }
}
