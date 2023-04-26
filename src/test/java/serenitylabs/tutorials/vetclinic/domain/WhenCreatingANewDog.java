package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.Matchers.*;

public class WhenCreatingANewDog {

    private final static LocalDateTime birthday = LocalDateTime.of(2023,4,25,12,10);
    @Test
    public void a_large_dog_should_have_a_name_a_breed_a_colour_and_a_date_of_birth() {
        Dog fido = DogBuilder.aLargeDog()
                .called("Fido")
                .ofColour("Black")
                .bornOn(birthday);

        assertThat(fido.getName()).isEqualTo("Fido");
        assertThat(fido.getBreed()).isEqualTo("Labrador");
        assertThat(fido.getColour()).isEqualTo("Black");
        assertThat(fido.getDateOfBirth()).isEqualTo(birthday);
    }
    @Test
    public void a_small_dog_can_have_an_optional_favourite_food() {
        Dog spot = DogBuilder.aSmallDog()
                .called("Spot")
                .ofColour("White")
                .withFavouriteFood("Pizza")
                .bornOn(birthday);

        assertThat(spot.getName()).isEqualTo("Spot");
        assertThat(spot.getBreed()).isEqualTo("Poodle");
        assertThat(spot.getColour()).isEqualTo("White");
        assertThat(spot.getFavouriteFood()).isEqualTo("Pizza");
        assertThat(spot.getDateOfBirth()).isEqualTo(birthday);
    }

    @Test
    public void a_guard_dog_can_have_an_optional_favourite_toy() {
        Dog hunter = DogBuilder.aGuardDog()
                .called("Hunter")
                .ofColour("Brown")
                .withFavouriteToy("Ball")
                .bornOn(birthday);

        assertThat(hunter.getName()).isEqualTo("Hunter");
        assertThat(hunter.getBreed()).isEqualTo("Doberman");
        assertThat(hunter.getColour()).isEqualTo("Brown");
        assertThat(hunter.getFavouriteToy()).isEqualTo("Ball");
        assertThat(hunter.getDateOfBirth()).isEqualTo(birthday);
    }

    @Test
    public void a_dog_can_have_optional_favourite_toy_and_favourite_food() {
        Dog bruno = DogBuilder.aDog()
                .called("Bruno")
                .ofBreed("Retriever")
                .ofColour("Gold")
                .withFavouriteToy("Bone")
                .withFavouriteFood("Croquettes")
                .bornOn(birthday);

        assertThat(bruno.getName()).isEqualTo("Bruno");
        assertThat(bruno.getBreed()).isEqualTo("Retriever");
        assertThat(bruno.getColour()).isEqualTo("Gold");
        assertThat(bruno.getFavouriteToy()).isEqualTo("Bone");
        assertThat(bruno.getFavouriteFood()).isEqualTo("Croquettes");
        assertThat(bruno.getDateOfBirth()).isEqualTo(birthday);
    }

    @Test
    public void a_dog_should_be_printed_in_a_readable_form(){
        Dog fido = DogBuilder.aDog()
                .called("Fido")
                .ofBreed("Labrador")
                .ofColour("Black")
                .bornOn(birthday);

        assertThat(fido.toString()).isEqualTo("Fido the black labrador was born in 2023-04-25T12:10");
        assertThat(fido.toString()).startsWith("Fido");
        assertThat(fido.toString()).endsWith("12:10");
        assertThat(fido.toString()).contains("black");
    }

    @Test
    public void a_dog_complains_by_growling(){
        Dog fido = DogBuilder.aDog()
                .called("Fido")
                .ofBreed("Labrador")
                .ofColour("Black")
                .bornOn(birthday);

        assertThat(fido.complaint()).isEqualTo("Grrrr");
    }

    @Test
    public void a_cat_complains_by_meowing(){
        Cat felix = CatBuilder.aCat()
                .called("Felix")
                .ofBreed("Burmese")
                .ofColour("Brown")
                .bornOn(birthday);

        assertThat(felix.complaint()).isEqualTo("Meow");
    }

}