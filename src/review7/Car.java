package review7;

public class Car {

    String make, model;
    int year,horsePower;


    public Car(String make, String model){
        this.make=make;
        this.model=model;

    }

    public Car(String make, String model, int year, int horsePower){
        this(make, model);
        this.year=year;
        this.horsePower=horsePower;
    }
    public void start(){
        System.out.println(make+ "starts");
    }

    public void drive(int speed){
        System.out.println(make+" drives with speed "+speed);
    }
}


