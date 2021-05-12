package study.designpattern.factory.calculate;

/**
 * @Author 杜佳佳
 * @Date 2021/5/12-16:11
 * @@Version 1.0
 */
public class RunMain {
    public static void main(String[] args) {
        CalculateFactory calculateFactory = new CalculateFactory();
        System.out.println(calculateFactory.getCalculate(CalculateType.ADD).cal(50, 80));
        System.out.println(calculateFactory.getCalculate(CalculateType.DIV).cal(65329865, 6542));
        System.out.println(calculateFactory.getCalculate(CalculateType.DIV).cal(50, 0));
    }
}
