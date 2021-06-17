package study.designpattern.factory.shopping;

import java.math.BigDecimal;

/**
 * @Author 杜佳佳
 * @Date 2021/5/19-14:42
 * @@Version 1.0
 */
public class AcceptFactory {

    public static AcceptSupper getAcceptSupper(AcceptType acceptType) {
        switch (acceptType) {
            case NORMAL:
                return new NormalAcceptSupperImpl();
            case DISCOUNT:
                return new DiscountAcceptSupperImpl(new BigDecimal(8));
            case FULL_REDUCTION:
                return new FullReductionAcceptSupperImpl(new BigDecimal(500), BigDecimal.TEN);
            default:
                throw new IllegalArgumentException();
        }

    }
}
