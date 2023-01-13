package review3;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int i=1;
        while(i<=4){
            System.out.println("Hello");
            i++;

        }

        System.out.println("Are you tired?");
        boolean tired=scan.nextBoolean();

        while(!tired){
            System.out.println("This is great");
            System.out.println("Let's study java");
            System.out.println("Are you tired");

            tired=scan.nextBoolean();


        }


    }
}
