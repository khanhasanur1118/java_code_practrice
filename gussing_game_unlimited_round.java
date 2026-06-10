import java.util.*;
public class gussing_game_unlimited_round {

    public static void gNUMBER_Game(){
        Scanner sc = new Scanner(System.in);
        int number = 1+(int)(Math.random()*100);
        int attempts = 0;
        int k=5;
        boolean gc = false;
        System.out.println("a number chosen between 1 to 100:");
        System.out.println("You have"+k+"attempts per round to guess the number.");
        int guess = 0;
        while(!gc){
            for(int i=1;i<=k;i++){
                System.out.println("enter your guess");
                guess=sc.nextInt();
                attempts++;

                if(guess==number){
                    gc=true;
                    System.out.println(" congratualation you have guessed correctly! in"+attempts+"attempts");
                    break;

                }
                else if(guess<number){
                    System.out.println("this number is grater than"+guess);
                }
                else{
                    System.out.println("this number is less than"+guess);
                }
            }
            if (!gc) {

                System.out.println("You have used all " + k+ " attempts. ");
                System.out.print("Do you want to continue guessing? (yes/no): ");
                String response = sc.next();
                if (!response.equalsIgnoreCase("yes")) {
                    System.out.println("Game Over! The correct number was: " + number);
                    break;
                }
            }
        }
        sc.close();

    }


    public static void main(String[] args) {
        gNUMBER_Game();
    }
}
