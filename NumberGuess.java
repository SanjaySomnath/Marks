import java.util.Random;
import java.util.Scanner;

public class NumberGuess{
    public static void main(String[] args) {
        Random rc=new Random();
        Scanner sc=new Scanner(System.in);

        int target=rc.nextInt(100);
        int guess=0;
        System.out.println("Number Guessing game");
        System.out.println();

        while(guess!=target){
            System.out.println("Enter a number between 1 to 100");
            guess=sc.nextInt();

            if(guess==target){
            System.out.println(" You've guessed the correct one!");
            
            } if (guess>target) {
                System.out.println("Too High ! TRY AGAIN");
                
            } if (guess<target){
                System.out.println("Too Low ! TRY AGAIN");
            }
        }
    }
}
