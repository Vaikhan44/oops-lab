class Date {

    // Instance variables
    private int month;
    private int day;
    private int year;

    // Constructor
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Set methods
    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Get methods
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    // Method to display date
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}
public class DisplayDate {

    public static void main(String[] args) {

        // Create Date object
        Date date = new Date(9, 16, 2026);

        // Display original date
        System.out.print("Original Date: ");
        date.displayDate();

        // Modify date using setter methods
        date.setMonth(12);
        date.setDay(25);
        date.setYear(2025);

        // Display modified date
        System.out.print("Updated Date: ");
        date.displayDate();
    }
}
