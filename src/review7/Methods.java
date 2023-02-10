package review7;

public class Methods {

    public void hello(){
        System.out.println("Hello");
    }

    public void sayHello(String name){
        System.out.println("Hello "+name);

    }

   public int findLargest(int num1, int num2) {
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }


    }

   public String reverse(String given){
        StringBuilder sb=new StringBuilder(given);
        return sb.reverse().toString();

    }



   public double findAverage(double num1, double num2){
        return (num1+num2)/2;
    }
   public static int minFromArray(int[]array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < i) {
                min = array[i];
            }

        }

        return min;
    }







    public static void main(String[] args) {
         String name="Mohamed";


         int characters=name.length();
        System.out.println(characters);


        Methods obj=new Methods();
        obj.sayHello(name);

        int laregest=obj.findLargest(100,200);
        System.out.println("The largest number is "+laregest);

        System.out.println(obj.findAverage(10,30));

       StringBuilder reverse= new StringBuilder(obj.reverse("Hello"));
        System.out.println(reverse);

        int[]array={10,49,89,60};
        Methods.minFromArray(array);
        int minimum=minFromArray(array);
        System.out.println(minimum);











    }
}
