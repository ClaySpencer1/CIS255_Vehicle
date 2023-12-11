public class Year {
    private int year;
    private String engineType;

    public Year(int year, String engineType) {
        this.year = year;
        this.engineType = engineType;
    }

    // Getters and setters go here

    @Override
    public String toString() {
        return "Year{" +
                "year=" + year +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
