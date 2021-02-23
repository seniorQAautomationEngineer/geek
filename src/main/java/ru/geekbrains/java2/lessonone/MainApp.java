package ru.geekbrains.java2.lessonone;

public class MainApp {
    public static void main(String[] args) {
        String[] obstacles = new String[]{"rope", "ladder", "stone", ""};
        int numberOfCurrentPlayer= 1;
        int currentDistance = 19;
        int maximumDistance = 20;
        Course course = new Course(obstacles);
        Team team = new Team("Barbarians",
                new String[]{"Al", "Bo", "Sho", "Mo"},
                currentDistance, maximumDistance, numberOfCurrentPlayer);
        team.showResults();
        team.printInfoAboutPlayersCompletedDistance();
        course.dolt(team, obstacles[0]);
        team.showResults();
        team.printInfoAboutPlayersCompletedDistance();
        course.dolt(team, obstacles[1]);
        team.showResults();
        team.printInfoAboutPlayersCompletedDistance();

    }
}
