package study.designpattern.factory.shopping;

import java.math.BigDecimal;

/**
 * @Author 杜佳佳
 * @Date 2021/5/19-13:42
 * @@Version 1.0
 */
public class NormalAcceptSupperImpl extends AcceptSupper {
    @Override
    public BigDecimal accept(BigDecimal total) {
        return total;
    }
}
