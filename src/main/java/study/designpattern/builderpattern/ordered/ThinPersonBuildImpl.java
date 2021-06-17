package study.designpattern.builderpattern.ordered;

/**
 * @Author 杜佳佳
 * @Date 2021/5/18-10:48
 * @@Version 1.0
 */
public class ThinPersonBuildImpl implements PersonBuilder {
    @Override
    public void drawHead() {
        System.out.println("大头");
    }

    @Override
    public void drawNeck() {
        System.out.println("细脖子");

    }

    @Override
    public void drawBody() {
        System.out.println("小身体");
    }

    @Override
    public void drawArm() {
        System.out.println("小细胳膊");
    }

    @Override
    public void drawLeg() {
        System.out.println("小细腿");

    }
}
