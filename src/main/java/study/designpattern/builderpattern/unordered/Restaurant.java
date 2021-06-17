package study.designpattern.builderpattern.unordered;

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
public class Restaurant {
    public static Meal vegetablesMeal() {
        Meal meal = new Meal();
        meal.addFood(new VegetablesHamburger());
        meal.addFood(new NongfuSpringMineralWater());
        return meal;
    }

    public static Meal happyMeal() {
        Meal meal = new Meal();
        meal.addFood(new ChickenHamburger());
        meal.addFood(new CocaCola());
        return meal;
    }

}
