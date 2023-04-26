package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cat extends Animal implements NeedsVaccinations {
        private final String name;
        private final String breed;
        private final LocalDateTime dateOfBirth;
        private final String favouriteFood;
        private final String colour;
        private final String favouriteToy;
        private LocalDate lastVaccinationDate;

    Cat(String name, String breed, LocalDateTime dateOfBirth, String favouriteFood, String colour, String favouriteToy) {
            this.name = name;
            this.breed = breed;
            this.dateOfBirth = dateOfBirth;
            this.favouriteFood = favouriteFood;
            this.colour = colour;
            this.favouriteToy = favouriteToy;
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

    @Override
    public String complaint() {
            return "Meow";
    }

    public void wasVaccinatedOn(LocalDate lastVaccinationDate) {
        this.lastVaccinationDate = lastVaccinationDate;
    }

    public LocalDate nextVaccinationDue() {
            return lastVaccinationDate.plusYears(1);
    }
}
