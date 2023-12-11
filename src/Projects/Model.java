public class Model {
    private String type;
    private String make;
    private String model;
    private int year;
    private String engineType;
    private String color;
    private int doors;
    private String transmission;

    public Model(String type, String make, String model, int year, String engineType,
                 String color, int doors, String transmission) {
        this.type = type;
        this.make = make;
        this.model = model;
        this.year = year;
        this.engineType = engineType;
        this.color = color;
        this.doors = doors;
        this.transmission = transmission;
    }

    // Getters and setters go here

    @Override
    public String toString() {
        return "Model{" +
                "type='" + type + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engineType='" + engineType + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
