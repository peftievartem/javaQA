package main.java.hw3;

public class Swallow extends FlyingBird{

    Swallow(boolean feathers, boolean layEggs){
        super(feathers,layEggs);
    }

    @Override
    public String getInfo() {
        return "Swallow:  " + super.getInfo() + fly();
    }
}
