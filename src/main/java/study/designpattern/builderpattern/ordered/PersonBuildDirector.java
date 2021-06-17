package study.designpattern.builderpattern.ordered;

/**
 * @Author 杜佳佳
 * @Date 2021/5/18-10:41
 * @@Version 1.0
 */
public class PersonBuildDirector {
    public static void getPerson(PersonBuilder personBuilder) {
        System.out.println("---------------------开始画人了---------------------------");
        personBuilder.drawHead();
        personBuilder.drawNeck();
        personBuilder.drawBody();
        personBuilder.drawArm();
        personBuilder.drawLeg();
        System.out.println("---------------------end---------------------------");
    }


}
