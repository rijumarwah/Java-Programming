// Swap the two numbers using a bitwise operator

import java.util.Scanner;

public class q4 {
    
    public static void main(String[] args) {

        System.out.println("Enter both numbers a and b: ");

        Scanner reader = new Scanner(System.in);
        
        int a = reader.nextInt();
        int b = reader.nextInt();

        reader.close();
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: a = " + a + ", b = " + b);


    }
}
