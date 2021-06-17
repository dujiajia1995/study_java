package study.designpattern.abstractfactory.calculate;

import study.designpattern.abstractfactory.MotherAbstractFactory;
import study.designpattern.abstractfactory.shape.Shape;
import study.designpattern.abstractfactory.shape.ShapeEnum;

/**
 * @Author 杜佳佳
 * @Date 2021/5/12-16:08
 * @@Version 1.0
 */
public class CalculateFactory implements MotherAbstractFactory {
    @Override
    public Shape getShape(ShapeEnum shapeEnum) {
        throw new IllegalArgumentException("不支持的");
    }

    @Override
    public Calculate getCalculate(CalculateType type) {
        switch (type) {
            case ADD:
                return new Add();
            case DIV:
                return new Div();
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }
}
