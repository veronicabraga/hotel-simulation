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

    public void checkInPerson() {

        if (!status) {
            int indRoom = hotel.checkInHotel();
            indexRoom = indRoom;

            if (indexRoom >= 0) {
                System.out.println(name + ", there is a room available, here is your key for room " + (indexRoom + 1) + ".");
                status = true;
            } else {
                System.out.println("I am sorry, " + name + ", there is no available room.");
            }

        } else {
            System.out.println(name + ", you already have a room in hotel " + hotel.getName() + ".");
        }
    }

    public void checkOutPerson(int numRoom) {

        hotel.checkOutHotel(numRoom - 1);
        status = false;
        System.out.println(name + ", your checkout is completed, thank you for being with us.");
    }

    public void getNumRoom() {

        if (!status) {

            System.out.println("Sorry, " + name + ", you don't have a room in this hotel " +
                    hotel.getName() + ".");

        } else {

            int numRoom = indexRoom + 1;
            System.out.println(name + ", your number room is " + numRoom + "." );
        }

    }
}
