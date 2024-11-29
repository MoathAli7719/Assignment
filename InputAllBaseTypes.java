
import java.util.Scanner;

public class InputAllBaseTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input different base types
        System.out.print("Enter a byte value: ");
        byte b = scanner.nextByte();

        System.out.print("Enter a short value: ");
        short s = scanner.nextShort();

        System.out.print("Enter an int value: ");
        int i = scanner.nextInt();

        System.out.print("Enter a long value: ");
        long l = scanner.nextLong();

        System.out.print("Enter a float value: ");
        float f = scanner.nextFloat();

        System.out.print("Enter a double value: ");
        double d = scanner.nextDouble();

        System.out.print("Enter a char value: ");
        char c = scanner.next().charAt(0);

        System.out.print("Enter a boolean value: ");
        boolean bool = scanner.nextBoolean();

        // Print the entered values
        System.out.println("You entered: byte=" + b + ", short=" + s + ", int=" + i + ", long=" + l +
                ", float=" + f + ", double=" + d + ", char=" + c + ", boolean=" + bool);
        
        scanner.close();
    }
}
