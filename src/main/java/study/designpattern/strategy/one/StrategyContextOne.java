package study.designpattern.strategy.one;

import lombok.AllArgsConstructor;
import lombok.Data;
import study.designpattern.factory.shopping.AcceptSupper;

import java.math.BigDecimal;

/**
 * @Author 杜佳佳
 * @Date 2021/5/19-16:11
 * @@Version 1.0
 */
@AllArgsConstructor
@Data
public class StrategyContextOne {

    private  AcceptSupper acceptSupper;

    public BigDecimal getResult(BigDecimal source) {
        return this.acceptSupper.accept(source);
    }
}
