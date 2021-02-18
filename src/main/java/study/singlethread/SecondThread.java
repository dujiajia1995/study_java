package study.singlethread;

/**
 * @Author 杜佳佳
 * @Date 2021/2/18-10:49
 * @@Version 1.0
 */
public class SecondThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("implements Runnable==>"+i);
        }
    }
}
