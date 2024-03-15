package com.cinema;

public class Showtime {
    private Movie movie;
    private Screen screen;
    private String time;
    private double price;

    public Showtime(Movie movie, Screen screen, String time, double price) {
        this.movie = movie;
        this.screen = screen;
        this.time = time;
        this.price = price;
    }

    public Movie getMovie() {
        return movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public String getTime() {
        return time;
    }

    public double getPrice() {
        return price;
    }


}
