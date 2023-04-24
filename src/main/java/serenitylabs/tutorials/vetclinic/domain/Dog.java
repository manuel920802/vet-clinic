package serenitylabs.tutorials.vetclinic.domain;

import java.security.cert.CertPathBuilder;
import java.time.LocalDateTime;

public class Dog {
    private final String name;
    private final String breed;
    private final LocalDateTime dateOfBirth;
    private final String favouriteFood;
    private final String colour;
    private final String toy;

    private Dog(String name, String breed, LocalDateTime dateOfBirth, String favouriteFood, String colour, String toy) {
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.favouriteFood = favouriteFood;
        this.colour = colour;
        this.toy = toy;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }
    public String getFavouriteFood() {
        return favouriteFood;
    }
    public String getColour() {
        return colour;
    }
    public String getFavouriteToy() {
        return toy;
    }

    public static WithBreed called(String name) {
        return new DogBuilder(name);
    }


    interface WithBreed{
        ofColour ofBreed(String breed);
    }
    interface ofColour{
        DogBuilder ofColour(String colour);
    }

    public static class DogBuilder implements WithBreed,ofColour {
        private String name;
        private String breed;
        private String favouriteFood;
        private String colour;
        private String toy;

        public DogBuilder(String name){
            this.name= name;
        }
        public DogBuilder ofBreed(String breed) {
            this.breed = breed;
            return this;
        }
        public Dog bornOn(LocalDateTime birthday) {
            return new Dog(name,breed,birthday,favouriteFood, colour, toy);
        }
        public DogBuilder withFavouriteFood(String favouriteFood) {
            this.favouriteFood = favouriteFood;
            return this;
        }
        public DogBuilder ofColour(String colour) {
            this.colour = colour;
            return this;
        }
        public DogBuilder withFavouriteToy(String toy) {
            this.toy = toy;
            return this;
        }
    }
}
