package study.designpattern.abstractfactory;

import study.designpattern.abstractfactory.calculate.Calculate;
import study.designpattern.abstractfactory.calculate.CalculateType;
import study.designpattern.abstractfactory.shape.Shape;
import study.designpattern.abstractfactory.shape.ShapeEnum;

public interface MotherAbstractFactory {

    Shape getShape(ShapeEnum shapeEnum);

    Calculate getCalculate(CalculateType calculateType);

}
