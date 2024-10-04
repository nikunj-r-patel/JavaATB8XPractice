package Sept24.day30092024;

// Class definition
class ATBStudent {
    // Attributes
    String name;
    String phoneNo;
    int id;
    String address;
    String batchName;
    int age;

    // Constructor
    public ATBStudent(String name, String phoneNo, int id, String address, int age) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.id = id;
        this.address = address;
        this.batchName = "atb8X"; // Fixed batch name for all students
        this.age = age;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Phone No: " + phoneNo);
        System.out.println("ID: " + id);
        System.out.println("Address: " + address);
        System.out.println("Batch Name: " + batchName);
        System.out.println("Age: " + age);
        System.out.println("-------------------");
    }
}

    // Main class to create objects and test the ATBStudent class
    class Main {
        public static void main(String[] args) {
            // Creating 5 ATBStudent objects
            ATBStudent studentA1 = new ATBStudent("Alice", "123-456-7890", 101, "123 Main St", 20);
            ATBStudent studentA2 = new ATBStudent("Bob", "234-567-8901", 102, "456 Oak St", 21);
            ATBStudent studentA3 = new ATBStudent("Charlie", "345-678-9012", 103, "789 Pine St", 22);
            ATBStudent studentB1 = new ATBStudent("David", "456-789-0123", 104, "321 Elm St", 23);
            ATBStudent studentB2 = new ATBStudent("Eve", "567-890-1234", 105, "654 Maple St", 24);

            // Displaying information of each student
            studentA1.displayStudentInfo();
            studentA2.displayStudentInfo();
            studentA3.displayStudentInfo();
            studentB1.displayStudentInfo();
            studentB2.displayStudentInfo();
        }
}
