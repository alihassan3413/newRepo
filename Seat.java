package com.cinema;

public class Seat {

    private boolean isReserved;

    public Seat() {
        isReserved = false;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved() {
        isReserved = true;
    }
}
