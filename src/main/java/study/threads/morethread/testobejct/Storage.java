package study.threads.morethread.testobejct;

import java.util.Random;

/**
 * 利用 object 类的  wait 与 notify 或 notifyAll
 *
 * @Author 杜佳佳
 * @Date 2021/2/18-13:17
 * @@Version 1.0
 */
public class Storage {
    private static final int MAX_STOCK = 100;
    private int currentStock = 0;
    public static final Random RANDOM = new Random();

    /**
     * 增加库存---生产
     */
    public synchronized void addStock(String name, int addNum) throws InterruptedException {
        System.out.println(name + ":\t.....即将生产" + addNum + ".....当前库存:" + currentStock);
        while (currentStock + addNum > MAX_STOCK) {
            System.out.println(name + ":\t.....即将生产" + addNum + ".....当前库存:" + currentStock + "已满,停止生产....");
            wait();
        }
        currentStock += addNum;
        System.out.println(name + ":\t开始生产:\t" + addNum + "\t,当前库存:\t" + currentStock);
        notify();
    }

    /**
     * 减少库存---消费
     */
    public synchronized void subStock(String name, int subNum) throws InterruptedException {
        System.out.println(name + ":\t---即将消费" + subNum + "--当前库存:" + currentStock);
        while (currentStock - subNum < 0) {
            System.out.println(name + ":\t---即将消费" + subNum + "--当前库存:" + currentStock + "不足,停止出库");
            wait();
        }
        currentStock -= subNum;
        System.out.println(name + ":\t--开始出库:\t" + subNum + "\t,当前库存:\t" + currentStock);
        notify();
    }

}
