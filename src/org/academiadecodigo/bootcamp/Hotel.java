package org.academiadecodigo.bootcamp;

public class Hotel {

    private String name;
    private int available;
    private Room[] rooms;



    public Hotel(String name,int totalRooms) {

        this.name = name;
        available = totalRooms;
        rooms = new Room[totalRooms];
        fillArray();

    }

    public void fillArray() {

        for (int i = 0; i < rooms.length -1 ; i++) {
            rooms[i] = new Room();
        }
    }

    public String getName() {
        return name;
    }

    public int checkInHotel() {

        if (available > 0) {
            available --;

            for (int i = 0; i < rooms.length; i++) {

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


    }
}
