package review2;

public class IfElseIf {
    public static void main(String[] args) {

        int homework=22;
        if(homework>25){
            System.out.println("great job");
        }else if(homework>20){
            System.out.println("good job");
        }else if(homework>10){
            System.out.println("ok job");
        }else if(homework>5){
            System.out.println("not a good job");
        }

        String browser="opera";

        if(browser.equals("chrome")){
            System.out.println("Test case excuted on chrome browser");
        } else if(browser.equals("safari")){
            System.out.println("Test cases excuted on safari browser");
        }else if(browser.equals("firefox")){
            System.out.println("Test cases excuted on firefox bowser");
        }else{
            System.out.println("Browser is not supported");
        }
    }
}
