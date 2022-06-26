package ss07_AbstractClass_Interface.Th.Animal_interfaceEdible.animal;

import ss07_AbstractClass_Interface.Th.Animal_interfaceEdible.edible.Edible;

import ss07_AbstractClass_Interface.Th.Animal_interfaceEdible.fruit.Fruit;
import ss07_AbstractClass_Interface.Th.Animal_interfaceEdible.fruit.Orange;
import ss07_AbstractClass_Interface.Th.Animal_interfaceEdible.fruit.Apple;
public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
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
