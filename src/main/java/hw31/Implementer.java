package hw31;

public class Implementer implements Interface1, Interface2 {

    Implementer() {
    }

    @Override
    public String defaultMethod() {
        return Interface1.super.defaultMethod();
    }

}
