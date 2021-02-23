package ru.geekbrains.java1.fourlessons;

import java.util.Random;
import java.util.Scanner;

public class Lesson4{
    static final int SIZE = 8;
    static char[][] map;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final int  WIN_LENGTH = 3;
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();


    public static void main(String[] args) {
        prepareMap();
        printMap();
        while (true) {
            playerTurn();
            printMap();
            if(isCheckWinner(DOT_X)){
                System.out.println("Human is winner!!!");
                break;
            }
            if(isMapFull()){
                System.out.println("Draw");
                break;
            }
            aiTurn();
            printMap();
            if(isCheckWinner(DOT_O)){
                System.out.println("AI is winner!!!");
                break;
            }

            if(isMapFull()){
                System.out.println("Draw");
                break;
            }
        }
        System.out.println("End of game");
    }


    public static boolean isMapFull(){
        for (int i = 0; i <SIZE; i++) {
            for (int j = 0; j <SIZE ; j++) {
               if(map[i][j] == DOT_EMPTY) {
                   return false;
               }
            }
        }
        return true;
    }

//    public static boolean isWinner(char dot){
//        int counterInRows =0;
//        int counterInColumns =0;
//
//        for (int i = 0; i <SIZE; i++) {
//            for (int j = 0; j <SIZE ; j++) {
//                if(map[i][j]!=dot){
//                  break;
//                }
//                counterInRows++;
//                if(counterInRows==SIZE){
//                    return true;
//                }
//            }
//            counterInRows=0;
//        }
//        for (int i = 0; i <SIZE ; i++) {
//            for (int j = 0; j <SIZE ; j++) {
//                if(map[j][i]!=dot){
//                    continue;
//                }
//                counterInColumns++;
//                if(counterInColumns==SIZE){
//                    return true;
//                }
//            }
//            counterInColumns=0;
//        }
//
//        return false;
//    }


//    public static boolean isWinner(int x, int y, int dx, int dy){
//        //dx = 1, dy =0
//        for(int i = 0; i < 3 ; i++) {
//              if(map[x + i * 1][y + i * 0] != DOT_EMPTY){
//                  return false;
//              }
//        }
//        //dx = 0, dy =1
//        for(int i = 0; i < 3 ; i++) {
//            if(map[x + i * 0][y + i * 1] != DOT_EMPTY){
//                return false;
//            }
//        }
//
//        //dx = 1, dy =1
//        for(int i = 0; i < 3 ; i++) {
//            if(map[x + i *1][y + i *1] != DOT_EMPTY){
//                return false;
//            }
//        }
//
//        //dx = 1, dy =-1
//        for(int i = 0; i < 3 ; i++) {
//            if(map[x + i * 1][y + i * -1] != DOT_EMPTY){
//                return false;
//            }
//        }
//
//        return true;
//    }



    public static boolean isCheckWinner(char playerDot){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j <SIZE ; j++) {
                if(checkLine(playerDot, i, j, 1, 0) || checkLine(playerDot, i, j, 0, 1)
                || checkLine(playerDot, i, j, 1, 1) || checkLine(playerDot, i, j, 1, -1)){
                    return true;
                }
            }
        }
        return false;
    }



    public static boolean checkLine(char playerDot, int x, int y, int dx, int dy){
        int endX = x + dx *(WIN_LENGTH-1);
      int endY = y + dy *(WIN_LENGTH-1);

      if(endX > SIZE - 1 || endY > SIZE - 1 || endX < 0 || endY < 0){
          return false;
      }

      for(int i = 0; i < WIN_LENGTH ; i++) {
            if(map[x + i * dx][y + i * dy] != playerDot){
                return false;
            }
        }
        return true;
    }





    public static void playerTurn() {
        int x, y;
        do {
            System.out.println("Please, type your coordinates: number of x column and y row");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellEmpty(x, y));
        map[x][y] = DOT_X;
    }

    public static void aiTurn() {
        int x, y;
        do {
            System.out.println("Please, add your coordinates");
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellEmpty(x, y));
        map[x][y] = DOT_O;
    }

    public static boolean isCellEmpty(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        if (map[x][y] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[j][i] + " ");
            }
            System.out.println();
        }
    }


    public static void prepareMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }


}
