package study.designpattern.proxy.pursue;

import lombok.Data;

/**
 * @Author 杜佳佳
 * @Date 2021/5/20-10:06
 * @@Version 1.0
 */
@Data
public class Boy extends Person implements GiveGift {

    private Girl girl;

    public Boy(String name, Girl girl) {
        super(name);
        this.girl = girl;
    }

    @Override
    public void giveFlowers() {
        System.out.println("给你花");

    }

    @Override
    public void giveChocolate() {
        System.out.println("送你巧克力");
    }

    @Override
    public void giveHandbag() {
        System.out.println("送你包");
    }
}
