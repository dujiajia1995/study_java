package study.designpattern.builderpattern.ordered;

/**
 * @Author 杜佳佳
 * @Date 2021/5/18-10:50
 * @@Version 1.0
 */
public class FatPersonBuildImpl implements PersonBuilder {
    @Override
    public void drawHead() {
        System.out.println("小头");
    }

    @Override
    public void drawNeck() {
        System.out.println("大粗脖子");

    }

    @Override
    public void drawBody() {
        System.out.println("大胖身体");
    }

    @Override
    public void drawArm() {
        System.out.println("大胖胳膊");
    }

    @Override
    public void drawLeg() {
        System.out.println("大胖腿");

    }
}
