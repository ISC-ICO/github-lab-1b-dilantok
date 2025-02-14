import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static String code;
    private static int codeLength;
    private static int getRandInt() {
        return (int) (Math.random() * 10);
    }

    /**
     * Complete the checkCode method to check the guess against the code
     * Print out the apppropriate messages
     * return true if the guess is correct
     * @param guess
     * @return
     */
    public static boolean checkCode(String guess) {
        int correctChar = 0;
        for (int i = 0; i < code.length(); i++) {
            char check = code.charAt(i);
            for (int i1 = 0; i < code.length(); i++) {
                if (check == guess.charAt(i)) {
                    correctChar += 1;
                }
            }
        }

        int correctRightOrder = 0;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == guess.charAt(i)) {
                correctRightOrder += 1;
            }
        }




        return true;
    }
 
    public static void main(String[] args) {
        System.out.println("Code cracker game");
        code = "";    
        //Write the code to set the length of the code here
        //I did a scanner to determine to code length and ask user to print it
        Scanner scanner = new Scanner(System.in);
        System.out.println("How long code length should be?");
        codeLength = scanner.nextInt();
        for (int i = 0; i < codeLength; i++) {
            code += getRandInt();
        }
        System.out.println(code);


        //Write the code to set up the candon code to crack here

    
        //Write code for main loop here

        while (true) {

            System.out.println(String.format("Code length is %d. Enter your guess: ", codeLength));
            String guess = "";
            do{
                guess = scanner.nextLine();
            } while (guess == null || guess.isEmpty());    
            
            System.out.println("Your guess: " + guess);
            if (guess.length() != codeLength) {
                System.out.println(String.format("Invalid guess length %d. Try again.", guess.length()));
            } else {
                if (checkCode(guess)) {
                    System.out.println("Congratulations, your guess is correct.!");
                    break;
                }

            }
            }

        }

                }







