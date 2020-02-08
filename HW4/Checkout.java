import java.util.Vector;

public class Checkout {
    Vector<DessertItem> list = new Vector<>();
    public Checkout(){
    }
    public int numberOfItems(){
        return this.list.size();
    }
    public void enterItem(DessertItem item){
        this.list.add(item);
    }
    public void clear(){
        this.list.clear();
    }
    public int totalCost(){
        int sum = 0;
        for(int i = 0; i < this.list.size(); i++){
            sum = sum + (int)this.list.get(i).getCost();
        }
        return sum;
        //returns total cost of items without taxes;
    }
    public int totalTax(){
        int tax = (int) Math.round(this.totalCost() * DessertShoppe.taxRate);
        return tax;
    }
    public String toString(){
        String s = "      " + DessertShoppe.storeName + "\n";
        s += "      " + "--------------------" + "\n";
        s += "\n";
        for(int i = 0; i < this.list.size(); i++){
            s += this.list.get(i).toString();
        }
        String tax = "Tax";
        for (int i = tax.length(); i < DessertShoppe.maximumSizeofItemName; i++) {
            tax += " ";
        }
        tax += DessertShoppe.cents2DollarsAndCents(this.totalTax()) + "\n";
        String totalCost = "Total Cost";
        for (int i = totalCost.length(); i < DessertShoppe.maximumSizeofItemName - 1; i++) {
            totalCost += " ";
        }
        totalCost += DessertShoppe.cents2DollarsAndCents(this.totalCost() + this.totalTax()) + "\n";
        s += tax + totalCost;
        return s;
    }


}
