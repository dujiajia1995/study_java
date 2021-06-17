package study.designpattern.singleton;

import lombok.Data;

/**
 * 多线程 懒汉式单例
 * <p>
 * 因为加锁,会导致性能降低
 *
 * @Author 杜佳佳
 * @Date 2021/5/12-17:37
 * @@Version 1.0
 */
@Data
public class MultiThreadedSlacker {

    /**
     * 构造方法私有化
     */
    private MultiThreadedSlacker() {
    }

    private static MultiThreadedSlacker singleThreadedSlacker;

    public static synchronized MultiThreadedSlacker getInstance() {
        if (singleThreadedSlacker == null) {
            singleThreadedSlacker = new MultiThreadedSlacker();
        }
        return singleThreadedSlacker;
    }

}
