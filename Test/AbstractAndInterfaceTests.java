package Test;

import Animal.Class.Animal;
import Animal.Class.Chicken;
import Animal.Class.Tiger;
import Edible.Edible;
import Fruit.Fruit;
import Fruit.Apple;
import Fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal [] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (int i = 0;i<animals.length;i++){
            System.out.println(animals[i].makeSound() + ", ");
            if (animals[i] instanceof Chicken){
                Edible edible = (Chicken) animals[i];
                System.out.println(edible.howToEat());
                }
            }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
        }

    }
