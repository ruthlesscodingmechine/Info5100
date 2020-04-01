import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UC3_UI implements ActionListener {
    private static JFrame list;

    public static void main(String[] args) {
        JFrame jframe = new JFrame("Dealer D5");
        list = new JFrame("List of Vehicles for Dealer D5");
        jframe.setSize(500,500);
        list.setSize(400,400);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        list.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        p1.setLayout(null);
        p2.setLayout(null);

        JLabel Model = new JLabel("Model");
        Model.setBounds(10, 20, 80, 25);
        p1.add(Model);

        JTextField Model_Text = new JTextField(20);
        Model_Text.setBounds(100, 20, 165, 25);
        p1.add(Model_Text);


        JLabel Make = new JLabel("Make");
        Make.setBounds(10, 50, 80, 25);
        p1.add(Make);

        JTextField Make_Text = new JTextField(20);
        Make_Text.setBounds(100, 50, 165, 25);
        p1.add(Make_Text);

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

        jframe.add(p1);
        list.add(p2);
        jframe.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        list.setVisible(true);
    }
}
