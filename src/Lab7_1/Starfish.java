package Lab7_1;

import java.security.SecureRandom;

public class Starfish extends Animal {
    private final static int STARFISH_MAX_SPEED = 40;


    @Override
    protected int speedAnimal () {
        return getMaxSpeed ();
    }

    @Override
    protected String name () {
        return "Starfish";
    }

    @Override
    protected boolean swimAble () {
        return true;
    }

    public Starfish () {
        super (new SecureRandom ().nextInt (STARFISH_MAX_SPEED));
    }
}
