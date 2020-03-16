package org.epam.homeTask.factory;

public class Giraffe extends Animal {
    @Override
    String getSound() {
        return "humps";
    }

    @Override
    String getFoodType() {
        return "herbivore";
    }

    @Override
    String getSize() {
        return "big";
    }
}
