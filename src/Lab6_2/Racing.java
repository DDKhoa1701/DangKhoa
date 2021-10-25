package Lab6_2;


import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Racing {

    private final static int BEAR_MAX_SPEED = 100;
    private final static int WOLF_MAX_SPEED = 70;
    private final static int MINK_MAX_SPEED = 50;
    private final static int OWL_MAX_SPEED = 200;
    private final static int DOVE_MAX_SPEED = 250;

    public static void main (String[] args) {
        Animal bear =
                new Animal.BuilderAnimal ()
                        .flyable (false)
                        .isName ("Bear")
                        .withSpeed (new SecureRandom ().nextInt (BEAR_MAX_SPEED))
                        .build ();
        Animal wolf =
                new Animal.BuilderAnimal ()
                        .flyable (false)
                        .isName ("Wolf")
                        .withSpeed (new SecureRandom ().nextInt (WOLF_MAX_SPEED))
                        .build ();
        Animal mink =
                new Animal.BuilderAnimal ()
                        .flyable (false)
                        .isName ("Mink")
                        .withSpeed (new SecureRandom ().nextInt (MINK_MAX_SPEED))
                        .build ();
        Animal owl =
                new Animal.BuilderAnimal ()
                        .flyable (true)
                        .isName ("Owl")
                        .withSpeed (new SecureRandom ().nextInt (OWL_MAX_SPEED))
                        .build ();
        Animal dove =
                new Animal.BuilderAnimal ()
                        .flyable (true)
                        .isName ("Dove")
                        .withSpeed (new SecureRandom ().nextInt (DOVE_MAX_SPEED))
                        .build ();

        List<Animal> animalList = Arrays.asList (bear, wolf, mink, owl, dove);
        List<Animal> raceTest = new ArrayList<> ();
        for (Animal animal : animalList) {
            if (!animal.isFlyable ())
                raceTest.add (animal);
        }
        for (Animal animal : raceTest) {
            System.out.println ("Animal: " + animal.getName () + " - speed = " + animal.getSpeed ());
        }

        System.out.println ("\t\t##########");

        Animal winner = null;

        for (Animal animal : raceTest) {
            if (winner == null) {
                winner = animal;
            } else {
                if (animal.getSpeed () > winner.getSpeed ())
                    winner = animal;
            }
        }
        System.out.println ("Winner is " + winner.getName () + " with speed : " + winner.getSpeed ());
        System.out.println ("\t------Finish------");
    }
}

