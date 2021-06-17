package study.designpattern.singleton;

/**
 * @Author 杜佳佳
 * @Date 2021/5/13-9:37
 * @@Version 1.0
 */
public class Hungry {

    /**
     * 1. 构造方法私有化
     */
    private Hungry() {
    }

    /**
     * 2. 初始化
     */

    private static final Hungry HUNGRY = new Hungry();

    /**
     * 3. 提供 public 的获取方法
     */
    public static Hungry getInstance() {
        return HUNGRY;
    }

}
