package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.StrictAssertions.assertThat;

public class WhenCreatingANewDog {

    private final static LocalDateTime birthday = LocalDateTime.now();
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

}