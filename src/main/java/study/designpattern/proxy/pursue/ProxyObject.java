package study.designpattern.proxy.pursue;

import lombok.Data;

/**
 * @Author 杜佳佳
 * @Date 2021/5/20-10:06
 * @@Version 1.0
 */
@Data
public class ProxyObject extends Person implements GiveGift {

    private Boy boy;

    public ProxyObject(String name, Boy boy) {
        super(name);
        this.boy = boy;
    }

    @Override
    public void giveFlowers() {
        boy.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        boy.giveChocolate();
    }

    @Override
    public void giveHandbag() {
        boy.giveHandbag();
    }
}
