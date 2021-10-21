package HomeWorkLesson6;

import java.security.SecureRandom;

public class Horse extends Animal {
    public Horse() {
    }

    @Override
    protected int getSpeed() {
        int horseRandom;
        horseRandom = new SecureRandom().nextInt(100);
        return horseRandom;
    }

}


