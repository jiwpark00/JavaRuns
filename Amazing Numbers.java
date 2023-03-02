package numbers;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int inputNum = scanner.nextInt();
        if (inputNum < 1) {
            System.out.println("This number is not natural!");
            return;
        }
        else {
            if (inputNum % 2 == 0) {
                System.out.println("This number is Even.");
            }
            else {
                System.out.println("This number is Odd.");
            }
        }

        boolean divisibleBy7 = false;
        boolean endsIn7 = false;
        boolean isBuzzNum = false;

        if (inputNum % 7 == 0) {
            isBuzzNum = true;
            divisibleBy7 = true;
        }

        if (inputNum % 10 == 7) {
            isBuzzNum = true;
            endsIn7 = true;
        }

        if (isBuzzNum) {
            System.out.println("It is a Buzz number.");
        }

        else {
            System.out.println("It is not a Buzz number.");
        }

        System.out.println("Explanation:");

        if (divisibleBy7) {
            if (endsIn7) {
                System.out.printf("%d is divisible by 7 and ends with 7.", inputNum);
            }
            else {
                System.out.printf("%d is divisible by 7.", inputNum);
            }
        }

        else {
            if (endsIn7) {
                System.out.printf("%d ends with 7.", inputNum);
            }
            else {
                System.out.printf("%d is neither divisible by 7 nor does it end with 7.", inputNum);
            }
        }
    }
}
