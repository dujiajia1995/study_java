package study.designpattern.factory.calculate;

/**
 * @Author 杜佳佳
 * @Date 2021/5/12-16:08
 * @@Version 1.0
 */
public class CalculateFactory {
    Calculate getCalculate(CalculateType type) {
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
