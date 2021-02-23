package ru.geekbrains.java1.lessonsix;

public class Dog extends Animal {

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        setTypeOfAnimal("Dog");
    }




    @Override
    public void run(int distance) {
        super.run(distance);
        if (distance >= 500) {
            setPossibility(false);
        } else {
            setPossibility(true);
        }
    }


    @Override
    public void swim(int distance) {
        super.swim(distance);
        if (distance >= 10) {
            setPossibility(false);
        } else {
            setPossibility(true);
        }
    }
}
