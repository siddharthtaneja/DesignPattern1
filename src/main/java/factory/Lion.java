package org.epam.homeTask.factory;

public class Lion extends Animal {
    @Override
    String getSound() {
        return "roars";
    }

    @Override
    String getFoodType() {
        return "carnivore";
    }

    @Override
    String getSize() {
        return "big";
    }
}
