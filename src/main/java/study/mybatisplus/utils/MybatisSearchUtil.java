package study.mybatisplus.utils;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.google.common.base.CaseFormat;
import lombok.val;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author 杜佳佳
 * @Date 2021/2/3-14:20
 * @@Version 1.0
 */
public class MybatisSearchUtil {

    /**
     * 针对  以 Start 或者 End 结尾的 进行 区间检索
     * 如 gmtCreateStart,gmtCreateEnd 检索 gmt_create >= gmtCreateStart , gmt_create <= gmtCreateEnd
     * @param wrapper wrapper
     * @param param 参数
     * @param <T> 泛型
     */
    public static <T> void setAuto(QueryWrapper<T> wrapper, Model<?> param) throws Exception {
        if (param != null) {
            val paramClass = param.getClass();
            // 获取 所有公共方法 + 继承的 公共方法
            Method[] methods = paramClass.getMethods();
            // 获取 所有本类独有所有方法 不包括继承的
            Method[] declaredMethods = paramClass.getDeclaredMethods();
            // 方法去重
            AtomicReference<HashSet<Method>> allMethod = new AtomicReference<>(new HashSet<>());
            allMethod.get().addAll(Arrays.asList(methods));
            allMethod.get().addAll(Arrays.asList(declaredMethods));
            List<Method> collect = new ArrayList<>();
            // 获取特殊方法
            for (Method declaredMethod : declaredMethods) {
                // 首先得是 get方法
                if (declaredMethod.getName().startsWith("get")) {
                    // 再次要get中的 以 Start 或者 End 结尾的 方法
                    if (declaredMethod.getName().endsWith("Start") || declaredMethod.getName().endsWith("End")) {
                        collect.add(declaredMethod);
                    }
                }
            }
            if (collect.size() == 0) {
                // 没有任何一个方法 是这个条件的直接返回
                return;
            }
            for (Method method : collect) {
                String name = method.getName();
                Object result = method.invoke(param);
                if (String.class.isAssignableFrom(method.getReturnType())) {
                    if (StringUtils.isBlank((CharSequence) result)) {
                        // 是 String 类型的 结果为 null  ""  "任意空格" 等直接返回
                        continue;
                    }
                } else if (result == null) {
                    // 除了 string 类型的 结果 为 null  直接返回
                    continue;
                }

                boolean start = name.endsWith("Start");
                String substring;
                if (start) {
                    // 以 start 结尾的 从 get后截取到 start之前
                    substring = name.substring(3, name.length() - "Start".length());
                } else {
                    // 以 end 结尾的 从 get后截取到 end 之前
                    substring = name.substring(3, name.length() - "end".length());
                }
                char[] chars = substring.toCharArray();
                // 首字母小写
                chars[0] += 32;
                String filedName = String.valueOf(chars);
                // 驼峰命名 转换为 _ 分割
                String camelName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, filedName);
                if (start) {
                    // 以 start 结尾的 sql 用 >=
                    wrapper.ge(camelName, result);
                } else {
                    // 以 start 结尾的 sql 用 <=
                    wrapper.le(camelName, result);
                }
            }
        }


    }

}
