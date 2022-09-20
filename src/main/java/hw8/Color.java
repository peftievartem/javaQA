package hw8;

public enum Color {
    RED, GREEN, BLUE
}

class ColorException extends Exception {
    public ColorException(String msg) {
        super(msg);
    }
    public ColorException(){}
}