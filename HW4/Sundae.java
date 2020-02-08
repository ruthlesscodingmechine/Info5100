

public class Sundae extends IceCream {
    String topping;
    int toppingPrice;
    public Sundae(String n, int price, String tn, int tPrice){
        super(n,price);
        this.topping = tn;
        this.toppingPrice = tPrice;
    }
    public double getCost(){
        int cost = Math.round(this.price + this.toppingPrice);
        return cost;
    }
    public String toString(){
        String s = this.topping + " with" + "\n";
        String s1 = this.getName();
        for(int i = s1.length(); i < DessertShoppe.maximumSizeofItemName; i++) {
            s1 += " ";
        }
        s += s1;
        s += DessertShoppe.cents2DollarsAndCents(this.getCost()) + "\n";
        return s;
    }
}
