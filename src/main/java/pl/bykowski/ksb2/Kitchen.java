package pl.bykowski.ksb2;

import pl.bykowski.ksb2.meal.FoodType;
import pl.bykowski.ksb2.meal.KitchenMeal;

public abstract class Kitchen {
    public abstract KitchenMeal getMeal(FoodType preferency);

    public abstract KitchenMeal getDessert(FoodType preferency);
}