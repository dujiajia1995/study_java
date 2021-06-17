package study.designpattern.strategy.one;

import study.designpattern.factory.shopping.DiscountAcceptSupperImpl;

import java.math.BigDecimal;

/**
 * @Author 杜佳佳
 * @Date 2021/5/19-16:13
 * @@Version 1.0
 */
public class CustomerOne {
    public static void main(String[] args) {
        DiscountAcceptSupperImpl discountAcceptSupper = new DiscountAcceptSupperImpl(new BigDecimal(6));
        System.out.println(new StrategyContextOne(discountAcceptSupper).getResult(new BigDecimal(1000)));
    }
}
