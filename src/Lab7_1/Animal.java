package Lab7_1;

public abstract class Animal {


    protected abstract int speedAnimal ();

    protected abstract String name ();

    protected abstract boolean swimAble ();

    protected int maxSpeed;

    public Animal () {
    }

    public Animal (int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    protected int getMaxSpeed () {
        return maxSpeed;
    }

}
