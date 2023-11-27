// StorageClass.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StorageClass<T extends Vehicle> {
    private List<T> vehicles;

    public StorageClass() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(T vehicle) {
        this.vehicles.add(vehicle);
    }

    public List<T> getVehicles() {
        return vehicles;
    }

    public void sortVehiclesByMake() {
        Collections.sort(vehicles);
    }

    // Other methods as needed
}
