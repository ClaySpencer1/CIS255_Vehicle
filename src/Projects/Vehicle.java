// Vehicle.java
public abstract class Vehicle implements Comparable<Vehicle> {

    @Override
    public int compareTo(Vehicle other) {
        // Compare vehicles based on the make
        return this.make.compareTo(other.make);
    }
}
