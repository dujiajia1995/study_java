package study.threads.morethread.testlock;

import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 利用重入锁 , 将某一类的 唤醒 signal signalAll 或 阻塞  await
 *
 * @Author 杜佳佳
 * @Date 2021/2/18-13:17
 * @@Version 1.0
 */
public class Storage2 {
    private static final int MAX_STOCK = 100;
    private int currentStock = 0;
    public static final Random RANDOM = new Random();

    private final Lock lock = new ReentrantLock();
    /**
     * 生产者
     */
    private final Condition producer = lock.newCondition();
    /**
     * 消费者
     */
    private final Condition consumer = lock.newCondition();

    /**
     * 增加库存---生产
     */
    public void addStock(String name, int addNum) throws InterruptedException {
        lock.lock();
        try {
            System.out.println(name + ":\t.....即将生产" + addNum + ".....当前库存:" + currentStock);
            while (currentStock + addNum > MAX_STOCK) {
                System.out.println(name + ":\t.....即将生产" + addNum + ".....当前库存:" + currentStock + "已满,停止生产....");
                producer.await();
            }
            currentStock += addNum;
            System.out.println(name + ":\t开始生产:\t" + addNum + "\t,当前库存:\t" + currentStock);
            consumer.signal();
        } finally {
            lock.unlock();
        }

    }

    /**
     * 减少库存---消费
     */
    public void subStock(String name, int subNum) throws InterruptedException {
        lock.lock();
        try {
            System.out.println(name + ":\t---即将消费" + subNum + "--当前库存:" + currentStock);
            while (currentStock - subNum < 0) {
                System.out.println(name + ":\t---即将消费" + subNum + "--当前库存:" + currentStock + "不足,停止出库");
                consumer.await();
            }
            currentStock -= subNum;
            System.out.println(name + ":\t--开始出库:\t" + subNum + "\t,当前库存:\t" + currentStock);
            producer.signal();
        } finally {
            lock.unlock();
        }
    }

}
