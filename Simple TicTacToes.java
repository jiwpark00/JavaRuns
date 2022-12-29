package tictactoe;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // write your code here

        // Print the blank game stage first
        System.out.println("---------");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("---------");

        boolean minPlaysMade = false;
        boolean gameIsOngoing = true;
        int numPlaysMade = 0;
        
        Scanner scanner = new Scanner(System.in); 
        String ticTacToes = "         ";


        
        // System.out.println("---------");
        
        // for (int i = 0; i < ticTacToes.length(); i++) {

        //     // pipes
        //     if ( (i == 0) || (i == 3) || (i == 6)) {
        //         System.out.print("| ");
        //     }
            
        //     System.out.print(ticTacToes.charAt(i));

        //     if ( (i == 2) || (i == 5) || (i == 8)) {
        //         System.out.print(" |");
        //         System.out.println();
        //     }
        //     else {
        //         System.out.print(" ");
        //     }
        // }
        // System.out.println("---------");
        while (gameIsOngoing) {
            
        boolean firstInputBad = true;
        String firstInput = scanner.next();
        while (firstInputBad) {
            try {
                int firstCoor = Integer.parseInt(firstInput);
                firstInputBad = false; // exits the while loop
                }
            catch (Exception e) {
                System.out.println("You should enter numbers!");
                }
            }
        // annoying but have to define again -- probably a better way exists.
        int firstCoor = Integer.parseInt(firstInput);

        boolean secondInputBad = true;
        String secondInput = scanner.next();
        while (secondInputBad) {
            try {
                int secondCoor = Integer.parseInt(secondInput);
                secondInputBad = false; // exists the while loop
                }
        catch (Exception e) {
            System.out.println("You should enter the numbers!");
                }
            }
        int secondCoor = Integer.parseInt(secondInput);
        
        
        boolean wrongInput = true;

        while (wrongInput) {
            
            if ( (firstCoor > 3) || (secondCoor > 3) ) { 
                // for wrong size coordinate
            System.out.println("Coordinates should be from 1 to 3!");
            
            firstInput = scanner.next();
            firstCoor = Integer.parseInt(firstInput);

            secondInput = scanner.next();
            secondCoor = Integer.parseInt(secondInput);
                }
            else if (ticTacToes.charAt( (firstCoor - 1)*3 + (secondCoor - 1)) != ' ') {
                // for existing coordinate
                System.out.println("This cell is occupied! Choose another one!");
                 firstInput = scanner.next();
                firstCoor = Integer.parseInt(firstInput);

                secondInput = scanner.next();
                secondCoor = Integer.parseInt(secondInput);
                }
            else {
                wrongInput = false; // helps to exit the loop
                }
            }

        System.out.println("---------");

        int newXIndex = (firstCoor - 1)*3 + (secondCoor - 1);
        String playerMark;
        if (numPlaysMade % 2 == 0) {
            playerMark = "X";
        }
        else {
            playerMark = "O";
        }
        String newTicTacToes = ticTacToes.substring(0, newXIndex) + playerMark + ticTacToes.substring(newXIndex+1);
        // System.out.println(newTicTacToes);
        
        for (int i = 0; i < newTicTacToes.length(); i++) {

            // pipes
            if ( (i == 0) || (i == 3) || (i == 6)) {
                System.out.print("| ");
            }
            
            System.out.print(newTicTacToes.charAt(i));

            if ( (i == 2) || (i == 5) || (i == 8)) {
                System.out.print(" |");
                System.out.println();
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println("---------");
        
        ticTacToes = newTicTacToes;

        numPlaysMade += 1;
        System.out.println("Plays made " + numPlaysMade);
        
        if (numPlaysMade >= 5) {
            minPlaysMade = true;
            
        } 
         // This effectively stops playing after 9 (but plays including 9)
        if (numPlaysMade == 9) {
            gameIsOngoing = false;
        }
            
        // Below checks - only runs 5+ moves are made
        if (minPlaysMade) {
            // reviewing for output
        
        // // // check for impossible
        // // int xOccur = 0;
        // // int OOccur = 0;
        // // for (int i = 0; i < ticTacToes.length(); i++) {
        // //     if (ticTacToes.charAt(i) == 'X') {
        // //         xOccur += 1;
        // //     }
        // //     if (ticTacToes.charAt(i) == 'O') {
        // //         OOccur += 1;
        // //     }
        // // }

        // // if (Math.abs(xOccur - OOccur) > 1) {
        // //     System.out.println("Impossible");
        // //     return;
        // // }
        boolean xWon = false;
        boolean oWon = false;
        
        // so not impossible then someone won
            if (Character.getNumericValue(ticTacToes.charAt(0)) + Character.getNumericValue(ticTacToes.charAt(1)) + Character.getNumericValue(ticTacToes.charAt(2)) == 99) {
                xWon = true;
            }
            if (Character.getNumericValue(ticTacToes.charAt(3)) + Character.getNumericValue(ticTacToes.charAt(4)) + Character.getNumericValue(ticTacToes.charAt(5)) == 99) {
                xWon = true;
            }
            if (Character.getNumericValue(ticTacToes.charAt(6)) + Character.getNumericValue(ticTacToes.charAt(7)) + Character.getNumericValue(ticTacToes.charAt(8)) == 99) {
                xWon = true;
            }
            if (Character.getNumericValue(ticTacToes.charAt(0)) + Character.getNumericValue(ticTacToes.charAt(3)) + Character.getNumericValue(ticTacToes.charAt(6)) == 99) {
                xWon = true;
            }
            if (Character.getNumericValue(ticTacToes.charAt(1)) + Character.getNumericValue(ticTacToes.charAt(4)) + Character.getNumericValue(ticTacToes.charAt(7)) == 99) {
                xWon = true;
            }
            if (Character.getNumericValue(ticTacToes.charAt(2)) + Character.getNumericValue(ticTacToes.charAt(5)) + Character.getNumericValue(ticTacToes.charAt(8)) == 99) {
                xWon = true;
            }
            if (Character.getNumericValue(ticTacToes.charAt(0)) + Character.getNumericValue(ticTacToes.charAt(4)) + Character.getNumericValue(ticTacToes.charAt(8)) == 99) {
                xWon = true;
            }
            if (Character.getNumericValue(ticTacToes.charAt(2)) + Character.getNumericValue(ticTacToes.charAt(4)) + Character.getNumericValue(ticTacToes.charAt(6)) == 99) {
                xWon = true;
            }

            if (Character.getNumericValue(ticTacToes.charAt(0)) + Character.getNumericValue(ticTacToes.charAt(1)) + Character.getNumericValue(ticTacToes.charAt(2)) == 72) {
                oWon = true;
            }
            if (Character.getNumericValue(ticTacToes.charAt(3)) + Character.getNumericValue(ticTacToes.charAt(4)) + Character.getNumericValue(ticTacToes.charAt(5)) == 72) {
                oWon = true;
            }
            if (Character.getNumericValue(ticTacToes.charAt(6)) + Character.getNumericValue(ticTacToes.charAt(7)) + Character.getNumericValue(ticTacToes.charAt(8)) == 72) {
                oWon = true;
            }
            if (Character.getNumericValue(ticTacToes.charAt(0)) + Character.getNumericValue(ticTacToes.charAt(3)) + Character.getNumericValue(ticTacToes.charAt(6)) == 72) {
                oWon = true;
            }
            if (Character.getNumericValue(ticTacToes.charAt(1)) + Character.getNumericValue(ticTacToes.charAt(4)) + Character.getNumericValue(ticTacToes.charAt(7)) == 72) {
                oWon = true;
            }
            if (Character.getNumericValue(ticTacToes.charAt(2)) + Character.getNumericValue(ticTacToes.charAt(5)) + Character.getNumericValue(ticTacToes.charAt(8)) == 72) {
                oWon = true;
            }
            if (Character.getNumericValue(ticTacToes.charAt(0)) + Character.getNumericValue(ticTacToes.charAt(4)) + Character.getNumericValue(ticTacToes.charAt(8)) == 72) {
                oWon = true;
            }
            if (Character.getNumericValue(ticTacToes.charAt(2)) + Character.getNumericValue(ticTacToes.charAt(4)) + Character.getNumericValue(ticTacToes.charAt(6)) == 72) {
                oWon = true;
            }
                                          
        // // // Cannot have both winners
        // // if (xWon && oWon) {
        // //     System.out.println("Impossible");
        // //     return; 
        // // }

        if (xWon) {
            System.out.println("X wins");
            return;
        }
                                                                                                     

        if (oWon) {
            System.out.println("O wins");
            return;
        }
        

        // assuming there is no winnner but there is ' ', then the game is not finished
        // for (int i = 0; i < ticTacToes.length(); i++) {
        //     if (ticTacToes.charAt(i) == ' ' ) {
        //         System.out.println("Game not finished");
        //         return;
        //     }
        // }

        // System.out.println("OK, just keep going"); // debugging only
        if (gameIsOngoing == false) {
            System.out.println("Draw");
        }
        }
            
        
        }
        
        }
    }

