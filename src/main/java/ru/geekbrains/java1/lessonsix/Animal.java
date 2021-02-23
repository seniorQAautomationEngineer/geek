package ru.geekbrains.java1.lessonsix;

public class Animal {
    String name;
    String color;
    int age;
    String action;


    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public void setPossibility(boolean possibility) {
        this.possibility = possibility;
    }

    String typeOfAnimal;
    boolean possibility;


    public void run(int distance) {
        action = "run";
    }

    public void swim(int distance) {
        action = "swim";
    }


    public void printInfo(int distance, String typeOfAnimal, boolean possibility) {
        if (possibility) {
            System.out.println(typeOfAnimal + " " + name + " " + action + "s on " + distance + " m");
        } else if (typeOfAnimal.contains("Cat") && action.contains("swim")) {
            System.out.println(typeOfAnimal + " " + name + " can't " + action);
        } else {
            System.out.println(typeOfAnimal + " " + name + " can't " + action + " on " + distance + " m");
        }
    }


    public void printNumberOfAnimals(int counterCat, int counterDog) {
        System.out.println("Cats: " + counterCat);
        System.out.println("Dogs: " + counterDog);
    }

    public static void main(String[] args) {
        for (int i = 10; i > 0; i++) {

        }
    }
}


