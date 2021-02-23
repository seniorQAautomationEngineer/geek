package ru.geekbrains.java1.fourlessons;

import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {
        int[] oneZero = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        replaceNullAndOne(oneZero);
        addPlusThreeValues();
        int[] arr3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        lessSixProductTwo(arr3);
        oneInDiagonalInMatrix();
        int[] arr5 = new int[]{100, 45, 67, 34, 67, 49};
        findMinAndMax(arr5);
        int[] arr61 = new int[]{2, 2, 2, 1, 2, 2, 10, 1};
        int[] arr62 = new int[]{1, 1, 1, 2, 1};
        System.out.println(checkBalance1(arr61));
        System.out.println(checkBalance2(arr61));
        System.out.println(checkBalance1(arr62));
        System.out.println(checkBalance2(arr62));


    }

    //Task 1
    public static void replaceNullAndOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
                continue;
            }
            if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Task 2
    public static void addPlusThreeValues() {
        int[] arr = new int[8];
        for (int i = 0, j = 0; i < arr.length; i++) {
            arr[i] = j;
            j += 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Task 3
    public static void lessSixProductTwo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Task 4
    public static void oneInDiagonalInMatrix() {
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Task 5
    public static void findMinAndMax(int arr[]) {
        int max = arr[0];
        int min = arr[0];


        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);

    }

    //Task 6 / Solution 1
    public static boolean checkBalance1(int[] arr) {
        int leftSum = 0;
        int rightSum = 0;
        int[] leftSideSums = new int[arr.length];
        int[] rightSideSums = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            leftSideSums[i] = leftSum;
        }

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            rightSum += arr[i];
            rightSideSums[j] = rightSum;
        }

        for (int i = 0; i < leftSideSums.length; i++) {
            for (int j = 0; j < rightSideSums.length; j++) {
                if (leftSideSums[i] == rightSideSums[j] && i + 1 == rightSideSums.length - 1 - j) {
                    System.out.println(leftSideSums[i]);
                    System.out.println(i);
                    System.out.println(rightSideSums.length - 1 - j);

                }
            }
        }
        return true;
    }

    //Task 6 / Solution 2
    public static boolean checkBalance2(int[] arr) {
        int leftSum = 0;
        int rightSum = 0;
        int[] leftSideSums = new int[arr.length];
        int[] rightSideSums = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            leftSideSums[i] = leftSum;
        }

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            rightSum += arr[i];
            rightSideSums[j] = rightSum;
        }

        for (int i = 0; i < leftSideSums.length; i++) {
            for (int j = 0; j < rightSideSums.length; j++) {
                if (leftSideSums[i] == rightSideSums[j] && i + j + 2 == arr.length) {
                    System.out.println(leftSideSums[i]);
                    System.out.println(i);
                    System.out.println(j);

                }
            }
        }
        return true;
    }


}
