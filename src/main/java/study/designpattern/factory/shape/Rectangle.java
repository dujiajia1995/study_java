package study.designpattern.factory.shape;

/**
 * 矩形
 *
 * @Author 杜佳佳
 * @Date 2021/5/12-15:45
 * @@Version 1.0
 */
public class Rectangle implements ShapeFactory {
    /**
     * 进行自己独有的逻辑
     */
    @Override
    public void draw() {
        System.out.println("这是一个矩形");
    }
}
