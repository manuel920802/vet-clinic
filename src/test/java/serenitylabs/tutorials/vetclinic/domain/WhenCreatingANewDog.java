package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.StrictAssertions.assertThat;

public class WhenCreatingANewDog {

    private final static LocalDateTime birthday = LocalDateTime.now();
    @Test
    public void a_new_dog_should_have_a_name_a_breed_a_colour_and_a_date_of_birth() {
        Dog fido = DogBuilder.aDog()
                .called("Fido")
                .ofBreed("Poodle")
                .ofColour("Black")
                .bornOn(birthday);

        assertThat(fido.getName()).isEqualTo("Fido");
        assertThat(fido.getBreed()).isEqualTo("Poodle");
        assertThat(fido.getColour()).isEqualTo("Black");
        assertThat(fido.getDateOfBirth()).isEqualTo(birthday);
    }
    @Test
    public void a_dog_can_have_an_optional_favourite_food() {
        Dog fido = DogBuilder.aDog()
                .called("Fido")
                .ofBreed("Poodle")
                .ofColour("Black")
                .withFavouriteFood("Pizza")
                .bornOn(birthday);

        assertThat(fido.getName()).isEqualTo("Fido");
        assertThat(fido.getBreed()).isEqualTo("Poodle");
        assertThat(fido.getColour()).isEqualTo("Black");
        assertThat(fido.getFavouriteFood()).isEqualTo("Pizza");
        assertThat(fido.getDateOfBirth()).isEqualTo(birthday);
    }

    @Test
    public void a_dog_can_have_an_optional_favourite_toy() {
        Dog fido = DogBuilder.aDog()
                .called("Fido")
                .ofBreed("Poodle")
                .ofColour("Black")
                .withFavouriteToy("Ball")
                .bornOn(birthday);

        assertThat(fido.getName()).isEqualTo("Fido");
        assertThat(fido.getBreed()).isEqualTo("Poodle");
        assertThat(fido.getColour()).isEqualTo("Black");
        assertThat(fido.getFavouriteToy()).isEqualTo("Ball");
        assertThat(fido.getDateOfBirth()).isEqualTo(birthday);
    }

}