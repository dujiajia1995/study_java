package study.threads.morethread.testlock;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author 杜佳佳
 * @Date 2021/2/18-13:34
 * @@Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        Storage2 storage2 = new Storage2();
        // 创建定长 10 的线程池
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
        // 4 个生产线程
        scheduledExecutorService.scheduleWithFixedDelay(new ProducerThread2(storage2,"生产"),0,500, TimeUnit.MILLISECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new ProducerThread2(storage2,"生产"),0,500, TimeUnit.MILLISECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new ProducerThread2(storage2,"生产"),0,500, TimeUnit.MILLISECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new ProducerThread2(storage2,"生产"),0,500, TimeUnit.MILLISECONDS);
        // 6个消费线程
        scheduledExecutorService.scheduleWithFixedDelay(new ConsumerThread2(storage2,"消费"),0,500, TimeUnit.MILLISECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new ConsumerThread2(storage2,"消费"),0,500, TimeUnit.MILLISECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new ConsumerThread2(storage2,"消费"),0,500, TimeUnit.MILLISECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new ConsumerThread2(storage2,"消费"),0,500, TimeUnit.MILLISECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new ConsumerThread2(storage2,"消费"),0,500, TimeUnit.MILLISECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new ConsumerThread2(storage2,"消费"),0,500, TimeUnit.MILLISECONDS);

    }
}
