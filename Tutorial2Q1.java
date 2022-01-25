import java.util.*;
public class Tutorial2Q1
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        /*
        System.out.print("Enter a byte value: ");
        byte byteValue = input.nextByte();

        System.out.print("Enter a short value: ");
        short shortValue = input.nextShort();

        System.out.print("Enter an int value: ");
        int intValue = input.nextInt();

        System.out.print("Enter a long value: ");
        long longValue = input.nextLong();

        System.out.print("Enter a float value: ");
        float floatValue = input.nextFloat();

        System.out.println("Byte Value: " + byteValue + "\nShort Value: " + shortValue + "\nInt Value: " + intValue + "\nLong Value: " + longValue + "\nFloat Value: " + floatValue);
        */
        
        double pi = 3.14159;
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area = pi * radius * radius;
        System.out.print("The area for the circle of radius " + radius + " is " + area);
        
        
        input.close();
        
    }
}