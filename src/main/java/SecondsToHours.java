import java.util.Scanner;

public class SecondsToHours {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int secInAnHour = 3600;
        int seconds;
        int minute;
        int hours;
        int secondLeft;


        System.out.print("Enter number of seconds: ");
        seconds = sc.nextInt();
        hours = seconds/secInAnHour;
        minute= (seconds % secInAnHour) /60;
        secondLeft = (seconds % secInAnHour) %60;

        System.out.println( seconds + " seconds = " + hours + ":" + minute+ ":"+ secondLeft);







    }
}
