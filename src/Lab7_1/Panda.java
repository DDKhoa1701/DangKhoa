package Lab7_1;

import java.security.SecureRandom;

public class Panda extends Animal {
    private final static int PANDA_MAX_SPEED = 100;

    @Override
    protected int speedAnimal () {
        return getMaxSpeed ();
    }

    @Override
    protected String name () {
        return "Panda";
    }

    @Override
    protected boolean swimAble () {
        return false;
    }

    public Panda () {
        super (new SecureRandom ().nextInt (PANDA_MAX_SPEED));
    }
}
