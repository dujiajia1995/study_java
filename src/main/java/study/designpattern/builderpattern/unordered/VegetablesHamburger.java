package study.designpattern.builderpattern.unordered;

import java.math.BigDecimal;

/**
 * @Author 杜佳佳
 * @Date 2021/5/18-17:25
 * @@Version 1.0
 */
public class VegetablesHamburger extends Hamburger {
    @Override
    public String name() {
        return "纯蔬菜汉堡";
    }

    @Override
    public BigDecimal getTotal() {
        return new BigDecimal(5);
    }

}
