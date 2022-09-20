package hw8;

public enum Type {
    PROM, FOOD, LIGHT
}

class TypeException extends Exception {
    public TypeException(String msg) {
        super(msg);
    }
    public TypeException(){}
}
