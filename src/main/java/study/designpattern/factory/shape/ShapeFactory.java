package study.designpattern.factory.shape;

/**
 * 抽象类, 对外均使用 这个抽象类操作
 *
 * @Author 杜佳佳
 * @Date 2021/5/12-15:45
 * @@Version 1.0
 */
public interface ShapeFactory {
    /**
     * 对外暴露的方法
     */
    void draw();
}
