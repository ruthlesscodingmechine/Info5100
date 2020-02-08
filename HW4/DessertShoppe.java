
public class DessertShoppe {
    public static double taxRate = 0.065;
    public static String storeName = "M & M Dessert Shoppe";
    public static int maximumSizeofItemName = 30;
    public static int widthUsedToDisplayPrice = 3;
    public static String cents2DollarsAndCents(double inputCents){
        return Double.toString(inputCents /= 100.0);
    }
}
