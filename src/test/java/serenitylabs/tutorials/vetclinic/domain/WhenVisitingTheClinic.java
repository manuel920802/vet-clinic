package serenitylabs.tutorials.vetclinic.domain;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.*;


public class WhenVisitingTheClinic {

    private final static LocalDateTime birthday = LocalDateTime.of(2023,4,25,12,10);

    @Test
    public void cats_and_dogs_complain_to_the_assistant(){
        Dog fido = DogBuilder.aDog()
                .called("Fido")
                .ofBreed("Labrador")
                .ofColour("Black")
                .bornOn(birthday);

        Cat felix = CatBuilder.aCat()
                .called("Felix")
                .ofBreed("Burmese")
                .ofColour("Brown")
                .bornOn(birthday);

        ComplaintRegister complaintRegister = new ComplaintRegister();
        VetAssistant assistant = new VetAssistant(complaintRegister);

        assistant.recordComplainFrom(fido);
        assistant.recordComplainFrom(felix);

        assertThat(complaintRegister.getComplaints()).contains("Grrrr", "Meow");

    }

    @Test
    public void the_vet_should_know_when_a_pet_vaccination_is_due(){
        NeedsVaccinations felix = CatBuilder.aCat()
                .called("Felix")
                .ofBreed("Burmese")
                .ofColour("Brown")
                .bornOn(birthday);

        LocalDate today = LocalDate.now();
        LocalDate nextYear = today.plusYears(1);

        felix.wasVaccinatedOn(today);

        assertThat(felix.nextVaccinationDue()).isEqualTo(nextYear);
    }

    @Test
    public void dogs_need_vaccinations_every_six_months(){
        NeedsVaccinations fido = DogBuilder.aDog()
                .called("Fido")
                .ofBreed("Labrador")
                .ofColour("Black")
                .bornOn(birthday);

        LocalDate today = LocalDate.now();
        LocalDate inSixMonthsTime = today.plusMonths(6);

        fido.wasVaccinatedOn(today);

        assertThat(fido.nextVaccinationDue()).isEqualTo(inSixMonthsTime);
    }
}
