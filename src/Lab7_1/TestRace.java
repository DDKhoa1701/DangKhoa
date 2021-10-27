package Lab7_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRace {

    public static void main (String[] args) {
        Animal Squid = new Squid ();
        Animal Octopus = new Octopus ();
        Animal Starfish = new Starfish ();
        Animal Panda = new Panda ();

        List<Animal> animalList = Arrays.asList (Squid, Starfish, Panda, Octopus);

        List<Animal> raceTest = new ArrayList<> ();


        for (Animal animal : animalList) {
            if (animal.swimAble ())
                raceTest.add (animal);
        }

        for (Animal animal : raceTest) {
            System.out.println ("Animal: " + animal.name () + " - speed = " + animal.speedAnimal ());
        }

        System.out.println ("\t\t##########");

        Animal winner = null;

        for (Animal animal : raceTest) {
            if (winner == null) {
                winner = animal;
            } else {
                if (animal.speedAnimal () > winner.speedAnimal ())
                    winner = animal;
            }
        }
        System.out.println ("Winner is " + winner.name () + " with speed : " + winner.speedAnimal ());
        System.out.println ("\t------Finish------");

    }

}
