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
        // Scanner scanner = new Scanner(System.in);
        
        // System.out.println("Enter the number of rows: ");
        // int rowCounts = scanner.nextInt();
        // System.out.println("Enter the number of seats in each row: ");
        // int seatCounts = scanner.nextInt();

        // int totSeats = rowCounts * seatCounts;

        // System.out.println("Total income:");
        
        // if (totSeats < 60) {
        //     System.out.println("$" + totSeats*10);
        // }
        // else {
        //     int firstProfits = rowCounts/2*seatCounts*10;
        //     int secondProfits = (rowCounts - rowCounts/2)*seatCounts*8;
        //     int totProfits = firstProfits + secondProfits;
        //     System.out.println("$" + totProfits);
        // }

        // Third Stage
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter the number of rows: ");
        // int rowCounts = scanner.nextInt();
        // System.out.println("Enter the number of seats in each row: ");
        // int seatCounts = scanner.nextInt();

        // int totSeats = rowCounts * seatCounts;

        // System.out.println("Cinema:");
        // for (int i = 0; i < rowCounts+1; i++) {
        //     if (i == 0) {
        //         System.out.print(" ");
        //         for (int j = 1; j < seatCounts+1; j++) {
        //             System.out.print(" " + j);
        //             if (j == seatCounts) {
        //                 System.out.println("");
        //             }
        //         }
        //     }
        //     else {
        //         System.out.print(i + " ");
        //         String sVals = "S ".repeat(seatCounts-1) + "S";
        //         System.out.print(sVals);
        //         System.out.println("");
        //     }
        // }

        // System.out.println("");
        // System.out.println("Enter a row number: ");
        // int rowCountsSeat = scanner.nextInt();
        // System.out.println("Enter a seat number in that row: ");
        // int seatCountsSeat = scanner.nextInt();

        // if (totSeats < 60) {
        //     System.out.println("Ticket price: $10");
        // }

        // else {
        //     int midPoint = rowCounts/2;
        //     if (rowCountsSeat <= midPoint) {
        //         System.out.println("Ticket price: $10");
        //     }
        //     else {
        //         System.out.println("Ticket price: $8");
        //     }
        // }
        
        // System.out.println("Cinema:");
        // for (int i = 0; i < rowCounts+1; i++) {
        //     if (i == 0) {
        //         System.out.print(" ");
        //             for (int j = 1; j < seatCounts+1; j++) {
        //                 System.out.print(" " + j);
        //                 if (j == seatCounts) {
        //                     System.out.println("");
        //                 }
        //             }
        //         }
        //     else {
        //         if (i != rowCountsSeat) {
        //             System.out.print(i + " ");
        //             String sVals = "S ".repeat(seatCounts-1) + "S";
        //             System.out.print(sVals);
        //             System.out.println("");    
        //             }
        //         else {
        //             System.out.print(i + " ");
        //             String sValsWithB = "S ".repeat(seatCountsSeat-1) + "B " +
        //                 "S ".repeat(seatCounts-seatCountsSeat-1) + "S";
        //             System.out.print(sValsWithB);
        //             System.out.println("");
        //             }
        //     }
        // }

        // Fourth Stage
        Scanner scanner = new Scanner(System.in);

        boolean doNotExit = true;
        
        System.out.println("Enter the number of rows: ");
        int rowCounts = scanner.nextInt();
        System.out.println("Enter the number of seats in each row: ");
        int seatCounts = scanner.nextInt();
            
        int totSeats = rowCounts * seatCounts;

        String sBlanks = "S ".repeat(seatCounts-1) + "S";

        String sTotalCinema = " ";
            
        for (int m = 0; m <= rowCounts; m++) {
            // add header
            if (m == 0) {
                for (int j = 1; j <= seatCounts; j++) {
                    sTotalCinema += " " + j;
                }
                sTotalCinema += "\n";
            }
            else {
                sTotalCinema += m + " " + sBlanks + "\n";
            }
        }
            // System.out.println(sTotalCinema);
        while (doNotExit) {
            
            System.out.println("");
            System.out.println("""
            1. Show the seats
            2. Buy a ticket
            0. Exit
            """);
            int response = scanner.nextInt();

            if (response == 2) {
                System.out.println("");
                System.out.println("Enter a row number: ");
                int rowCountsSeat = scanner.nextInt();
                System.out.println("Enter a seat number in that row: ");
                int seatCountsSeat = scanner.nextInt();

                if (totSeats < 60) {
                    System.out.println("Ticket price: $10");
                }

                else {
                    int midPoint = rowCounts/2;
                    if (rowCountsSeat <= midPoint) {
                        System.out.println("Ticket price: $10");
                    }
                    else {
                        System.out.println("Ticket price: $8");
                    }
                }

                // now need to update sTotalCinema
                // index to change is defined as:
                // (a, b)
                // to get to here, we need to understand that
                // (a, b) will include all real estate at (a,b) [that row]
                // plus, 0 --> a x 0 ---> b-1
                // thus, the location is sum of that.

                int sIndexToChange = (rowCountsSeat)*(seatCounts*2+2) + (seatCountsSeat)*2;
                String sLeftChange = sTotalCinema.substring(0,sIndexToChange);
                String sRightChange = sTotalCinema.substring(sIndexToChange+1,sTotalCinema.length());
                sTotalCinema = sLeftChange + "B" + sRightChange;
                System.out.println(sTotalCinema);
            }
            else if (response == 0) {
                return;
            }
            else {
                System.out.println("Cinema:");
                System.out.println(sTotalCinema);
                // else {
                    // if (i != rowCountsSeat) {
                    //     System.out.print(i + " ");
                    //     String sVals = "S ".repeat(seatCounts-1) + "S";
                    //     System.out.print(sVals);
                    //     System.out.println("");    
                    //     }
                    // else {
                    //     System.out.print(i + " ");
                    //     String sValsWithB = "S ".repeat(seatCountsSeat-1) + "B " +
                    //         "S ".repeat(seatCounts-seatCountsSeat-1) + "S";
                    //     System.out.print(sValsWithB);
                    //     System.out.println("");
                    //     }
                }

            }
            
        }
        
        // System.out.println("Cinema:");
        // for (int i = 0; i < rowCounts+1; i++) {
        //     if (i == 0) {
        //         System.out.print(" ");
        //         for (int j = 1; j < seatCounts+1; j++) {
        //             System.out.print(" " + j);
        //             if (j == seatCounts) {
        //                 System.out.println("");
        //             }
        //         }
        //     }
        //     else {
        //         System.out.print(i + " ");
        //         String sVals = "S ".repeat(seatCounts-1) + "S";
        //         System.out.print(sVals);
        //         System.out.println("");
        //     }
        // }
        
        }
        
