package com.cinema;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Screen> screens;
    private List<Movie> movies;
    private List<Showtime> showtimes;

    public Cinema(int numScreen , int Rows) {
        screens = new ArrayList<>();
        movies = new ArrayList<>();
        showtimes = new ArrayList<>();

        for (int i = 1; i<=numScreen ; i++)
        {
            screens.add(new Screen(i,Rows));
        }

        movies.add(new Movie("Movie 1" , "Description for Movie 1"));
        movies.add(new Movie("Movie 2" , "Description for Movie 2"));

        for (Screen screen : screens)
        {
            for (Movie movie : movies)
            {
                showtimes.add(new Showtime(movie,screen,"03:00",1000.0));
                showtimes.add(new Showtime(movie,screen,"08:00",2000.0));
            }
        }
    }

    public void displayCinema() {
        for (Showtime showtime : showtimes){
            System.out.println("Movie: " +showtime.getMovie().getTitle());
            System.out.println("Description: " +showtime.getMovie().getDescription());
            System.out.println("Screen: "+showtime.getScreen().getScreenNumber());
            System.out.println("Showtime: "+showtime.getTime());
            System.out.println("Price: "+showtime.getPrice());
            showtime.getScreen().display();
            System.out.println();
        }
    }

    public boolean bookSeat( int screenNo , String time , int row , int seatNo)
    {
        for(Showtime showtime : showtimes)
        {
            if(showtime.getScreen().getScreenNumber() == screenNo && showtime.getTime().equals(time))
            {
                return showtime.getScreen().isBooked(row,seatNo);
            }
        }
        return false;
    }
}
