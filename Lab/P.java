public class P {
    // Static variable to keep track of the number of Person objects
    private static int personCount = 0;

    // Instance variables
    private String name;
    private int id;

    // Parameterized constructor
    public P(String name, int id) {
        this.name = name;
        this.id = id;
        // Increment the static variable when a new object is created
        P.personCount++;
    }

    // Instance method to show information
    public void showInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    // Static method to return object count
    public static int getPersonCount() {
        return personCount;
    }

    public static void main(String[] args) {
        // Creating Person objects
        P person1 = new P("Alice", 101);
        P person2 = new P("Bob", 102);
        P person3 = new P("Charlie", 103);

        // Displaying information about the persons
        person1.showInfo();
        person2.showInfo();
        person3.showInfo();

        // Getting the count of Person objects using the static method
        int count = P.getPersonCount();
        System.out.println("Total Person objects created: " + count);
    }
}
