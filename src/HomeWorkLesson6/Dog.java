package HomeWorkLesson6;

import java.security.SecureRandom;

public class Dog extends Animal {
    public Dog() {
    }

    @Override
    protected int getSpeed() {
        int dogRandom;
        dogRandom = new SecureRandom().nextInt(50);
        return dogRandom;
    }
}
