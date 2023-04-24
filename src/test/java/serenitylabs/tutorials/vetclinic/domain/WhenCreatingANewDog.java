package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.StrictAssertions.assertThat;

public class WhenCreatingANewDog {
    @Test
    public void it_should_have_a_name() {
        LocalDateTime birthday = LocalDateTime.now();

        Dog fido = Dog.called("Fido")
                .ofBreed("Poodle")
                .ofColour("Black")
                .withFavouriteFood("Pizza")
                .withFavouriteToy("Ball")
                .bornOn(birthday);

        assertThat(fido.getName()).isEqualTo("Fido");
        assertThat(fido.getBreed()).isEqualTo("Poodle");
        assertThat(fido.getDateOfBirth()).isEqualTo(birthday);
        assertThat(fido.getFavouriteFood()).isEqualTo("Pizza");
        assertThat(fido.getColour()).isEqualTo("Black");
        assertThat(fido.getFavouriteToy()).isEqualTo("Ball");
    }
}