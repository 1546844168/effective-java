package chapterTen;

import java.util.concurrent.TimeUnit;

/**
 * @author 江峰
 * @create 2019-11-21   11:05
 */
public class StopRequest {
    private static boolean stopRequest = false;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!getStopRequest()) {
                    i++;
                    System.out.println(i);
                }
            }
        }).start();
        TimeUnit.SECONDS.sleep(1);
        // stop();
        changeStopRequest();
    }

   /* public static void stop() {
        stopRequest = true;
    }*/

    public synchronized static void changeStopRequest() {
        stopRequest = true;
    }

    public synchronized static boolean getStopRequest() {
        return stopRequest;
    }

}

