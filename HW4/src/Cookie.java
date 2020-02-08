
public class Cookie extends DessertItem {
    public int number;
    public double pricePerDozen;
    public Cookie(String n, int number, double pricePerDozen){
        super(n);
        this.number = number;
        this.pricePerDozen = pricePerDozen;
    }

    @Override
    public double getCost() {
        int cost = (int)Math.round(this.number * this.pricePerDozen / 12);
        return cost;
    }
    public String toString(){
        String s = Double.toString(this.number) + ' ' + "@" + ' ' + DessertShoppe.cents2DollarsAndCents(this.pricePerDozen) + ' ' + "/dz." + "\n";
        String s1 = this.getName();
        for (int i = s1.length(); i < DessertShoppe.maximumSizeofItemName; i++) {
            s1 += " ";
        }
        s += s1;
        s += DessertShoppe.cents2DollarsAndCents(this.getCost()) + "\n";
        return s;
    }
}
