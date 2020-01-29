package org.academiadecodigo.bootcamp;

public class Person {

    private String name;
    private int indexRoom;
    private Hotel hotel;

    public Person(String name) {
        this.name = name;
    }


    public void checkInPerson(Hotel hotel) {

        int indRoom = hotel.checkInHotel();
        indexRoom = indRoom;

        if (indexRoom >= 0) {
            System.out.println("There is a room available, here your key for room " + (indexRoom + 1) + ".");
        } else {
            System.out.println("I am sorry, there is no available room.");
        }


    }

    public void checkOutPerson(int indexRoom, Hotel hotel) {

        hotel.checkOutHotel(indexRoom);


    }
}
