package study.designpattern.factory.shopping;

public enum AcceptType {
    /**
     *
     */
    NORMAL("正常"),
    DISCOUNT("打折"),
    FULL_REDUCTION("满减"),
    ;
    private final String type;

    AcceptType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
