package ru.geekbrains.java1.lessonfive;

public class Employee {
    //Lesson 5

    private String fullName;
    private String title;
    private String email;
    private int phone;

    public String getFullName() {
        return fullName;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    private int age;
    private int salary;

    public Employee(String fullName, String title, String email, int phone, int age, int salary){
        this.fullName = fullName;
        this.title = title;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.salary = salary;
    }


    public void info(){
        System.out.println("Full name: " + fullName);
        System.out.println("Title: " + title);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

    }

}
