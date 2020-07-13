public class PizzaSimple implements PizzaSimpleInt {
    private String name;
    private double price;
    public PizzaSimple(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }
}
