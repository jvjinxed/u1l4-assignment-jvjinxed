import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
       int inputAngle = scanner.nextInt();

        /*
         *  your code goes here
         */
         int hour = inputAngle / 30;
         int hourAngle = hour * 30;
         int angleDiff = inputAngle - hourAngle;
         
         int min = (angleDiff * 2);
         //finds minute angle
         int minAngle = min * 6;

         System.out.print(minAngle);
        // closing the scanner object
        scanner.close();
    }
}