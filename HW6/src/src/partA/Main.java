package src.partA;

public class Main {
    public static void main(String[] args) {
        Mreview m1 = new Mreview("奥特曼大战葫芦娃");
        m1.addRating(5);
        m1.addRating(6);
        m1.addRating(7);
        System.out.println(m1);
        System.out.println(m1.aveRating());
    }
}
