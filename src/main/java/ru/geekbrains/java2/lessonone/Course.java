package ru.geekbrains.java2.lessonone;

public class Course {
    private String[] obstacles;
    private int currentDistance;
    private int maxDistance;


    public Course(String[] obstaclesInput) {
        this.obstacles = obstaclesInput;
    }


    public void dolt(Team team, String currentObstacle) {
        System.out.println("Let's start complete obstacles!!!");
        currentDistance = team.getCurrentDistance();

        if (currentObstacle.contains("rope")) {
            currentDistance++;
        } else if (currentObstacle.contains("ladder")) {
            currentDistance += 2;
        } else if (currentObstacle.contains("stone")) {
            currentDistance -= 4;
        } else {
            currentDistance += 5;
        }

        team.setCurrentDistance(currentDistance);



    }
}
