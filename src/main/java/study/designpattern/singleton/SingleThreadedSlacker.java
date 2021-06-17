package study.designpattern.singleton;

import lombok.Data;

/**
 * 单线程 懒汉式单例
 * <p>
 * 多线程不适用
 *
 * @Author 杜佳佳
 * @Date 2021/5/12-17:37
 * @@Version 1.0
 */
@Data
public class SingleThreadedSlacker {

    /**
     * 构造方法私有化
     */
    private SingleThreadedSlacker() {
    }

    private static SingleThreadedSlacker singleThreadedSlacker;

    public static SingleThreadedSlacker getInstance() {
        if (singleThreadedSlacker == null) {
            singleThreadedSlacker = new SingleThreadedSlacker();
        }
        return singleThreadedSlacker;
    }

}
