package org.academiadecodigo.bootcamp;

public class Main {

    public static void main(String[] args) {

        Hotel hotel1 = new Hotel("Meridien",15);
        Hotel hotel2 = new Hotel("Copacabana Palace", 15);
        Person person1 = new Person("Vero", hotel1);
        Person person2 = new Person("Gabi", hotel1);


        person1.checkInPerson(person1);
        person1.checkInPerson(person1);

        person1.getNumRoom(person1);

        person1.checkInPerson(person1);

        person1.checkOutPerson(1, person1);

        person1.getNumRoom(person1);

        person1.checkInPerson(person1);

        person2.checkInPerson(person2);

        person2.getNumRoom(person2);

        person2.checkInPerson(person2);

        person2.checkOutPerson(2, person2);

        person2.getNumRoom(person2);








    }
}
