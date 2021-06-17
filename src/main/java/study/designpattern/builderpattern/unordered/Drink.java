package study.designpattern.builderpattern.unordered;

/**
 * 饮料
 *
 * @Author 杜佳佳
 * @Date 2021/5/18-17:13
 * @@Version 1.0
 */
public abstract class Drink extends Food {
    @Override
    public Pack pack() {
        return new Bottle();
    }
}
