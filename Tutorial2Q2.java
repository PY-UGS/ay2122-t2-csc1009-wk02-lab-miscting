import java.util.*;
public class Tutorial2Q2
{
    public static void main (String[] args)
    {
        float sum = 0, average;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter three numbers: ");

        float value1 = input.nextFloat();
        float value2 = input.nextFloat();
        float value3 = input.nextFloat();

        sum = value1 + value2 + value3;
        average = sum / 3;

        System.out.printf("The average of " + value1 + " " + value2 + " " + value3 + " is " + average);
        input.close();
    }
}