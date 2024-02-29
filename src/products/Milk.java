package products;

public class Milk extends Product implements IproductDate {

    public static String type = "milk";

    private Integer date = 14;
    public Milk(String name, Integer cost){
        super(name, cost);
    }

    @Override
    public int printBeforeDate(){
        return date;
    }
}
