public class Candy extends DessertItem{
     double pound;
     double pricePerPound;
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
//        String s3 = this.pound + " ";
        String s2 = this.pound + " " + "lbs." + " " + '@' + DessertShoppe.cents2DollarsAndCents(this.pricePerPound) + ' ' + "/lb." + "\n";
        String s1 = this.getName();
        for (int i = s1.length(); i < DessertShoppe.maximumSizeofItemName; i++) {
            s1 += " ";
        }
        s2 += s1;
        s2 += DessertShoppe.cents2DollarsAndCents(this.getCost()) + "\n";
        return s2;
    }
}