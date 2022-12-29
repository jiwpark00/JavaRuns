package tictactoe;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in); 
        String ticTacToes = scanner.next();

        System.out.println("---------");
        
        for (int i = 0; i < ticTacToes.length(); i++) {

            // pipes
            if ( (i == 0) || (i == 3) || (i == 6)) {
                System.out.print("| ");
            }
            
            System.out.print(ticTacToes.charAt(i));

            if ( (i == 2) || (i == 5) || (i == 8)) {
                System.out.print(" |");
                System.out.println();
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println("---------");

        // reviewing for output

        // check for impossible
        int xOccur = 0;
        int OOccur = 0;
        for (int i = 0; i < ticTacToes.length(); i++) {
            if (ticTacToes.charAt(i) == 'X') {
                xOccur += 1;
            }
            if (ticTacToes.charAt(i) == 'O') {
                OOccur += 1;
            }
        }

        if (Math.abs(xOccur - OOccur) > 1) {
            System.out.println("Impossible");
            return;
        }

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

        // Cannot have both winners
        if (xWon && oWon) {
            System.out.println("Impossible");
            return; 
        }

        if (xWon) {
            System.out.println("X wins");
            return;
        }

        if (oWon) {
            System.out.println("O wins");
            return;
        }

        // assuming there is no winnner but there is '_', then the game is not finished
        for (int i = 0; i < ticTacToes.length(); i++) {
            if (ticTacToes.charAt(i) == '_' ) {
                System.out.println("Game not finished");
                return;
            }
        }
        System.out.println("Draw");
    }
}