package structural.decorator;

import structural.decorator.toppings.ExtraCheese;
import structural.decorator.toppings.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new Mushroom(new ExtraCheese( new FarmHousePizza()));
        System.out.println(basePizza.cost());
    }
}
