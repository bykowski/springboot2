package pl.bykowski.ksb2;

import pl.bykowski.ksb2.meal.*;

public class KitchenFactory extends Kitchen {

    @Override
    public KitchenMeal getMeal(FoodType preferency) {
        if (preferency == FoodType.FAST_FOOD) {
            return new FastFoodMeal();
        } else if (preferency == FoodType.PROTEIN) {
            return new ProteinMeal();
        }
        return new VegetarianMeal();
    }

    @Override
    public KitchenMeal getDessert(FoodType preferency) {
        if (preferency == FoodType.ICE_CREAM) {
            return new IceCreamMeal();
        }
        return null;
    }
}