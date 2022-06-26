package ss07_AbstractClass_Interface.Th.Animal_interfaceEdible.animal;

import ss07_AbstractClass_Interface.Th.Animal_interfaceEdible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
