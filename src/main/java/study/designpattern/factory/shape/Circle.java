package study.designpattern.factory.shape;

/**
 * 圆型
 *
 * @Author 杜佳佳
 * @Date 2021/5/12-15:49
 * @@Version 1.0
 */
public class Circle implements ShapeFactory {
    /**
     * 进行自己独有的逻辑
     */
    @Override
    public void draw() {
        System.out.println("圆形");
    }
}
