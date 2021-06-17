package study.designpattern.abstractfactory;

import study.designpattern.abstractfactory.shape.Shape;
import study.designpattern.abstractfactory.shape.ShapeEnum;

/**
 * @Author 杜佳佳
 * @Date 2021/5/13-16:50
 * @@Version 1.0
 */
public class AbstractFactoryMain {
    public static void main(String[] args) {
        MotherAbstractFactory shapeAbstractFactory = MotherAbstractFactoryProduct.getFactory(MotherAbstractFactoryType.SHAPE);
        Shape circle = shapeAbstractFactory.getShape(ShapeEnum.CIRCLE);
        circle.draw();
    }
}
