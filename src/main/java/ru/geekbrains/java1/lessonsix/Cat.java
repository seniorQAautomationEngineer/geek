package ru.geekbrains.java1.lessonsix;

public class Cat extends Animal {


    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        setTypeOfAnimal("Cat");
    }

    @Override
    public void run(int distance) {
        super.run(distance);
        if (distance >= 200) {
            setPossibility(false);
        } else {
           setPossibility(true);
        }
    }


    @Override
    public void swim(int distance) {
        super.swim(distance);
        setPossibility(false);
    }


}
