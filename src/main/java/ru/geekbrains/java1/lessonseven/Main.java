package ru.geekbrains.java1.lessonseven;

public class Main {


    public static void main(String[] args) {
        Plate plate1 = new Plate(100);
        Plate plate2 = new Plate(100);

        plate1.fillMax();
        plate2.fillMax();

        plate1.info();
        plate2.info();

        Cat[] cats = {
                new Cat("Barsik"),
                new Cat("Sam"),
                new Cat("Mur")
        };
        for (int i = 0; i <cats.length; i++) {
            cats[i].eat(plate2);
            plate2.info();
        }

    }
}
