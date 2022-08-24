package main.java.hw3;

public class Penguin extends NonFlyingBird{

    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String getInfo() {
        return "Penguin:  " + super.getInfo() + fly();
    }
}
