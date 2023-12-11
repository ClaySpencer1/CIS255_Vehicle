import javax.swing.JFileChooser;
import javax.swing.JDialog;
import javax.swing.filechooser.FileFilter;
import java.awt.Window;
import java.io.File;

public class Program {
    public static void main(String[] args) {
        File selectedFile = Init("data.csv"); // Pass the file name

        if (selectedFile != null) {
            // Parse CSV data and create Car instances
            CsvParser csvParser = new CsvParser();
            Car[] cars = csvParser.parseCsv(selectedFile);

            // Print information about each car
            for (Car car : cars) {
                System.out.println(car.toString());
            }
        }
    }

    private static File Init(String fileName) {
        // ... (unchanged method)

        // Use the specified file name
        File selectedFile = new File(fileName);

        // File Was Chosen
        // ... (unchanged code)

        return selectedFile;
    }
}
