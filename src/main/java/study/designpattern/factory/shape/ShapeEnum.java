package study.designpattern.factory.shape;

import lombok.AllArgsConstructor;

/**
 * 创建一个所有参数的构造方法
 */
@AllArgsConstructor
public enum ShapeEnum {
    CIRCLE("Circle"),
    RECTANGLE("Rectangle"),
    ;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
