import java.util.Scanner;

public class TerminalMenu {
    private Scanner scanner;
    private StorageClass storageClass; 
    public TerminalMenu() {
        scanner = new Scanner(System.in);
        storageClass = new StorageClass(); 
    }

    public void displayMenu() {
        // existing code

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Implement Select Vehicles logic
                System.out.println("Enter the make of the vehicle:");
                String make = scanner.next();
                System.out.println("Enter the model of the vehicle:");
                String model = scanner.next();
                System.out.println("Enter the year of the vehicle:");
                int year = scanner.nextInt();
                // Add more inputs if needed

                // Create a new vehicle and add it to the storageClass
                storageClass.addVehicle(new Vehicle(make, model, year, /* Add other parameters */));
                System.out.println("Vehicle added successfully.");
                break;
            case 2:
                // Sort vehicles by make before displaying
                storageClass.sortVehiclesByMake();
                // Implement Show Vehicles logic
                storageClass.displayVehicles();
                break;
            case 3:
                // Implement Save to File logic
                storageClass.saveToFile("output.txt"); // 
                System.out.println("Data saved to file successfully.");
                break;
            case 4:
                // Save to File and Exit
                System.out.println("Exiting...");
                storageClass.saveToFile("output.txt"); // Save data before exiting
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
