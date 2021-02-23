package ru.geekbrains.java1.lessonsix;

public class MainApp {


    public static void main(String[] args) {
        int counterCat = 0;
        int counterDog = 0;
        int distanceRun = 199;
        int distanceSwim =9;
        Animal[] animals = {
                new Cat("Basik", "red", 5),
                new Dog("Sharick", "black", 4),
                new Dog("Bobik", "grey", 10)
        };
        Animal currentAnimal = null;
        for (int i = 0; i < animals.length; i++) {
            currentAnimal = animals[i];
            currentAnimal.run(distanceRun);
            currentAnimal.printInfo(distanceRun, currentAnimal.typeOfAnimal, currentAnimal.possibility);
            currentAnimal.swim(distanceSwim);
            currentAnimal.printInfo(distanceSwim, currentAnimal.typeOfAnimal, currentAnimal.possibility);
            if (animals[i] instanceof Cat) {
                counterCat++;
            } else {
                counterDog++;
            }
        }
        currentAnimal.printNumberOfAnimals(counterCat, counterDog);
    }
}

