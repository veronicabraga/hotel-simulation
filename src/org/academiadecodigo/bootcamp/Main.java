package org.academiadecodigo.bootcamp;

public class Main {

    public static void main(String[] args) {

        Hotel hotel1 = new Hotel(15);
        Person person1 = new Person("Vero");

        hotel1.fillArray();

        person1.checkInPerson(hotel1);

        person1.checkOutPerson(0, hotel1);

        Person person2 = new Person("Gabi");
        person2.checkInPerson(hotel1);
    }
}
