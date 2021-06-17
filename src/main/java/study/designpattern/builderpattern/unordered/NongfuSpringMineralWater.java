package study.designpattern.builderpattern.unordered;

import java.math.BigDecimal;

/**
 * @Author 杜佳佳
 * @Date 2021/5/18-17:28
 * @@Version 1.0
 */
public class NongfuSpringMineralWater extends Drink {
    @Override
    public String name() {
        return "农夫山泉矿物质水";
    }

    @Override
    public BigDecimal getTotal() {
        return new BigDecimal(2);
    }
}
