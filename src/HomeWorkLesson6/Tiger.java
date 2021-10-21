package HomeWorkLesson6;

import java.security.SecureRandom;

public class Tiger extends Animal {
    public Tiger() {
    }

    @Override
    protected int getSpeed() {
        int tigerRandom;
        tigerRandom = new SecureRandom().nextInt(200);
        return tigerRandom;
    }

    @Override
    protected void speak() {
        super.speak();
    }
}