package ExceptionHandling;

public class ThrowExample {
    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
        }
    }

    public static void main(String[] args) {
        validateAge(15); // This will throw IllegalArgumentException
    }
}

