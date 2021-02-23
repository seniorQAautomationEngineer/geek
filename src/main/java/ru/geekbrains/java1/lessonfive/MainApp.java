package ru.geekbrains.java1.lessonfive;

public class MainApp {
    public static void main(String[] args) {
        Employee[] peersArray = {
                new Employee("Al La", "QA", "1111@gmail.com", 27, 100, 1000),
        new Employee("Bill Li", "Dev", "222@gmail.com", 312322323, 12, 4300),
        new Employee("Ivan Petrov", "Project manager", "233@gmail.com", 212332323,84, 100),
        new Employee("Molly Holly", "Director", "989@gmail.com", 484848, 8, 3636),
        new Employee("Harry Potter", "Bussiness analyst", "dhdh@gmail.com",39393939, 23, 3737)};


        for (int i = 0; i < peersArray.length; i++) {
            if(peersArray[i].getAge()> 40){
                peersArray[i].info();
            }
        }
    }
}
