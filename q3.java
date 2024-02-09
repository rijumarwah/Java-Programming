// WAP to accept two intergers as input and print their sum

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {

        System.out.println("Enter both numbers: ");

        Scanner reader = new Scanner(System.in);

        int one = reader.nextInt();
        int two = reader.nextInt();

        System.out.println(one + two);

    }
}
