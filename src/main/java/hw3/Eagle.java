package main.java.hw3;

public class Eagle extends FlyingBird{

    public Eagle(boolean feathers, boolean layEggs){
        super(feathers,layEggs);
    }

    @Override
    public String getInfo() {
        return "Eagle:  " + super.getInfo() + fly();
    }
}
