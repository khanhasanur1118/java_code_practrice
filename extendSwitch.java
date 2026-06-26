import java.util.Scanner;
public class extendSwitch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a day:");
        String day = sc.nextLine();

        switch(day){
            case "satarday" -> System.out.println("its a weekend");
            case "sunday" -> System.out.println("its a weekday");
            case "monday" -> System.out.println("its a weekday");
            case "tuesday" -> System.out.println("its a weekday");
            case "wednesday" -> System.out.println("its a weekday");
            case "thursday" -> System.out.println("its a weekday");
            case "friday" -> System.out.println("its a weekend");
            default -> System.out.println(day+" its a not even a day");
        }
        switch(day){
            case "satarday","monday","thursday" -> System.out.println("its tuition time");
            default -> System.out.println(day+" its a weekend");
        }
    }
}
