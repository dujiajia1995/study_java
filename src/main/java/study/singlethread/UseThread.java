package study.singlethread;

/**
 * @Author 杜佳佳
 * @Date 2021/2/18-11:00
 * @@Version 1.0
 */
public class UseThread {
    public static void main(String[] args) {
        // 继承 Thread 的创建
        FirstThread firstThread = new FirstThread();
        // 由jvm开始启动线程,调用run方法
        firstThread.start();
        // 强制停止线程的执行,不安全,不推荐已废弃,推荐使用 interrupt
//        firstThread.stop();
        // 中断线程的执行,推荐使用
        firstThread.interrupt();
        // 实现 Runnable
        Thread secondThread = new Thread(new SecondThread());
        // 手动 立即执行run方法,"非法" 不推荐
        secondThread.run();

        ThirdThread thirdThread = new ThirdThread();
        try {
            Integer call = thirdThread.call();
            System.out.println("1-100的合计"+call);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
