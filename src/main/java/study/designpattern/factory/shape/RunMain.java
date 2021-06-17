package study.designpattern.factory.shape;

/**
 * @Author 杜佳佳
 * @Date 2021/5/12-15:57
 * @@Version 1.0
 */
public class RunMain {
    public static void main(String[] args) {
        // 首先创建一个工厂 -- 相当于114
        ShapeProduct shapeProduct = new ShapeProduct();
        // 根据不同的类型 返回一个 具体的有实际生产力的厂家 ; 先告诉114客服 你要查哪的电话 ,会告诉你真实有效的
        ShapeFactory circle = shapeProduct.getShape(ShapeEnum.CIRCLE);
        // 调用方法
        circle.draw();
    }
}
