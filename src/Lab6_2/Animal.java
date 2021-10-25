package Lab6_2;

public class Animal {

    private final boolean flyable;
    private final int speed;
    private final String name;


    public Animal (BuilderAnimal builder) {
        this.flyable = builder.flyable;
        this.speed = builder.speed;
        this.name = builder.name;

    }

    public boolean isFlyable () {
        return this.flyable;

    }

    public int getSpeed () {
        return this.speed;
    }

    public String getName () {
        return this.name;
    }


    public static class BuilderAnimal {
        private boolean flyable;
        private int speed;
        private String name;


        public BuilderAnimal flyable (boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public BuilderAnimal isName (String name) {
            this.name = name;
            return this;
        }


        public BuilderAnimal withSpeed (int speed) {
            this.speed = speed;
            return this;
        }


        public Animal build () {
            return new Animal (this);
        }
    }
}
