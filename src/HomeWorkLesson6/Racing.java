package HomeWorkLesson6;


import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Racing {

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<Animal>();

        Tiger tiger = new Tiger();
        Horse horse = new Horse();
        Dog dog = new Dog();

        animalList.add(tiger);
        animalList.add(dog);
        animalList.add(horse);

        int Tiger = new SecureRandom().nextInt(100);
        System.out.printf("Speed of Tiger = %d\n", Tiger);
        int Horse = new SecureRandom().nextInt(75);
        System.out.printf("Speed of Horse = %d\n", Horse);
        int Dog = new SecureRandom().nextInt(60);
        System.out.printf("Speed of Dog = %d\n", Dog);


        int guessing = 0;
        final int MAX_GUESS = 3;


        do {
            if (Tiger >= Horse && Tiger >= Dog) {
                System.out.println("Win is Tiger with speed : " + Tiger);
            }
            if (Horse >= Tiger && Horse >= Dog) {
                System.out.println("Win is Horse with speed: " + Horse);
            }
            if (Dog >= Tiger && Dog >= Horse) {
                System.out.println("Win is Dog with speed: " + Dog);
            }
            break;
        } while (guessing < MAX_GUESS);
        System.out.println("End !!!");
    }
}




