package main.java.hw3;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    Bird(){}

    Bird(boolean feathers, boolean layEggs){
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public boolean isFeathers() {
        return feathers;
    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    public String getInfo() {
        return ((this.feathers) ? "has feathers, " :  "hasn't feathers, ") +
                ((this.layEggs) ? "can lay eggs, " :  "can't lay eggs, ");

    }

    @Override
    public String toString() {
        return "feathers=" + feathers + ", layEggs=" + layEggs;
    }

    public abstract String fly();
}
