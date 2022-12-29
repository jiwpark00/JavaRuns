package tictactoe;

import java.util.Scanner;

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
    }
}
