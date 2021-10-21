package HomeWorkLesson6;

public class Animal {

    private int speed;

    public Animal() {
    }

    public Animal(int speed) {
        this.speed = speed;
    }

    protected int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    protected void speak() {
        System.out.println("Speak !!!!!");
    }
}


