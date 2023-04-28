package serenitylabs.tutorials.vetclinic.playingball.model;

import java.time.LocalDate;
import java.util.List;

public class Child {

    public void goPlay(Game game) {
        Player gameToPlay = PlayerForGame.called(game);
        gameToPlay.play();
    }

    public Game goPlayBallOn(LocalDate aSaturday){
        return Game.Football;
    }

    public Game goPlayHandballOn(LocalDate Monday, LocalDate Tuesday, LocalDate Wednesday, LocalDate Thursday, LocalDate Friday){
        return  Game.Handball;

    }

    public Game goPlayTennisOn(LocalDate aWednesday) {
        return Game.Tennis;
    }
}