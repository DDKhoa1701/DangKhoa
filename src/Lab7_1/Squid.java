package Lab7_1;

import java.security.SecureRandom;

public class Squid extends Animal {
    private final static int SQUID_MAX_SPEED = 80;

    @Override
    protected int speedAnimal () {
        return getMaxSpeed ();
    }

    @Override
    protected String name () {
        return "Squid";
    }

    @Override
    protected boolean swimAble () {
        return true;
    }

    public Squid () {
        super (new SecureRandom ().nextInt (SQUID_MAX_SPEED));
    }
}
