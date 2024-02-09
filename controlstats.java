import java.util.Scanner;

public class controlstats {
    
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int x = 10;
        int y = 5;

        if (x>y) {
            System.out.println("x greater than y.");
        }

        else if (x==y) {
            System.out.println("x equals y.");
        }

        else {
            System.out.println("y is greater than x.");
        }

    }

    

}
