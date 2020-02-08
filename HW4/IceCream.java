

public class IceCream extends DessertItem {
    int price;
    public IceCream(String n, int p){
        super(n);
        this.price = p;
    }
    @Override
    public double getCost() {
        return this.price;
    }
    public String toString(){
        String s = this.getName();
        for (int i = s.length(); i < DessertShoppe.maximumSizeofItemName; i++) {
            s += " ";
        }
        s += DessertShoppe.cents2DollarsAndCents(this.getCost()) + "\n";
        return s;
    }
}
