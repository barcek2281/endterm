package products;

public class Bread extends Product implements IproductDate{

    public static String type = "bread";
    private Integer date = 2;
    public Bread(String name, Integer cost){
        super(name, cost);
    }

    @Override
    public int printBeforeDate(){
        return date;
    }
}
