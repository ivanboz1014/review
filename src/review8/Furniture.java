package review8;

public class Furniture {

    public void assemble(){
        System.out.println("Furniture need to be assembled");
    }

    public void comfort(){
        System.out.println("Furniture needs to be comfortable");
    }
}

class Chair extends Furniture{


    public void comfort(){
        System.out.println("Nor every chair is comfortable");
    }
    protected void loveSeat(){
        System.out.println("This is the best chair");
    }
}

class Table extends Furniture{

    @Override
    public void assemble() {
        System.out.println("Table need to be assembled");
    }

    @Override
    public void comfort() {
        System.out.println("Table cannot be comfortable");
    }
    protected void buildTable(){
        System.out.println("Table needs to be build");
    }
    void buildTable(String material){
        System.out.println("We build table from "+material);
    }

}
