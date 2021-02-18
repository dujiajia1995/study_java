package study.singlethread;

import java.util.concurrent.Callable;

/**
 * @Author 杜佳佳
 * @Date 2021/2/18-10:49
 * @@Version 1.0
 */
public class ThirdThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("implements Callable");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
