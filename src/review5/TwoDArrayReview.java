package review5;

public class TwoDArrayReview {
    public static void main(String[] args) {

        int[][]array={{1,2,3},{11,12,13},{20,21,22}};

        int numberOfArrays=array.length;
        System.out.println(numberOfArrays);

        int numberOfElementsInFirstArray=array[0].length;
        System.out.println(numberOfElementsInFirstArray);

        int numberOfElementsIn2Array=array[2].length;
        System.out.println(numberOfElementsIn2Array);

        System.out.println(array[2][1]);

        for(int[]arr:array){
            for(int num:arr){
                System.out.println(num);

            }
            System.out.println();
        }


    }
}
