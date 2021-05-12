package study.designpattern.factory.shape;

/**
 * @Author 杜佳佳
 * @Date 2021/5/12-15:50
 * @@Version 1.0
 */
public class ShapeFactory {

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
}
