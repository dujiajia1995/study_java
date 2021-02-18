package study.threads.morethread.testqueue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 利用阻塞队列 BlockingQueue
 *
 * @Author 杜佳佳
 * @Date 2021/2/18-13:17
 * @@Version 1.0
 */
public class Storage3 {
    private static final int MAX_STOCK = 100;
    private int currentStock = 0;
    public static final Random RANDOM = new Random();
    /**
     * 使用阻塞队列
     */
    ArrayBlockingQueue<Object> arrayBlockingQueue = new ArrayBlockingQueue<>(4);

    /**
     * 增加库存---生产
     */
    public void addStock(String name, int addNum) throws InterruptedException {
        System.out.println(name + ":\t.....即将生产" + addNum + ".....当前库存:" + currentStock);
        while (currentStock + addNum > MAX_STOCK) {
            System.out.println(name + ":\t.....即将生产" + addNum + ".....当前库存:" + currentStock + "已满,停止生产....");
            // 超过容量自动阻塞,等待take 唤醒
            arrayBlockingQueue.put(new Object());
        }
        currentStock += addNum;
        System.out.println(name + ":\t开始生产:\t" + addNum + "\t,当前库存:\t" + currentStock);

    }

    /**
     * 减少库存---消费
     */
    public void subStock(String name, int subNum) throws InterruptedException {
        System.out.println(name + ":\t---即将消费" + subNum + "--当前库存:" + currentStock);
        while (currentStock - subNum < 0) {
            System.out.println(name + ":\t---即将消费" + subNum + "--当前库存:" + currentStock + "不足,停止出库");
            // 容量不足自动阻塞,等待put 唤醒
            arrayBlockingQueue.take();
        }
        currentStock -= subNum;
        System.out.println(name + ":\t--开始出库:\t" + subNum + "\t,当前库存:\t" + currentStock);
    }

}
