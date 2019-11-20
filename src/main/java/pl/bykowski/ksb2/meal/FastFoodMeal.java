package pl.bykowski.ksb2.meal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@TypeOfFood(foodType = FoodType.FAST_FOOD)
public class FastFoodMeal extends KitchenMeal {

    @Override
    public String getName() {
        return "fast-food meal";
    }
}