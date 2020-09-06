import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();


        /*
         *  your code goes here
         */
         int deltaHours = hours2 - hours1;
         int deltaMinutes = minutes2 - minutes1;
         int deltaSeconds = seconds2 - seconds1;

         System.out.print((deltaHours * 3600) + (deltaMinutes * 60) + (deltaSeconds));

        // closing the scanner object
        scanner.close();
    }
}