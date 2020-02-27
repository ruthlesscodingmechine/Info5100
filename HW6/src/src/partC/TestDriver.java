package src.partC;

import javax.swing.*;

public class TestDriver {
    public static void main(String[] args) {
        Cat c1 = new Cat("Tom", "Bob", "black", "short");
        c1.setSex(3);
        System.out.println(c1);
        Dog d1 = new Dog("Spot", "Susan", "white", "medium");
        d1.setSex(3);
        System.out.println(d1);
    }
}
