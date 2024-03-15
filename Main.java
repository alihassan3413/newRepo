package com.cinema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cinema cinema = new Cinema(3, 4);

        while (true) {
            cinema.displayCinema();

            System.out.print("Enter the screen number (1-3): ");
            int screenNumber = scanner.nextInt();

            System.out.print("Enter the showtime (e.g., 15:00): ");
            String showtime = scanner.next();

            System.out.print("Enter the row number: ");
            int row = scanner.nextInt();

            System.out.print("Enter the seat number: ");
            int seatNumber = scanner.nextInt();

            if (cinema.bookSeat(screenNumber, showtime, row - 1, seatNumber - 1)) {
                System.out.println("Seat booked successfully!");
            }
            else {
                System.out.println("Seat is already booked");
            }

//            boolean bookSeat( int screenNo , String time , int row , int seatNo
        }
    }
}
