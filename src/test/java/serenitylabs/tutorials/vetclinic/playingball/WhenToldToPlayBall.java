package serenitylabs.tutorials.vetclinic.playingball;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import serenitylabs.tutorials.vetclinic.playingball.model.Child;
import serenitylabs.tutorials.vetclinic.playingball.model.Game;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;
import static serenitylabs.tutorials.vetclinic.playingball.model.Game.*;
import static serenitylabs.tutorials.vetclinic.playingball.model.SampleDates.*;

public class WhenToldToPlayBall {

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setOutput(){
        System.setOut(new PrintStream(output));
    }

    @Test
    public void child_should_play_cricket_if_asked(){
        Child bill = new Child();

        bill.goPlay(Cricket);

        assertThat(output.toString()).isEqualTo("Hit the wicket");
    }

    @Test
    public void child_should_play_tennis_if_asked(){
        Child bill = new Child();

        bill.goPlay(Tennis);

        assertThat(output.toString()).isEqualTo("Serve the ball");
    }

    @Test
    public void child_should_play_handball_if_asked(){
        Child bill = new Child();

        bill.goPlay(Handball);

        assertThat(output.toString()).isEqualTo("Throw the ball");
    }

    @Test
    public void child_should_play_hockey_if_asked(){
        Child bill = new Child();

        bill.goPlay(Hockey);

        assertThat(output.toString()).isEqualTo("Hit the ball with the stick");
    }

    @Test
    public void child_should_play_football_if_asked(){
        Child bill = new Child();

        bill.goPlay(Football);

        assertThat(output.toString()).isEqualTo("Kick the ball");
    }

    @Test
    public void should_play_football_on_sundays(){
        Child bill = new Child();

        Game gamePlayed = bill.goPlayBallOn(A_SUNDAY);

        assertThat(gamePlayed).isEqualTo(Football);
    }

    @Test
    public void should_play_handball_on_weekdays(){
        Child bill = new Child();

        Game gamePlayed = bill.goPlayHandballOn(A_MONDAY, A_TUESDAY, A_WEDNESDAY, A_THURSDAY, A_FRIDAY);

        assertThat(gamePlayed).isEqualTo(Handball);
    }

    @Test
    public void should_play_tennis_on_wednesdays(){
        Child bill = new Child();

        Game gamePlayed = bill.goPlayTennisOn(A_WEDNESDAY);

        assertThat(gamePlayed).isEqualTo(Tennis);
    }

    @Test
    public void WhenSchedulingRecreationalSport(){
        Child bill = new Child();

    }
}
