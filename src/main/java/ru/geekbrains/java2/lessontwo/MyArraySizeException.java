package ru.geekbrains.java2.lessontwo;

public class MyArraySizeException extends RuntimeException{
    private int x;
    private int y;



    public MyArraySizeException(int x, int y){
        super(x+ " " +y + " are not correct size of array");
        this.x = x;
        this.y = y;
    }
}
