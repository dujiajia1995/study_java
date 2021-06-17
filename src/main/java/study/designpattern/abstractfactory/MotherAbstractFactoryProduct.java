package study.designpattern.abstractfactory;

import study.designpattern.abstractfactory.calculate.CalculateFactory;
import study.designpattern.abstractfactory.shape.ShapeFactory;

public class MotherAbstractFactoryProduct {

    public static MotherAbstractFactory getFactory(MotherAbstractFactoryType abstractFactoryType) {
        switch (abstractFactoryType) {
            case SHAPE:
                return new ShapeFactory();
            case CALCULATE:
                return new CalculateFactory();
            default:
                throw new IllegalArgumentException("无此类型");
        }

    }
}
