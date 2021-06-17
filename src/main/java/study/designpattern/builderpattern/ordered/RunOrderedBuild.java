package study.designpattern.builderpattern.ordered;

/**
 * @Author 杜佳佳
 * @Date 2021/5/18-10:51
 * @@Version 1.0
 */
public class RunOrderedBuild {
    public static void main(String[] args) {
        PersonBuildDirector.getPerson(new FatPersonBuildImpl());
        PersonBuildDirector.getPerson(new ThinPersonBuildImpl());

    }
}
