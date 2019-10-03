import java.util.Scanner;

public class CelsiusToFahrenheit {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         double celsius;
         double fahrenheit;

         System.out.print("Enter Temp in Celsius: ");
         celsius = sc.nextDouble();
         fahrenheit = 32 + (celsius * 9/5);

         System.out.printf("%.1f C = %.1f Fahrenheit \n", celsius, fahrenheit);


    }
}
