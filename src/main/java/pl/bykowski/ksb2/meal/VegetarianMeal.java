package pl.bykowski.ksb2.meal;

import org.springframework.stereotype.Component;

@Component
@TypeOfFood(foodType = FoodType.VEGE)
public class VegetarianMeal extends KitchenMeal {

    @Override
    public String getName() {
        return "vegetarian meal";
    }
}