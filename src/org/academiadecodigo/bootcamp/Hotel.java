package org.academiadecodigo.bootcamp;

public class Hotel {

    private String name;
    private int availableRooms;
    private Room[] rooms;

    public Hotel(String name,int totalRooms) {

        this.name = name;
        availableRooms = totalRooms;
        rooms = new Room[totalRooms];
        fillArray();
    }

    public void fillArray() {

        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room();
        }
    }

    public String getName() {

        return name;
    }

    public int checkInHotel() {

        if (availableRooms > 0) {
            availableRooms --;

            for (int i = 0; i < rooms.length; i++) {

                if (rooms[i].isAvailable()) {
                    rooms[i].setAvailable(false);
                    return i;
                }
           }

        }
        return -1;
    }


    public void checkOutHotel(int index) {

        availableRooms ++;
        rooms[index].setAvailable(true);
    }
}
