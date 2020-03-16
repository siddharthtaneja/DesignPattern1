package org.epam.homeTask.factory;

public class getAnimalCharacteriticsFactory {
    public Animal getAnimal(String animal){
        if(animal == null){
            return null;
        }
        if(animal.equalsIgnoreCase("Giraffe")) {
            return new Giraffe();
        }
        else if(animal.equalsIgnoreCase("Lion")){
            return new Lion();
        }
        return null;
    }
}
