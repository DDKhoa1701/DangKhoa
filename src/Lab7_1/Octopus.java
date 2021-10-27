package Lab7_1;

import java.security.SecureRandom;

public class Octopus extends Animal {
    private final static int OCTOPUS_MAX_SPEED = 60;

    @Override
    protected int speedAnimal () {
        return getMaxSpeed ();
    }

    @Override
    protected String name () {
        return "Octopus";
    }

    @Override
    protected boolean swimAble () {
        return true;
    }

    public Octopus () {
        super (new SecureRandom ().nextInt (OCTOPUS_MAX_SPEED));
    }
}
