package review8;

public class InsuranceTest {
    public static void main(String[] args) {

       Insurance carPolicy= new CarPolicy("I9987","John Smith",200,22);
carPolicy.getInsurance();
        System.out.println(carPolicy.calculateCoverage());

        Insurance petPolicy=new PetPolicy("P234","Olena",4,300);
        System.out.println(petPolicy.calculateCoverage());
        petPolicy.getInsurance();

    }
}
