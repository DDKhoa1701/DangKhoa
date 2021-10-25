package HomeWorkLesson6;

import java.util.ArrayList;
import java.util.List;

public class Racing {


    public static void main (String[] args) {


        Animal tiger = new Tiger ();
        Animal horse = new Horse ();
        Animal dog = new Dog ();


        List<Animal> animals = new ArrayList<> ();
        animals.add (tiger);
        animals.add (horse);
        animals.add (dog);

        for (Animal animal : animals) {
            System.out.println ("Animal: " + animal.getClass ().getSimpleName () + " - speed = " + animal.getSpeed ());
        }

        Animal winner = null;

        for (Animal animal : animals) {
            if (winner == null) {
                winner = animal;
            } else {
                if (animal.getSpeed () > winner.getSpeed ())
                    winner = animal;
            }
        }
        System.out.println ("Winner is " + winner.getClass ().getSimpleName () + " with speed : " + winner.getSpeed ());
        System.out.println ("------Finish------");
    }
}
























