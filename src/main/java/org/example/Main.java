package org.example;


public class Main {
    public static void main(String[] args) {
//Soru-1
        Person person = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());

        Person person2 =new Person("Şevval", "Sağlam", 26,"Female", 175, 52);
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Gender: " + person2.getGender());
        System.out.println("Height: " + person2.getHeight());
        System.out.println("Width: " + person2.getWidth());

        System.out.println("---------------------------------------");

//Soru-2
        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
        System.out.println("---------------------------------------");
        wall.setHeight(12);
        wall.setWidth(15);
        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());

    }

}
