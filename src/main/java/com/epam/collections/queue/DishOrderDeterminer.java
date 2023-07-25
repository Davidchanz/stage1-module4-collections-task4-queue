package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> result = new ArrayList<>();
        LinkedList<Integer> dishes = new LinkedList<>();
        for(int i = 1; i <= numberOfDishes; i++){
            dishes.add(i);
        }
        int dishNumber = 1;
        int currentDish = 0;
        while (!dishes.isEmpty()){
            if(dishNumber++ == everyDishNumberToEat){
                result.add(dishes.get(currentDish));
                dishes.remove(currentDish--);
                dishNumber = 1;
            }
            currentDish++;
            if(currentDish >= dishes.size())
                currentDish = 0;
        }
        return result;
    }
}
