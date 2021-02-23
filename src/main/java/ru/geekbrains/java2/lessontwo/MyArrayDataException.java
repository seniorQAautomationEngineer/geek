package ru.geekbrains.java2.lessontwo;

public class MyArrayDataException extends RuntimeException {
    private int i;
    private int j;
    private String value;

    public MyArrayDataException(int i, int j, String value) {
        super(i+ " " +j + " doesn't have correct value for parsing to Integer: " + value);
        this.i = i;
        this.j = j;
    }
}