package HomeWork;

public class CEO extends Employee {
    @Override
    public double getSalary() {

        return 2000;
    }

    public double getSupportSalary() {

        return 0;
    }

    public double getVIP() {
        return 1000;
    }
}

