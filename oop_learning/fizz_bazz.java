package oop_learning;

public class fizz_bazz {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println(i+"is fizzbuzz,");
            }
            else if (i%3==0 ) {
                System.out.println(i+"is fizz,");
            }
            else if (i%5==0) {
                System.out.println(i+"is buzz,");
            }
            else {
                System.out.println(i+"");
            }
        }
        int j=1;
        while (j<15){
            if (j%2==0) {
                System.out.println(j+"is even number");
            }
            j++;
        }
        Number(35);
    }
    static void Number(int a) {
        // Generate a matching key: "fizz", "buzz", "fizzbuzz", or ""
        String key = (a % 3 == 0 ? "fizz" : "") + (a % 5 == 0 ? "buzz" : "");

        switch (key) {
            case "fizzbuzz" -> System.out.println("fizz_buzz");
            case "fizz"     -> System.out.println("fizz");
            case "buzz"     -> System.out.println("buzz");
            default         -> System.out.println("");
        }
    }
}
