package study.designpattern.singleton;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 考虑到 多线程 开始就加锁 影响性能,所以先不加锁
 * <p>
 * 同时 考虑并发因素 , 加锁后 再次 判空
 *
 * @Author 杜佳佳
 * @Date 2021/5/13-10:01
 * @@Version 1.0
 */
public class CheckLockSlacker {
    private CheckLockSlacker() {
    }

    private static CheckLockSlacker checkLockSlacker;

    private static final ReentrantLock reentrantLock = new ReentrantLock();

    public static CheckLockSlacker getInstance() {
        if (checkLockSlacker == null) {
            reentrantLock.lock();
            try {
                if (checkLockSlacker == null) {
                    checkLockSlacker = new CheckLockSlacker();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                reentrantLock.unlock();

            }
        }
        return checkLockSlacker;
    }
}
