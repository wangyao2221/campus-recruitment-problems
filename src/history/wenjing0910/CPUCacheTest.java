package history.wenjing0910;

import java.util.concurrent.TimeUnit;

public class CPUCacheTest {
    private static boolean stop = false;

    public static void main(String[] args) {
        Thread a = new Thread("B") {
            public void run() {
                while (!stop) {
                    int a = 1;
//                    pause(1);
                }
                System.out.println("exit");
            }
        };
        a.start();
        pause(100);
        //停止标记，但未能停止线程B
        stop = true;
    }

    public static void pause(int time) {
        try {
            TimeUnit.MILLISECONDS.sleep(time);
        } catch (Exception ex) {
        }
    }
}