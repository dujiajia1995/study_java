package study.basic.copy.shallow;

import study.common.Address;
import study.common.Student;

/**
 * @Author 杜佳佳
 * @Date 2021/1/13-11:17
 * @@Version 1.0
 */
public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建一个地址 北京通州
        Address beiJingTongZhou = new Address("北京", "北京", "通州");
        // 创建一个 学生 小明
        Student xiaoMing = new Student("小明", 28);
        // 将
        xiaoMing.setAddress(beiJingTongZhou);
        // 看一下小明的信息
        toPrint(xiaoMing);
        Address tianJinNanKai = new Address("天津", "天津", "南开");
        // 使用 clone() 必须实现 Cloneable 并且 重写 clone
        Student daMing = (Student) xiaoMing.clone();
        // 看一下小明的信息
        System.out.println("使用 Object的clone看看复制的大明");
        toPrint(daMing);
        System.out.println("大明不一定比小明大,小寒肯定比大寒冷,毕竟三九天在小寒");
        daMing.setName("大明");
        daMing.setAge(18);
        System.out.println("修改大明基本信息后最新的大小明信息");
        toPrint(xiaoMing);
        toPrint(daMing);
        System.out.println("修改大明的籍贯为昌平后 后最新的大小明信息");
        daMing.getAddress().setProvinces("昌平");
        toPrint(xiaoMing);
        toPrint(daMing);
        System.out.println("修改大明的籍贯为天津南开后 后最新的大小明信息");
        daMing.setAddress(tianJinNanKai);
        toPrint(xiaoMing);
        toPrint(daMing);
    }

    public static void toPrint(Student student) {
        System.out.println(student);
        System.out.println("hashCode：\t" + student.hashCode());
    }
}
