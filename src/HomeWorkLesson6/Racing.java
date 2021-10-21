package HomeWorkLesson6;


public class Racing {


    public static void main(String[] args) {


        Tiger tiger = new Tiger();
        Horse horse = new Horse();
        Dog dog = new Dog();


        if (tiger.getSpeed() > horse.getSpeed() && tiger.getSpeed() > dog.getSpeed()) {
            System.out.println("Winner is " + tiger.getClass().getSimpleName() + " with speed = " + tiger.getSpeed());
        } else if (horse.getSpeed() > tiger.getSpeed() && horse.getSpeed() > dog.getSpeed()) {
            System.out.println("Winner is " + horse.getClass().getSimpleName() + " with speed = " + horse.getSpeed());
        } else {
            System.out.println("Winner is " + dog.getClass().getSimpleName() + " with speed = " + dog.getSpeed());
        }
        System.out.println("End !!!");
    }
}





















