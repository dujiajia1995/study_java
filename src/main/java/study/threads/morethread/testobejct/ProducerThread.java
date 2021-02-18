package study.threads.morethread.testobejct;

import lombok.SneakyThrows;

/**
 * @Author 杜佳佳
 * @Date 2021/2/18-13:29
 * @@Version 1.0
 */
public class ProducerThread implements Runnable {
    private final Storage storage;
    private final String name;

    public ProducerThread(Storage storage, String name) {
        this.storage = storage;
        this.name = name;
    }

    @SneakyThrows
    @Override
    public void run() {
        int addNum = Storage.RANDOM.nextInt(10) + 1;
        storage.addStock(name, addNum);
    }
}
