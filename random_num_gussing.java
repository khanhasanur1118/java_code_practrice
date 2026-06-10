import java.util.*;
public class random_num_gussing {

    public static void guessNumber( ){
        System.out.println("game code running...");
        Scanner sc = new Scanner(System.in);
        int number=1+(int)(100*Math.random());
        int attempt=5;
        int guess=0;
        System.out.println("Please enter your number between 1 and 100:..");
        System.out.println("you have"+attempt+"chance to win the game...");
        for(int i=1;i<=attempt;i++){
            System.out.println("Enter your guess:  ");
             guess =sc.nextInt();
            if(guess == number){
                System.out.println("You guessed Correct!");
                sc.close();
                return ;
            } else if (guess <number) {
                System.out.println("You guessed Incorrect!and greater number!"+guess);
            }
            else  {
                System.out.println("You guessed Correct! and smaller number!"+guess);
            }

        }
        System.out.println("you exusted all the attempts and the correct number! : "+number);
        sc.close();

    }
    public static void main(String[] args) {
        guessNumber();
    }
}
