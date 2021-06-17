package study.designpattern.factory.shopping;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * 注解 @Accessors作用: 以属性名为getter/setter方法名
 *
 * @author E0267
 */
@Data
@Accessors(fluent = true)
public abstract class AcceptSupper {
    /**
     * 折扣
     */
    private BigDecimal discountRate;
    /**
     * 满减条件
     */
    private BigDecimal condition;
    /**
     * 满减金额
     */
    private BigDecimal reduction;

    AcceptSupper(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }

    AcceptSupper() {

    }

    AcceptSupper(BigDecimal condition, BigDecimal reduction) {
        this.condition = condition;
        this.reduction = reduction;
    }

    /**
     * 正常
     *
     * @param total 原价
     * @return 实际
     */
    public abstract BigDecimal accept(BigDecimal total);

}
