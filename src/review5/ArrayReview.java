package review5;

public class ArrayReview {
    public static void main(String[] args) {

        int a=10;

        int[] arr=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;

        System.out.println(arr[2]);

        System.out.println("Size of the array="+arr.length);

       /* for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);*/
            for (int j =arr.length-1; j>=0 ; j--) {
                System.out.println(arr[j]);

            }



        }
         }

        /*String[] colors={"black", "white", "red", "purple", "blue"};

        for(String color:colors){
            System.out.println(color);*/



        /*for (int i = 0; i < colors.length ; i++) {
            System.out.println(colors[i]);*/






