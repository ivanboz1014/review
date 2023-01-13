package review2;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        int i=10;

        Scanner keyboard=new Scanner(System.in);

        System.out.println("Please enter your age");
        int age=keyboard.nextInt();

        System.out.println("Are you tired?");
        boolean tired=keyboard.nextBoolean();

        System.out.println("What is your name?");
        String name=keyboard.next();

        System.out.println(age);
        System.out.println(tired);
        System.out.println(name);



    }
}
