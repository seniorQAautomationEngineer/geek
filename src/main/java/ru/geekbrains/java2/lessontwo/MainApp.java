package ru.geekbrains.java2.lessontwo;

import java.util.Arrays;

public class MainApp {


    public static void main(String[] args) {

       String[][] array = {{"1", "2", "3"},{"2", "5", "7", "8"}, {"2", "5", "7", "8"},{"2", "5", "7", "8"}};
     //  String[][] array = {{"1", "2", "3", "str"},{"2", "5", "7", "8"}, {"2", "5", "7", "8"},{"2", "5", "7", "8"}};
    //   String[][] array = {{"1", "2", "3", "4"},{"2", "5", "7", "8"}, {"2", "5", "7", "8"},{"2", "5", "7", "8"}};
       System.out.println(math(array));
    }


    public static int math(String[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if(array.length!=4 || array[i].length!=4){
                throw new MyArraySizeException(array.length, array[i].length);
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int num = Integer.parseInt(array[i][j]);
                    sum += num;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }
        return sum;
    }
}
