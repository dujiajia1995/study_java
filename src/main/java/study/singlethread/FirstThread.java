package study.singlethread;

/**
 * @Author 杜佳佳
 * @Date 2021/2/18-10:49
 * @@Version 1.0
 */
public class FirstThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("extends Thread==>"+i);
        }
    }
}
