package study.threads.morethread.testlock;

import lombok.SneakyThrows;

/**
 * @Author 杜佳佳
 * @Date 2021/2/18-13:29
 * @@Version 1.0
 */
public class ProducerThread2 implements Runnable {
    private final Storage2 storage2;
    private final String name;

    public ProducerThread2(Storage2 storage2, String name) {
        this.storage2 = storage2;
        this.name = name;
    }

    @SneakyThrows
    @Override
    public void run() {
        int addNum = Storage2.RANDOM.nextInt(10) + 1;
        storage2.addStock(name, addNum);
    }
}
