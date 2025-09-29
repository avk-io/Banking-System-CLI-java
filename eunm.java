enum Laptop{
    Thinkpad(1800), Macbook(2000), XPS(2200), Surfac(1500);

    private int price;

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }
    public void setPrice()
    {
        // this.price = price;
    }
}


public class eunm {
    public static void main(String[] args) {
        // Laptop lap = Laptop.Mac;
        // System.out.println(lap+": "+lap.getPrice());

        for(Laptop i : Laptop.values())
        {
            System.out.println(i+": "+i.getPrice());
        }
    }
}
 