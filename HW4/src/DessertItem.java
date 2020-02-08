
public abstract class DessertItem {
    protected java.lang.String name;
    public DessertItem(){
    }
    public DessertItem(String name){
        this.name = name;
    }
    public final java.lang.String getName(){
        return this.name;
    }
    public abstract double getCost();
}
