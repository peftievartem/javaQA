package main.java.hw3;

public class NonFlyingBird extends Bird{

    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers,layEggs);
    }

    @Override
    public String fly() {
        return "can't fly";
    }
}
