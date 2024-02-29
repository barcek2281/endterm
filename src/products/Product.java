package products;

public abstract class Product {
    private String name;
    private Integer cost;

    public Product(String name, Integer cost){
        this.name = name;
        this.cost = cost;
    }

    public void setName(String new_name){
        this.name = new_name;
    }

    public String getName(){
        return this.name;
    }

    public void setCost(Integer new_cost){
        this.cost = new_cost;
    }

    public Integer getCost(){
        return this.cost;
    }

    @Override
    public String toString(){
        return name;
    }

}
