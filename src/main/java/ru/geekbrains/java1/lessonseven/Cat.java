package ru.geekbrains.java1.lessonseven;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public int getAppetite(){
        return appetite;
    }

    public Cat(String name){
        this.name = name;
        this.appetite = 34;
        this.hungry = true;

    }


    public void eat(Plate plate){
        if(plate.decreaseFood(appetite)){
            hungry = false;
        }
    }
}
