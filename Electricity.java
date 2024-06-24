// ElectricityBill.java

// Define an ElectricityBill class
public class ElectricityBill {
    // Instance variables
    private int consumerId;
    private String consumerName;
    private int unitsConsumed;
    private double billAmount;

    // Constructor to initialize the object
    public ElectricityBill(int id, String name, int units) {
        consumerId = id;
        consumerName = name;
        unitsConsumed = units;
        calculateBill(); // Calculate the bill amount upon object creation
    }

    // Method to calculate the electricity bill
    private void calculateBill() {
        // Assuming different rates for different ranges of units consumed
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 1.20; // Rate for first 100 units
        } else if (unitsConsumed > 100 && unitsConsumed <= 300) {
            billAmount = 100 * 1.20 + (unitsConsumed - 100) * 2.00; // Rate for next 200 units
        } else {
            billAmount = 100 * 1.20 + 200 * 2.00 + (unitsConsumed - 300) * 3.50; // Rate beyond 300 units
        }
    }

    // Method to display the bill details
    public void displayBill() {
        System.out.println("Electricity Bill Details:");
        System.out.println("Consumer ID: " + consumerId);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: $" + billAmount);
    }

    // Main method to test the ElectricityBill class
    public static void main(String[] args) {
        // Create an instance of ElectricityBill
        ElectricityBill eb = new ElectricityBill(12345, "John Doe", 250);

        // Display the bill details
        eb.displayBill();
    }
}
