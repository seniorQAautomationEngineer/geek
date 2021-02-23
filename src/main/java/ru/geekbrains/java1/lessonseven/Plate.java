package ru.geekbrains.java1.lessonseven;

public class Plate {
    private int capacity;
    private int food;

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        } else {
            System.out.println("Cat can't eat " + amount + " more than amount of food: " + food);
            return false;
        }
    }

    public Plate(int capacity) {
        this.capacity = capacity;
    }

    public void fillMax() {
        food = capacity;
    }

    public void info() {
        System.out.printf("Plate: %d / %d\n", food, capacity);
    }
}
