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

        int tiGer = new SecureRandom().nextInt(100);
        System.out.printf("Speed of Tiger = %d\n", tiGer);
        int hoRse = new SecureRandom().nextInt(75);
        System.out.printf("Speed of Horse = %d\n", hoRse);
        int doG = new SecureRandom().nextInt(60);
        System.out.printf("Speed of Dog = %d\n", doG);


        int guessing = 0;
        final int MAX_GUESS = 3;


        do {
            if (tiGer >= hoRse && tiGer >= doG) {
                System.out.println("Win is Tiger with speed : " + tiGer);
            }
            if (hoRse >= tiGer && hoRse >= doG) {
                System.out.println("Win is Horse with speed: " + hoRse);
            }
            if (doG >= tiGer && doG >= hoRse) {
                System.out.println("Win is Dog with speed: " + doG);
            }
            break;
        } while (guessing < MAX_GUESS);
        System.out.println("End !!!");
    }
}




