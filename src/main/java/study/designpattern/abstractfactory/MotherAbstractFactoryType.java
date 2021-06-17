package study.designpattern.abstractfactory;

public enum MotherAbstractFactoryType {
    /**
     *
     */
    SHAPE("shape"),
    /**
     *
     */
    CALCULATE("calculate"),
    ;
    /**
     * 类型
     */
    private final String type;

    MotherAbstractFactoryType(String type) {
        this.type = type;
    }
}
