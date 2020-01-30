package org.academiadecodigo.bootcamp;

public class Room {

    private boolean available;

    public Room() {
        available = true;
    }

    public boolean isAvailable() {

        return available;
    }

    public void setAvailable(boolean available) {

        this.available = available;
    }
}
