import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int studentsA = scanner.nextInt();
        int studentsB = scanner.nextInt();
        int studentsC = scanner.nextInt();

        /*
         *  your code goes here
         */
        int desksA = ((studentsA / 2) + (studentsA % 2));
        int desksB = ((studentsB / 2) + (studentsB % 2));
        int desksC = ((studentsC / 2) + (studentsC % 2));
        
         System.out.print(desksA + desksB + desksC);
        // closing the scanner object
        scanner.close();
    }
}