import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
    public static void main (String [] args){
        int userInput;
        int number;
        int numDiff;
        //pick a random number
        Random random = new Random();
        number = random.nextInt(101);

        // as user to guess
        Scanner sc = new Scanner(System.in);
        System.out.println("What number am I thinking from 0 to 100: ");
        userInput = sc.nextInt();

        // difference between my number and user number
         numDiff = number - userInput;

         // result
        System.out.println("your number was "+ userInput);
        System.out.println("My number was "+ number);
        System.out.println("The difference between my number and your number is : " + Math.abs(numDiff));




    }
}
