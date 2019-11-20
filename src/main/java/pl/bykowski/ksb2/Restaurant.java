package pl.bykowski.ksb2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pl.bykowski.ksb2.meal.FoodType;
import pl.bykowski.ksb2.meal.KitchenMeal;
import pl.bykowski.ksb2.meal.TypeOfFood;

@Service
public class Restaurant {


    @Autowired
    public Restaurant(@TypeOfFood(foodType = FoodType.PROTEIN) KitchenMeal kitchenMeal) {
        System.out.println(kitchenMeal.getName());


//        Kitchen factory = new KitchenFactory();
//        KitchenMeal meal = factory.getMeal(FoodType.FAST_FOOD);
//        KitchenMeal dessert = factory.getDessert(FoodType.ICE_CREAM);
//
//        System.out.println(meal.getName());
//        System.out.println(dessert.getName());
    }
}
