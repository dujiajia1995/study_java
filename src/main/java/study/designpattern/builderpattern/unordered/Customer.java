package study.designpattern.builderpattern.unordered;

/**
 * @Author 杜佳佳
 * @Date 2021/5/19-9:42
 * @@Version 1.0
 */
public class Customer {
    public static void main(String[] args) {
        Meal meal = Restaurant.happyMeal();
        meal.showFood();
        System.out.println("总计:\t"+meal.getTotal());
    }
}
