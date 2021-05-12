package study.designpattern.factory.calculate;

/**
 * @Author 杜佳佳
 * @Date 2021/5/12-16:03
 * @@Version 1.0
 */
public class Add implements Calculate {
    @Override
    public int cal(int t, int t2) {
        return t + t2;
    }
}
