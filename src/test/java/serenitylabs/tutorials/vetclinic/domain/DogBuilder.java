package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class DogBuilder implements WithBreed, WithColour {
    private String name;
    private String breed;
    private String colour;
    private String favouriteFood;
    private String favouriteToy;

    public static DogBuilder aDog() {
        return new DogBuilder();
    }

    public WithBreed called(String name) {
        this.name = name;
        return this;
    }

    public WithColour ofBreed(String breed) {
        this.breed = breed;
        return this;
    }

    public DogBuilder ofColour(String colour) {
        this.colour = colour;
        return this;
    }

    public Dog bornOn(LocalDateTime birthday) {
        return new Dog(name, breed, birthday, favouriteFood, colour, favouriteToy);
    }

    public DogBuilder withFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
        return this;
    }

    public DogBuilder withFavouriteToy(String favouriteToy) {
        this.favouriteToy = favouriteToy;
        return this;
    }
}