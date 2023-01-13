package review2;

public class IfElseStatement {
    public static void main(String[] args) {

        int num=12;

        if(num>100){
            System.out.println(num+" is greater than a 100");
        }else{
            System.out.println(num+" is less than a 100");

        }

        String expectedButton=("Enroll Today");

        if(expectedButton.equals("Enroll today")){
            System.out.println("Test case pass");

        }else{
            System.out.println("Test case failed");

        }
    }
}
