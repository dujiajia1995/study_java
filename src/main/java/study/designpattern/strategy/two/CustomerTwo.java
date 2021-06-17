package study.designpattern.strategy.two;

import study.designpattern.factory.shopping.AcceptType;
import study.designpattern.factory.shopping.DiscountAcceptSupperImpl;
import study.designpattern.strategy.one.StrategyContextOne;

import java.math.BigDecimal;

/**
 * @Author 杜佳佳
 * @Date 2021/5/19-16:13
 * @@Version 1.0
 */
public class CustomerTwo {
    public static void main(String[] args) {
        System.out.println(new StrategyContextTwo(AcceptType.DISCOUNT).getResult(new BigDecimal(1000)));
    }
}
