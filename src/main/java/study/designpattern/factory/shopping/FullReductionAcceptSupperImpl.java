package study.designpattern.factory.shopping;

import java.math.BigDecimal;

/**
 * @Author 杜佳佳
 * @Date 2021/5/19-13:43
 * @@Version 1.0
 */
public class FullReductionAcceptSupperImpl extends AcceptSupper {

    public  FullReductionAcceptSupperImpl(BigDecimal condition, BigDecimal reduction) {
        super(condition, reduction);
    }

    /**
     * 满减
     *
     * @param total 原价
     * @return 实际
     */
    @Override
    public BigDecimal accept(BigDecimal total) {
        if (total.compareTo(super.condition()) > 0) {
            return total.subtract(super.reduction());
        }
        return total;
    }
}
