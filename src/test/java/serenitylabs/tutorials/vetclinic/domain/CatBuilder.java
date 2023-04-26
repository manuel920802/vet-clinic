package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;
public class CatBuilder implements WithBreed, WithColour {
        private String name;
        private String breed;
        private String colour;
        private String favouriteFood;
        private String favouriteToy;

        public static CatBuilder aCat() {
            return new CatBuilder();
        }

        public CatBuilder called(String name) {
            this.name = name;
            return this;
        }

        public CatBuilder ofBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public CatBuilder ofColour(String colour) {
            this.colour = colour;
            return this;
        }

        public Cat bornOn(LocalDateTime birthday) {
            return new Cat(name, breed, birthday, favouriteFood, colour, favouriteToy);
        }

        public CatBuilder withFavouriteFood(String favouriteFood) {
            this.favouriteFood = favouriteFood;
            return this;
        }

        public CatBuilder withFavouriteToy(String favouriteToy) {
            this.favouriteToy = favouriteToy;
            return this;
        }
    }
