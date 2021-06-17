package study.designpattern.abstractfactory.calculate;

/**
 * @Author 杜佳佳
 * @Date 2021/5/12-16:06
 * @@Version 1.0
 */
public class Div implements Calculate {
    @Override
    public int cal(int t, int t2) {
        if (t2 == 0) {
            throw new ArithmeticException();
        }
        return t / t2;
    }
}
