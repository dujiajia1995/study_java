package study.designpattern.strategy.two;

import lombok.Data;
import study.designpattern.factory.shopping.*;

import java.math.BigDecimal;

/**
 * @Author 杜佳佳
 * @Date 2021/5/19-16:18
 * @@Version 1.0
 */
@Data
public class StrategyContextTwo {
    private AcceptSupper acceptSupper;

    public StrategyContextTwo(AcceptType acceptType) {
        switch (acceptType) {
            case NORMAL:
                acceptSupper = new NormalAcceptSupperImpl();
                break;
            case DISCOUNT:
                acceptSupper = new DiscountAcceptSupperImpl(new BigDecimal(8));
                break;
            case FULL_REDUCTION:
                acceptSupper = new FullReductionAcceptSupperImpl(new BigDecimal(500), BigDecimal.TEN);
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    public BigDecimal getResult(BigDecimal source) {
        return this.acceptSupper.accept(source);
    }
}
