import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.ButtonGroup;
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
//import com.sun.deploy.panel.JavaPanel;

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.ItemEvent;
//import java.awt.event.ItemListener;
//import java.util.ArrayList;
////import java.util.List;
//
//class CheckVehicles extends JFrame {
//    ArrayList<JLabel> lblList;
//    JLabel lbl_headline, lbl_make, lbl_module, lbl_year, lbl_price;
//
//    ArrayList<JTextField> txtList;
//    JTextField txt_year, txt_price;
//
//    ArrayList<JComboBox<String>> cbbList;
//    JComboBox cbb_make, cbb_module;
//
//    JPanel jp;
//    JLabel lbl_jp_hl;
//    JList list_jp_vList;
//    JButton btn_jp_viewDetail;
//
//    private String dealerName = "default dealer";
//
//    final static int yInternal = 100;
//    final static int xInterval = 100;
//
//    public CheckVehicles() {
//        InitialComponents();
//        AddComponents();
//
//        setVisible(true);
//    }
//
//    private void AddComponents() {
//        for (JLabel jLabel : lblList) {
//            getContentPane().add(jLabel);
//        }
//
//        for (JComboBox<String> jComboBox : cbbList) {
//            getContentPane().add(jComboBox);
//        }
//
//        for (JTextField jTextField : txtList) {
//            getContentPane().add(jTextField);
//        }
//        getContentPane().add(jp);
//
//    }
//
//    private void InitialComponents() {
//        InitFrame();
//        InitPanel();
//        InitLabels();
//        InitTextFields();
//        InitComboBox();
//    }
//
//    private void InitPanel() {
//        jp = new JPanel();
//        jp.setBounds(350, 100, 400, 400);
//        jp.setBorder(BorderFactory.createLineBorder(Color.black));
//        jp.setBackground(Color.lightGray);
//        jp.setLayout(null);
//        InitPanelComponent();
//
//    }
//
//    private void InitPanelComponent() {
//        lbl_jp_hl = new JLabel("List of Vehicles of Dealer " + dealerName);
//        lbl_jp_hl.setBounds(80,0,300,30);
//        jp.add(lbl_jp_hl);
//
//        JList list_jp_vList = new JList<>();
//        // list_jp_vList.setBounds(110, 50, 170, 200);
//        list_jp_vList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//
//        DefaultListModel<Vehicle> lm = new DefaultListModel();
//        // For Testing
//        Vehicle[] vgroup = Vehicle.createTestVehicles();
//        for (Vehicle vehicle : vgroup) {
//            lm.addElement(vehicle);
//        }
//        list_jp_vList.setModel(lm);
//        JScrollPane js = new JScrollPane(list_jp_vList);
//        js.setBounds(100,50,240,200);
//        jp.add(js);
//
//
//
//        btn_jp_viewDetail = new JButton("View Detail");
//        btn_jp_viewDetail.setBounds(130,320, 130, 30);
//        jp.add(btn_jp_viewDetail);
//        btn_jp_viewDetail.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int index = list_jp_vList.getSelectedIndex();
//                if (index >= 0) {
//                    int myVin = lm.getElementAt(index).VIN;
//                    System.out.println("index : " + index + " value : " +list_jp_vList.getSelectedValue() + " Vin :" + myVin);
//                } else {
//                    System.out.println("Please Select a Vehicle");
//                }
//
//            }
//        });
//
//    }
//
//
//    private void InitComboBox() {
//        cbbList = new ArrayList<>();
//
//        cbb_make = new JComboBox();
//        cbb_make.setBounds(lbl_make.getX() + xInterval, lbl_make.getY(), 100, 20);
//        cbbList.add(cbb_make);
//
//
//
//        cbb_module = new JComboBox();
//        cbb_module.setBounds(cbb_make.getX(), lbl_module.getY(), 100, 20);
//        cbbList.add(cbb_module);
//
//
//        // For Testing
//        cbb_make.setModel(new DefaultComboBoxModel(Vehicle.createMake()));
//        cbb_module.setModel(new DefaultComboBoxModel(Vehicle.createModel(cbb_make.getSelectedItem().toString())));
//
//        cbb_make.addItemListener(new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                if (e.getStateChange() == ItemEvent.SELECTED) {
//                    System.out.println("User Select (triggered by Selected)" + cbb_make.getSelectedItem());
//                }
//                cbb_module.setModel(new DefaultComboBoxModel(Vehicle.createModel(cbb_make.getSelectedItem().toString())));
//            }
//        });
//    }
//
//    private void InitTextFields() {
//        txtList = new ArrayList<>();
//
//        txt_year = new JTextField();
//        txt_year.setBounds(lbl_year.getX() + xInterval, lbl_year.getY(), 100, 20);
//        txtList.add(txt_year);
//
//        txt_price = new JTextField();
//        txt_price.setBounds(txt_year.getX(), lbl_price.getY(), 100, 20);
//        txtList.add(txt_price);
//    }
//
//    private void InitLabels() {
//        lblList = new ArrayList<>();
//
//        lbl_headline = new JLabel("Dealer " + dealerName);
//        lbl_headline.setFont(new Font("B", Font.BOLD, 20));
//        lbl_headline.setBounds(300, 30, 300, 20);
//        lblList.add(lbl_headline);
//
//        lbl_make = new JLabel("Make", JLabel.RIGHT);
//        lbl_make.setFont(new Font("Arial", Font.PLAIN, 14));
//        lbl_make.setBounds(100, 100, 50,20);
//        lblList.add(lbl_make);
//
//        lbl_module = new JLabel("Module", 4);
//        lbl_module.setFont(new Font("Arial", Font.PLAIN, 14));
//        lbl_module.setBounds(100, lbl_make.getY() + yInternal, 50,20);
//        lblList.add(lbl_module);
//
//        lbl_year = new JLabel("Year", 4);
//        lbl_year.setFont(new Font("Arial", Font.PLAIN, 14));
//        lbl_year.setBounds(100, lbl_module.getY() + yInternal, 50,20);
//        lblList.add(lbl_year);
//
//        lbl_price = new JLabel("Price", JLabel.RIGHT);
//        lbl_price.setFont(new Font("Arial", Font.PLAIN, 14));
//        lbl_price.setBounds(100, lbl_year.getY() + yInternal, 50,20);
//        lblList.add(lbl_price);
//    }
//
//    private void InitFrame() {
//        setBounds(00, 00, 800, 650);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);
//        setResizable(true);
//        setTitle("5100 Final Project UserCase 2");
//
//        getContentPane().setLayout(null);
//
//    }
//
//    public static void main(String[] args) {
//        new CheckVehicles();
//    }
//        }