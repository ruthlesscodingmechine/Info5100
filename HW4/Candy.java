public class Candy extends DessertItem{
    public double pound;
    public double pricePerPound;
    public Candy(String n, double pound, double price){
        super(n);
        this.pound = pound;
        this.pricePerPound = price;
    }

    @Override
    public double getCost() {
        double cost = Math.round(this.pound * this.pricePerPound);
        return cost;
    }
    public String toString(){
        String s = Double.toString(this.pound) + ' ' + "lbs." + ' ' + '@' + DessertShoppe.cents2DollarsAndCents(this.pricePerPound) + ' ' + "/lb." + "\n";
        String s1 = this.getName();
        for (int i = s1.length(); i < DessertShoppe.maximumSizeofItemName; i++) {
            s1 += " ";
        }
        s += s1;
        s += DessertShoppe.cents2DollarsAndCents(this.getCost()) + "\n";
        return s;
    }
}