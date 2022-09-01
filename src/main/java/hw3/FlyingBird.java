package hw3;

public class FlyingBird extends Bird{

    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers,layEggs);
    }

    @Override
    public String fly() {
        return "can fly";
    }
}
