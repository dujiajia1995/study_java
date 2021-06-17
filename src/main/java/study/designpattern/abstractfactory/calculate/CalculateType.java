package study.designpattern.abstractfactory.calculate;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum CalculateType {
    ADD("+"),
    DIV("/"),
    ;
    private String cal;
}
