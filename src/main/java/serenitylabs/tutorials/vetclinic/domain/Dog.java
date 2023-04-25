package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class Dog {
    private final String name;
    private final String breed;
    private final LocalDateTime dateOfBirth;
    private final String favouriteFood;
    private final String colour;
    private final String favouriteToy;

    Dog(String name, String breed, LocalDateTime dateOfBirth, String favouriteFood, String colour, String favouriteToy) {
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.favouriteFood = favouriteFood;
        this.colour = colour;
        this.favouriteToy = favouriteToy;
    }

    @Override
    public String toString() {
        return name + " the " + (colour + " " + breed).toLowerCase() + " was born in " + dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColour() {
        return colour;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }

}
