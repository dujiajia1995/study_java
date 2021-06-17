package study.serializables;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author 杜佳佳
 * @Date 2021/2/18-16:58
 * @@Version 1.0
 */
@Data
public class Person implements Serializable {
    private static final long serialVersionUID = 4L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
