package org.academiadecodigo.bootcamp;

public class Person {

    private String name;
    private int indexRoom = -1;
    private Hotel hotel;
    private boolean status;

    public Person(String name, Hotel hotel) {
        this.name = name;
        this.hotel = hotel;
        status = false;

    }

    public String getName() {
        return name;
    }

    public void checkInPerson(Person person) {

        if (!status) {
            int indRoom = hotel.checkInHotel();
            indexRoom = indRoom;

            if (indexRoom >= 0) {
                System.out.println(person.name + ", there is a room available, here is your key for room " + (indexRoom + 1) + ".");
                status = true;
            } else {
                System.out.println("I am sorry, " + person.name + " there is no available room.");
            }

        } else {
            System.out.println(person.name + ", you already have a room in hotel " + hotel.getName() + ".");
        }


    }

    public void checkOutPerson(int numRoom, Person person) {

        hotel.checkOutHotel(numRoom - 1);
        status = false;
        System.out.println(person.getName() + ", your checkout is completed, thank you for being with us.");


    }

    public void getNumRoom(Person person) {

        if (!status) {

            System.out.println("Sorry, " + person.getName() + ", you don't have a room in this hotel " +
                    hotel.getName() + ".");

        } else {

            int numRoom = indexRoom + 1;
            System.out.println(person.getName() + ", your number room is " + numRoom + "." );
        }

    }
}
