package org.epam.homeTask.factory;
import java.util.*;
import java.io.*;
public class getAnimalCharacteristics {
    public static void main(String args[])throws IOException{
        getAnimalCharacteriticsFactory animalFactory = new getAnimalCharacteriticsFactory();
        Scanner sc=new Scanner(System.in);
        System.out.print("out of Giraffe  and lion choose one\nEnter the name of animal whose characteristics you want:");
        String animalName=sc.next();
        Animal p = animalFactory.getAnimal(animalName);
       System.out.println(animalName+" is a "+p.getFoodType()+" ,it is "+p.getSize()+" in size and it "+p.getSound());
    }
}
