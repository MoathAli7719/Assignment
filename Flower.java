public class Flower {
    private String name;
    private int petals;
    private float price;

    // Constructor
    public Flower(String name, int petals, float price) {
        this.name = name;
        this.petals = petals > 0 ? petals : 0; // Ensure petals is non-negative
        this.price = price > 0 ? price : 0;   // Ensure price is non-negative
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    // Getter and Setter for petals
    public int getPetals() {
        return petals;
    }

    public void setPetals(int petals) {
        if (petals >= 0) {
            this.petals = petals;
        }
    }

    // Getter and Setter for price
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        Flower rose = new Flower("Rose", 12, 15.75f);

        System.out.println("Flower Details:");
        System.out.println("Name: " + rose.getName());
        System.out.println("Petals: " + rose.getPetals());
        System.out.println("Price: $" + rose.getPrice());

        // Update the flower details
        rose.setName("Tulip");
        rose.setPetals(10);
        rose.setPrice(12.5f);

        System.out.println("\nUpdated Flower Details:");
        System.out.println("Name: " + rose.getName());
        System.out.println("Petals: " + rose.getPetals());
        System.out.println("Price: $" + rose.getPrice());
    }
}
