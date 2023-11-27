// FileHandler.java
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileHandler<T extends Vehicle> {
    public void exportToCSV(String fileName, List<T> vehicles) {
        try (FileWriter writer = new FileWriter(fileName)) {
            // Write header
            writer.write("Type|Make|Model|Year|EngineType|Color|Doors|Transmission\n");

            // Write data
            for (Vehicle vehicle : vehicles) {
                // Convert each vehicle to a CSV row
                String csvRow = String.format(
                        "%s|%s|%s|%d|%s|%s|%d|%s\n",
                        vehicle.getType(), vehicle.getMake(), vehicle.getModel(),
                        vehicle.getYear(), ((Car) vehicle).getEngineType(),
                        ((Car) vehicle).getColor(), ((Car) vehicle).getDoors(),
                        ((Car) vehicle).getTransmission()
                );
                writer.write(csvRow);
            }

            System.out.println("Export successful!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
