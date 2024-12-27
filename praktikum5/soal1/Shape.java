package praktikum5.soal1;

abstract class Shape {
    private String shapeName;

    public Shape(String name) {
        shapeName = name;
    }

    public abstract double area();

    @Override
    public String toString() {
        return shapeName;
    }
}