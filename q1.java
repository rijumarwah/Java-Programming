// WAP to accept a string as a command line argument and print a welcome message as given below (Welcome, Your Name)

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {

        System.out.println("Enter name: ");
        
        Scanner reader = new Scanner(System.in);
        
        String name = reader.nextLine();

        System.out.println("Welcome, " + name);
    }
    
}
