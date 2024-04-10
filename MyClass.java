public class MyClass {
    // Instance variable
    private String message;

    // Constructor
    public MyClass(String message) {
        this.message = message;
    }

    // Getter method
    public String getMessage() {
        return message;
    }

    // Setter method
    public void setMessage(String message) {
        this.message = message;
    }

    // Main method
    public static void main(String[] args) {
        MyClass myClass = new MyClass("Hello, World!");
        System.out.println(myClass.getMessage());
    }
}