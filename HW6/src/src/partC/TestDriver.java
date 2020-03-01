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
        c1.setBoardStart(11, 19, 2017);
        c1.setBoardEnd(6, 27, 2018);
        d1.setBoardStart(11, 19, 2015);
        d1.setBoardEnd(1, 27, 2018);
        boolean d1board = d1.boarding(1, 21, 2017);
        boolean c1board = c1.boarding(11, 18, 2017);
        System.out.println(c1board);
        System.out.println(d1board);
    }
}
