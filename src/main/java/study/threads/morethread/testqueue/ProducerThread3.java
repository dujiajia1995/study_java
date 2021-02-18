package study.threads.morethread.testqueue;

import lombok.SneakyThrows;

/**
 * @Author 杜佳佳
 * @Date 2021/2/18-13:29
 * @@Version 1.0
 */
public class ProducerThread3 implements Runnable {
    private final Storage3 storage3;
    private final String name;

    public ProducerThread3(Storage3 storage3, String name) {
        this.storage3 = storage3;
        this.name = name;
    }

    @SneakyThrows
    @Override
    public void run() {
        int addNum = Storage3.RANDOM.nextInt(10) + 1;
        storage3.addStock(name, addNum);
    }
}
