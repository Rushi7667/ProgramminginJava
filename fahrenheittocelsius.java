import java.util.Scanner;
public class fahrenheittocelsius 
{
    public static void main(String[] args) 
    {
        double celsius, fahrenheit;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter temperature in Fahrenheit:");
            fahrenheit = sc.nextDouble();
        }

        celsius = (fahrenheit-32)*(0.5556);
        System.out.println("Temperature in Celsius:"+celsius);        
    }
}