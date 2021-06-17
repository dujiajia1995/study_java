package study.designpattern.factory.shopping;

import java.math.BigDecimal;

/**
 * @Author 杜佳佳
 * @Date 2021/5/19-14:17
 * @@Version 1.0
 */
public class DiscountAcceptSupperImpl extends AcceptSupper {

    public DiscountAcceptSupperImpl(BigDecimal discountRate) {
        super(discountRate);
    }

    /**
     * 正常
     *
     * @param total 原价
     * @return 实际
     */
    @Override
    public BigDecimal accept(BigDecimal total) {
        return total.multiply(super.discountRate());
    }
}
