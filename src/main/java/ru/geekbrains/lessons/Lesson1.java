package ru.geekbrains.lessons;

public class Lesson1 {

    //Task 2
    String name = "Bill";
    int num = 3;
    float percent = 0.3f;
    double percent2 = 8.23;
    long num2 = 1000000000;
    boolean req = true;

    public static void main(String[] args) {
        float a = 0.1f, b = 0.3f, c = 3.4f, d = 1.4f;
        System.out.println(formula(a, b, c, d));
        System.out.println(range(2, 8));
        positiveOrNotPrint(-1);
        System.out.println(isNegative(0));
        printGreetings("Bill");
        detectAndPrintLeapYear(2020);
    }

    //Task 3
    public static float formula(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    //Task 4
    public static boolean range(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    //Task 5
    public static void positiveOrNotPrint(int num) {
        if (num >= 0) {
            System.out.println("Positive number: " + num);
        } else {
            System.out.println("Negative number: " + num);
        }
    }

    //Task 6
    public static boolean isNegative(int num) {
        if (num < 0) {
            return true;
        }
        return false;
    }

    //Task 7
    public static void printGreetings(String name) {
        System.out.println("Привет, " + name);
    }

    //Task 8
    public static void detectAndPrintLeapYear(int year) {
        if (year % 400 == 0) {
            System.out.println("Leap year: " + year);
        }
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap year: " + year);
        } else {
            System.out.println("Common year: " + year);
        }
    }
}
