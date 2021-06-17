package study.serializables;

import java.io.*;

/**
 * @Author 杜佳佳
 * @Date 2021/2/18-16:58
 * @@Version 1.0
 */
public class TestNoSerializable {
    public static void main(String[] args) throws Exception {
        Person zhangSan = new Person("张三", 18);

        File file = new File("testSerializable.txt");
        if (!file.exists()) {
            if (!file.createNewFile()) {
                System.out.println("创建" + file + "失败");
                return;
            }
        }

//        write(file,zhangSan);
        read(file);

    }
    public  static  void write(File file,Person zhangSan) throws  Exception {
        System.out.println(file.getAbsolutePath());
        System.out.println("写入文件: "+ zhangSan);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(zhangSan);
        outputStream.close();
        fileOutputStream.close();
    }
    public  static  void read(File file) throws  Exception {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person  zhangSan2 = (Person) objectInputStream.readObject();
        System.out.println("读取文件:"+zhangSan2);
        fileInputStream.close();
        objectInputStream.close();
    }
}
