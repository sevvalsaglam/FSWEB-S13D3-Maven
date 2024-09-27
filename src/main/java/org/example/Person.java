package org.example;

public class Person {

    String firstName;
    String lastName;
    int age;
    String gender;
    int height;
    int width;

    public Person(String firsName,String lastName, int age){
        this.firstName= firsName;
        this.lastName=lastName;
        this.age=age;
    }
    public Person (String firsName, String lastName, int age,String gender, int height, int width){
        this(firsName, lastName, age);
        this.gender=gender;
        this.height=height;
        this.width=width;
    }



    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }
    public String getGender() {
        return this.gender;
    }
    public boolean isTeen() {
        return this.age <= 19 && this.age >=13;
    }
    public int getHeight() {
        return this.height;
    }
    public int getWidth() {
        return this.width;
    }
}
