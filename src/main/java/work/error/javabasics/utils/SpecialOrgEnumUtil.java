package work.error.javabasics.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import work.error.javabasics.OrgService;
import work.error.javabasics.enums.OrgEnum;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * 此工具类,是想 处理针对有一些数据项,只有特殊中心/部门才能看见 这种情况 而创建
 * 比如: 公司不想让一般中心/部门的员工知道 资产/耗材 的价格,只有财务中心啊 或者 领导层才能知道
 *
 * @Author 杜佳佳
 * @Date 2021/2/19-16:41
 * @@Version 1.0
 */
@Component
public class SpecialOrgEnumUtil {
    /**
     * 不想将 orgService 当作一个参数传进公共方法
     */
    @Autowired
    private OrgService orgService;
    /**
     * 因为工具类 需要用到 orgService ,又不能当作一个参数传入,所以利用 @Component 与 static
     */
    private static SpecialOrgEnumUtil specialOrgEnumUtil;

    /**
     * 配置 @Component 使用, 在创建bean后 调用
     */
    @PostConstruct
    public void init() {
        specialOrgEnumUtil = this;
    }
// 最开始
//    private static List<String> orgEnumList = new ArrayList<>();

    static {
        // 最开始想的就是 有 @Component 所以一启动项目时 就得 创建 对象,创建对象加载类执行 static代码块 调用方法, list 里就保存了特殊部门的id
        // 而 orgService 哪来呢, 通过 @PostConstruct 创建对象之后就执行 加了@PostConstruct的init()方法,
        // 此时 因为 有@Autowired所以 orgService 已经注入了this.orgService != null ,在 orgUtil = this
        // orgUtil.orgService != null 也是没有问题的, 思路没有问题,完美
        // 然后....启动就 空指针异常!!! 心态炸了,为啥呢,思路没有问题啊.还断点调试,为啥没有执行 init() 直接就执行了getShowField()
        // 百思不得其解
        // 后来就换了一个方法 , 在加一个枚举SpecialOrgEnum , key是 哪个模块的哪个字段  value 就是list,调用 此方法
        // 如何扩展?  在SpecialOrgEnum枚举中 加实例 在 此util里加方法初始化,先解决问题 再找原因-_-
        // 之后才反应过来,顺序的问题
        //  static--> 构造代码块 --> 构造方法
        //  有继承时 先 父类static --> 子类static --> 父类构造代码块 --> 父类构造方法 --> 子类构造代码块 --> 子类构造方法
        // ps: static 只执行一次

        // 最开始
//        getShowField();
    }

    public static final String SHOW_FIELD_KEY = "showFieldKey";

    public static List<String> getShowField() {
        List<String> orgEnumList = new ArrayList<>();
        orgEnumList.add(specialOrgEnumUtil.orgService.selectOrgByCode(OrgEnum.FINANCE_CENTER.getOrgCode()).getId());
        return orgEnumList;
    }
}
