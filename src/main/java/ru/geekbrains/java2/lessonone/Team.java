package ru.geekbrains.java2.lessonone;

import java.util.Arrays;

public class Team {
    private String nameOfTeam;
    private String[] players = new String[4];
    private int currentDistance;
    private int maxDistance;
    private int indexCurrentPlayer;

    public Team(String nameOfTeam, String[] playersInput, int currentDistance,
                int maxDistance, int indexCurrentPlayer) {
        this.nameOfTeam = nameOfTeam;
        this.players[0] = playersInput[0];
        this.players[1] = playersInput[1];
        this.players[2] = playersInput[2];
        this.players[3] = playersInput[3];
        this.currentDistance = currentDistance;
        this.indexCurrentPlayer = indexCurrentPlayer;
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }




    public void printInfoAboutPlayersCompletedDistance() {
        if (maxDistance <= currentDistance) {
            System.out.println("Player " + players[indexCurrentPlayer] + " from team: " + nameOfTeam + " is achieved "  + currentDistance + " m" +
                    " and completed maximum distance. Let's start new distance ");
            currentDistance=0;
        }else{
            System.out.println("Player " + players[indexCurrentPlayer] + " from team: " + nameOfTeam + " is not completed maximum distance");
        }
    }

    public int getCurrentDistance() {
        return currentDistance;
    }

    public void setCurrentDistance(int currentDistance) {
        this.currentDistance = currentDistance;
    }

    public void showResults() {
        System.out.println("Player " + players[indexCurrentPlayer] + " from team: " + nameOfTeam + " distance: " + currentDistance + " m");
        System.out.println("Result for team " + nameOfTeam + ". Distance: " + currentDistance + " m");


    }
}
