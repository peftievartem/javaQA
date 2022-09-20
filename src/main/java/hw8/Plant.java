package hw8;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant () {}

    public Plant(int size, String colorName, String typeName) throws ColorException, TypeException{
        this.size = size;
        this.setColor(colorName);
        this.setType(typeName);
    }

    @Override
    public String toString() {
        return "\n Size:" + size + ", Color: " + color.toString() + ", Type: " + type.toString();
    }

    public Color getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public Type getType() {
        return type;
    }

    public void setColor(Color color) throws ColorException{
        try {
            this.color = color;
        } catch (IllegalArgumentException ex) {
            throw new ColorException("color error");
        }
    }
    public void setColor(String color) throws ColorException{
        try {
            this.color = Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException ex) {
            throw new ColorException("color error");
        }
    }


    public void setSize(int size) {
        this.size = size;
    }

    public void setType(Type type) throws TypeException{
        try {
            this.type = type;
        } catch (IllegalArgumentException ex) {
            throw new TypeException("type error");
        }
    }
    public void setType(String type) throws TypeException{
        try {
            this.type = Type.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException ex) {
            throw new TypeException("type error");
        }
    }
}