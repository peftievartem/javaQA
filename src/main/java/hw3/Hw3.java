package hw3;

public class Hw3 {

    public static void main(String[] args) {

        Eagle eagle = new Eagle(true, true);
        Swallow swallow = new Swallow(true,true);
        Penguin penguin = new Penguin(true, true);
        Chicken chicken = new Chicken(false, false);

        Bird[] birds = {eagle, swallow, penguin, chicken};

        for (Bird elem : birds) {
            System.out.println(elem.getInfo());
        }
    }
}
