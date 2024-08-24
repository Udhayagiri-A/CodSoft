import java.util.*;
public class NumberGame {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the number game!!");
        System.out.println("This game is to find the randomly generated number,you need to find the correct number within 10 chances. ");
        System.out.println("Enter the number between 1 to 100 to find the correct number");
        String playAgain;
        do {
            int random = rd.nextInt(100);
            System.out.println("Let's start the game..");
            int flag = 0;
            for (int i = 10; i > 0; i--) {
                System.out.print("Enter your guess:");
                int guess = sc.nextInt();
                if (guess >= 1 && guess <= 100) {
                    if (guess == random) {
                        flag = 1;
                        break;
                    } else if (guess < random) {
                        System.out.println("You are too low...");
                        System.out.println(i - 1 + " " + "chances are left.");
                    } else {
                        System.out.println("You are too high");
                        System.out.println(i - 1 + " " + "chances are left.");
                    }
                }
                else {
                    System.out.println("Please guess the number between 1 to 100.");
                }
            }
            if (flag == 1) {
                System.out.println("Congratulation...You did it....");
                System.out.println("The answer is "+random);
            } else {
                System.out.println("Out of chances");
                System.out.println("Correct number is "+random);
                System.out.println("Better luck next time.");
            }
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next();
        }while(playAgain.equalsIgnoreCase("yes"));
        System.out.println("Thank you for playing! Goodbye.");
    }
}

