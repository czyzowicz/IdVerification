package algorithmsExercises;

import java.util.Scanner;

public class IdVerification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your ID card:");
        String id = input.nextLine();
        id = id.toUpperCase();
        char firstLetter = id.charAt(0);
        char secondLetter = id.charAt(1);
        char thirdLetter = id.charAt(2);
        char firstNumber = id.charAt(3);
        char secondNumber = id.charAt(4);
        char thirdNumber = id.charAt(5);
        char fourthNumber = id.charAt(6);
        char fifthNumber = id.charAt(7);
        char sixthNumber = id.charAt(8);
        char[] lettersID = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int firstLetterValue = 0;
        int secondLetterValue = 0;
        int thirdLetterValue = 0;

        for (int i = 0; i < lettersID.length; i++) {
            if (firstLetter == lettersID[i]) {
                firstLetterValue = 10 + i;
            }
            if (secondLetter == lettersID[i]) {
                secondLetterValue = 10 + i;
            }
            if (thirdLetter == lettersID[i]) {
                thirdLetterValue = 10 + i;
            }
        }
        int result = (firstLetterValue * 7) + (secondLetterValue * 3) + (thirdLetterValue * 1) + (firstNumber * 9) +
                (secondNumber * 7) + (thirdNumber * 3) + (fourthNumber * 1) + (fifthNumber * 7) + (sixthNumber * 3);

        if ((result % 10) == 0) {
            System.out.println("Your ID card is correct");
        } else {
            System.out.println("Your ID card is fake");
        }
    }
}
