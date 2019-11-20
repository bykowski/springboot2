package pl.bykowski.ksb2.meal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@TypeOfFood(foodType = FoodType.ICE_CREAM)
public class IceCreamMeal extends KitchenMeal {

    @Override
    public String getName() {
        return "ice-cream";
    }
}
