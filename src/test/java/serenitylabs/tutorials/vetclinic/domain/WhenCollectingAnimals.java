package serenitylabs.tutorials.vetclinic.domain;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class WhenCollectingAnimals {

    private final static LocalDateTime birthday = LocalDateTime.of(2023,4,25,12,10);

    @Test
    public void a_list_of_animals_can_contain_cats_and_dogs(){
        Dog fido = DogBuilder.aDog()
                .called("Fido")
                .ofBreed("Labrador")
                .ofColour("Black")
                .bornOn(birthday);

        Cat felix = CatBuilder.aCat()
                .called("Felix")
                .ofBreed("Siamese")
                .ofColour("White")
                .bornOn(birthday);

        List<Animal> animals = new ArrayList<>();

        animals.add(fido);
        animals.add(felix);

        assertThat(animals).contains(felix,fido);
    }
}
