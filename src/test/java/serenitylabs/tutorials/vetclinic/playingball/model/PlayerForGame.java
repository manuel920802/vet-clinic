package serenitylabs.tutorials.vetclinic.playingball.model;

//This is a factory class: It is a class that produces instances of another class
public class PlayerForGame {

    public static Player called(Game game) {
        switch (game) {
            case Football:
                return new PlayFootBall();
            case Tennis:
                return new PlayTennis();
            case Cricket:
                return new PlayCricket();
            case Handball:
                return new PlayHandball();
            default:
                try {
                    throw new DontKnowThatGameException("Unknown game");
                } catch (DontKnowThatGameException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
