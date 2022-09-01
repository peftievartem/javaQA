package hw3;

public class Chicken extends NonFlyingBird{

    Chicken(boolean feathers, boolean layEggs){
        super(feathers,layEggs);
    }

    @Override
    public String getInfo() {
        return "Chicken:  " + super.getInfo() + fly();
    }

}
