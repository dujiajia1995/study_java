package study.designpattern.singleton;

/**
 * 针对 饿汉式 的 类加载就初始化,导致占用内存。 以及 懒汉式的 双重加锁方式的代码复杂
 * <p>
 * 故而 使用内部类 进行延迟加载的优化 ,当外部类被加载时 不会立即初始化。
 * <p>
 * 只有当显示调用  getInstance()时，才会 进行加载内部类，从而初始化
 *
 * @Author 杜佳佳
 * @Date 2021/5/13-10:24
 * @@Version 1.0
 */
public class InnerHungry {

    private InnerHungry() {

    }


    private static class InnerClass {
        private static final InnerHungry INNER_HUNGRY = new InnerHungry();
    }

    public static InnerHungry getInstance() {
        return InnerClass.INNER_HUNGRY;

    }


}
