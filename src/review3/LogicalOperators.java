package review3;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean loginButtonDisplayed=true;
        boolean loginButtonClickable=true;

        if(loginButtonDisplayed && loginButtonClickable){
            System.out.println("Test case is passed");
        }else{
            System.out.println("Test case failed");
        }


        System.out.println("------------------------------");


        boolean dashboard=true;
        String message="Welcome admin";

        if(dashboard || message.equals("Welcome admin")){
            System.out.println("User is logged in");
        }else{
            System.out.println("User is not logged in");
        }

        System.out.println("-----------------------------------------");

        boolean b=true;

        System.out.println(!true);
        boolean agreeCheckboxSelected=false;


        if(!agreeCheckboxSelected){

            System.out.println("I am clicking on checkbox");
        }else{
            System.out.println("I am clicking on submit button");


            boolean boo=!false;
            System.out.println(boo);



    }


    }
}
