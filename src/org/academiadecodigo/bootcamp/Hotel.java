package org.academiadecodigo.bootcamp;

public class Hotel {

    Room[] rooms;
    private int available;


    public Hotel(int totalRooms) {

        rooms = new Room[totalRooms];
        available = totalRooms;

    }

    public void fillArray() {

        for (int i = 0; i < rooms.length -1 ; i++) {
            rooms[i] = new Room();
        }
    }



    public int checkInHotel() {

        if (available > 0) {
            available --;

            for (int i = 0; i < rooms.length - 1 ; i++) {

                if (rooms[i].getStatus()) {
                    rooms[i].setStatus(false);

                    return i;
                }
           }

        }

        return -1;
    }


    public void checkOutHotel(int index) {

        available ++;

        rooms[index].setStatus(true);
        System.out.println("Your checkout is completed, thank you for being with us.");

    }
}
