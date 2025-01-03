import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("A random number between 1 and 100 has been generated.");

        int guess = 0;
        int attempts = 0;

        //Start Time
        long startTime = System.currentTimeMillis();

        while (guess!=randomNumber) {
            System.out.println("Enter your Guessed Number: ");
            guess = sc.nextInt();
            attempts++;


            if (guess > randomNumber){
                System.out.println("You Guess Greater Number. Try again!");
            }else if (guess < randomNumber) {
                System.out.println("You Guess Lower Number. Try Again!");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");

                System.out.println("You Won the game in " + attempts + "attempts.");

                // End Time
                long endTime = System.currentTimeMillis();
                long duration = (endTime - startTime) / 1000; //Duration in Second

                System.out.println("You took " + duration + " seconds the guess the number.");

            
            }
            }
      

            }
    

    }

