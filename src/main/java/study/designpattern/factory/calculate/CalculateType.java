package study.designpattern.factory.calculate;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum CalculateType {
    ADD("+"),
    DIV("/"),
    ;
    private String cal;
}
