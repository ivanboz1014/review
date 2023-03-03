package review10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, Double>grocery =new HashMap<>();

        grocery.put("Milk",5.99);
        grocery.put("Eggs",6.99);
        grocery.put("Bread",2.99);
        grocery.put("Tea",4.99);
        grocery.put("Cucumber",2.50);
        grocery.put("Eggs", 7.99);

        double teaPrice=grocery.get("Tea");
        System.out.println(teaPrice);
        System.out.println(grocery);

        int size=grocery.size();
        System.out.println(size);

        Map<String, Double>tmap=new TreeMap<>();
        tmap.putAll(grocery);
        System.out.println(tmap);




    }
}
