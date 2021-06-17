package study.designpattern.builderpattern.unordered;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 餐品
 * <p>
 * 包含 属性： 食物
 * <p>
 * 包含方法： 装入食物 计算总价 查看食物
 *
 * @Author 杜佳佳
 * @Date 2021/5/18-17:02
 * @@Version 1.0
 */
public class Meal {

    private List<Food> foodList = new ArrayList<>();

    public void addFood(Food food) {
        foodList.add(food);
    }


    public BigDecimal getTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (Food food : foodList) {
            total = total.add(food.getTotal());
        }
        return total;
    }

    public void showFood() {
        for (Food food : foodList) {
            System.out.println(food);
        }
    }
}
