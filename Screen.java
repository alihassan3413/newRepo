package com.cinema;

public class Screen {
    private int screenNumber;
    private Seat seats[][];
    int[] seatsPerRow = {10,14,18,22};



    public Screen(int screenNumber , int numRows)
    {
//        seats[0] = new Seat[20];
//        seats[1] = new Seat[30];
//        seats[2] = new Seat[40];
//        seats[3] = new Seat[50];

        this.screenNumber = screenNumber;
        seats = new Seat[numRows][];
        for(int i = 0; i< numRows ; i++)
        {
            seats[i] = new Seat[seatsPerRow[i]];

            for(int j =0; j < seatsPerRow[i]; j++)
            {
                seats[i][j] = new Seat();
            }
        }
    }

    public int getScreenNumber() {
        return screenNumber;
    }

    public Seat[][] getSeats() {
        return seats;
    }

    public int[] getSeatsPerRow() {
        return seatsPerRow;
    }

    public boolean isBooked(int row, int seatNo) {
        if (row >= 0 && row < seats.length && seatNo >= 0 && seatNo < seats[row].length) {
            Seat seat = seats[row][seatNo];
            if (!seat.isReserved()) {
                seat.setReserved(); // Mark the seat as reserved
                return true;
            }
        }
        return false;
    }

    public void display() {
        System.out.println("Screen : " + screenNumber + "\nSeating Chart : ");
        for (int i=0; i<seats.length;i++)
        {
            for (int j = 0; j<seats[i].length; j++)
            {
                if(seats[i][j].isReserved()){
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}
