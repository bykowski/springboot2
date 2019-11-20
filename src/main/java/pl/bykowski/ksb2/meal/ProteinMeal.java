package pl.bykowski.ksb2.meal;

import org.springframework.stereotype.Component;

@Component
@TypeOfFood(foodType = FoodType.PROTEIN)
public class ProteinMeal extends KitchenMeal {

    @Override
    public String getName() {
        return "protein meal";
    }
}