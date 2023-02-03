package review6;

public class MoreStringMethods {
    public static void main(String[] args) {

        String myString="Today is February 2";
        String[] strArray=myString.split(" ");

        for(String s:strArray){
            System.out.println(s);


        }
        System.out.println(myString);
        String newStr=myString.substring(9);
        System.out.println(newStr);
        newStr=myString.substring(9,17);
        System.out.println(newStr);


    }
}
