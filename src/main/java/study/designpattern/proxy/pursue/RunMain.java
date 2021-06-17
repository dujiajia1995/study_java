package study.designpattern.proxy.pursue;

/**
 * @Author 杜佳佳
 * @Date 2021/5/20-10:12
 * @@Version 1.0
 */
public class RunMain {
    public static void main(String[] args) {

        Girl girl = new Girl("mm");

        ProxyObject proxyObject = new ProxyObject("代理", new Boy("gg", girl));
        proxyObject.giveHandbag();
        proxyObject.giveChocolate();
        proxyObject.giveFlowers();



    }
}
