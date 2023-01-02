package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here

        // First Stage
        // System.out.println("Cinema:");
        // System.out.println("  1 2 3 4 5 6 7 8");
        // System.out.println("1 S S S S S S S S");
        // System.out.println("2 S S S S S S S S");
        // System.out.println("3 S S S S S S S S");
        // System.out.println("4 S S S S S S S S");
        // System.out.println("5 S S S S S S S S");
        // System.out.println("6 S S S S S S S S");
        // System.out.println("7 S S S S S S S S");

        // Second Stage
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of rows: ");
        int rowCounts = scanner.nextInt();
        System.out.println("Enter the number of seats in each row: ");
        int seatCounts = scanner.nextInt();

        int totSeats = rowCounts * seatCounts;

        System.out.println("Total income:");
        
        if (totSeats < 60) {
            System.out.println("$" + totSeats*10);
        }
        else {
            int firstProfits = rowCounts/2*seatCounts*10;
            int secondProfits = (rowCounts - rowCounts/2)*seatCounts*8;
            int totProfits = firstProfits + secondProfits;
            System.out.println("$" + totProfits);
        }
        
    }
}