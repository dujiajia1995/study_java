package study.designpattern.builderpattern.unordered;

import java.math.BigDecimal;

/**
 * 包含  名字 价格 打包方式
 *
 * @Author 杜佳佳
 * @Date 2021/5/18-17:07
 * @@Version 1.0
 */
public abstract class Food {

    public abstract String name();

    public abstract Pack pack();

    public abstract BigDecimal getTotal();

    @Override
    public String toString() {
        return name() + ",打包方式:" + pack().packing() + ",金额" + getTotal();
    }
}
