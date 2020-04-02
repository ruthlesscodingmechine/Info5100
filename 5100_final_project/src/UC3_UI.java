import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UC3_UI implements ActionListener {

    private static JFrame list;
    private static String[] make = {"Audi","BMW", "Lexus", "BYD", "GMC", "Porsche", "Toyota"};


//    private static Map<String, ArrayList<String>> make = new HashMap<>();




    public static void main(String[] args) {


        JFrame jframe = new JFrame("Dealer D5");
        list = new JFrame("List of Vehicles for Dealer D5");
        jframe.setSize(500,500);
        list.setSize(400,400);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        p1.setLayout(null);
        p2.setLayout(null);

        JLabel Make = new JLabel("Make");
        Make.setBounds(10, 20, 80, 25);
        p1.add(Make);

        JComboBox Make_Text = new JComboBox();
        Make_Text.setBounds(100, 20, 165, 25);
        p1.add(Make_Text);
        for (int i = 0; i < make.length; i++) {
            Make_Text.addItem(make[i]);
        }


        JLabel Model = new JLabel("Model");
        Model.setBounds(10, 50, 80, 25);
        p1.add(Model);

        JComboBox Model_Text = new JComboBox();
        Model_Text.setBounds(100, 50, 165, 25);
        p1.add(Model_Text);


        JLabel Year = new JLabel("Year");
        Year.setBounds(10, 80, 80, 25);
        p1.add(Year);

        JTextField Year_Text = new JTextField(20);
        Year_Text.setBounds(100, 80, 165, 25);
        p1.add(Year_Text);

        JLabel Price = new JLabel("Price");
        Price.setBounds(10, 110, 80, 25);
        p1.add(Price);

        JTextField Price_Text = new JTextField(20);
        Price_Text.setBounds(100, 110, 165, 25);
        p1.add(Price_Text);

        JButton Search_Vehicles = new JButton("Search Vehicles");
        Search_Vehicles.setBounds(20, 140, 180, 40);
        p1.add(Search_Vehicles);
        Search_Vehicles.addActionListener(new UC3_UI());

        JButton View_Vehicle = new JButton("View Vehicle Details");
        View_Vehicle.setBounds(100, 300, 180, 40);
        p2.add(View_Vehicle);

        JRadioButton j1 = new JRadioButton();
        j1.setBounds(100, 20, 40, 40);
        p2.add(j1);
        JLabel l1 = new JLabel("Vehicle #1");
        l1.setBounds(130, 20, 180, 40);
        p2.add(l1);

        JRadioButton j2 = new JRadioButton();
        j2.setBounds(100, 70, 40, 40);
        p2.add(j2);
        JLabel l2 = new JLabel("Vehicle #2");
        l2.setBounds(130, 70, 180, 40);
        p2.add(l2);
        JRadioButton j3 = new JRadioButton();
        j3.setBounds(100, 120, 40, 40);
        p2.add(j3);
        JLabel l3 = new JLabel("Vehicle #3");
        l3.setBounds(130, 120, 180, 40);
        p2.add(l3);
        JRadioButton j4 = new JRadioButton();
        j4.setBounds(100, 170, 40, 40);
        p2.add(j4);
        JLabel l4 = new JLabel("Vehicle #4");
        l4.setBounds(130, 170, 180, 40);
        p2.add(l4);
        JRadioButton j5 = new JRadioButton();
        j5.setBounds(100, 220, 40, 40);
        p2.add(j5);
        JLabel l5 = new JLabel("Vehicle #5");
        l5.setBounds(130, 220, 180, 40);
        p2.add(l5);


        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(j1);
        bg1.add(j2);
        bg1.add(j3);
        bg1.add(j4);
        bg1.add(j5);


        jframe.add(p1);
        list.add(p2);
        jframe.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        list.setVisible(true);
    }
}
