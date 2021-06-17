package study.designpattern.abstractfactory.shape;

import study.designpattern.abstractfactory.MotherAbstractFactory;
import study.designpattern.abstractfactory.calculate.Calculate;
import study.designpattern.abstractfactory.calculate.CalculateType;

/**
 * @Author 杜佳佳
 * @Date 2021/5/12-15:50
 * @@Version 1.0
 */
public class ShapeFactory implements MotherAbstractFactory {

    @Override
    public Shape getShape(ShapeEnum shapeEnum) {
        switch (shapeEnum) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            default:
                throw new IllegalArgumentException("无此类型");
        }
    }

    @Override
    public Calculate getCalculate(CalculateType calculateType) {
        throw new IllegalArgumentException("不支持的");

    }
}
