package Views;

import Controllers.RiderController;
import Models.Rider;
import Utilities.InvalidBMIException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RiderView extends  JFrame{
    private JLabel lblName;
    private JLabel lblCountry;
    private JLabel lblWeight;
    private JTextField txtName;
    private JTextField txtCountry;
    private JTextField txtWeight;
    private JLabel lblHeight;
    private JTextField txtHeight;
    private JLabel lblOlympic;
    private JLabel lblTopSpeed;
    private JLabel txtNational;
    private JTextField txtMedals;
    private JTextField txtTopSpeed;
    private JTextField txtNationalRecords;
    private JButton btnAddRider;
    private JButton btnCalculateBMI;
    private JLabel lblSearch;
    private JTextField txtSearch;
    private JButton btnSearch;
    public JPanel backPanel;
    private JLabel lblAge;
    private JTextField txtAge;
    RiderController riderC;
    Rider[] riderArray;
    ArrayList<Rider.Record> recordList;
    int recordCount; int riderCount;
    public RiderView() {
        riderC=new RiderController();
        riderArray=new Rider[100];
        riderCount=0;recordCount=0;
        recordList=new ArrayList<>();
        btnAddRider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = txtName.getText();
                    String country = txtCountry.getText();
                    double weight = Double.parseDouble(txtWeight.getText());
                    double height = Double.parseDouble(txtHeight.getText());
                    if(weight<=0 || height<=0)
                    {
                        throw new InvalidBMIException();
                    }
                    int age = Integer.parseInt(txtAge.getText());
                    Rider riderOB = riderC.addRider(name, country, age, weight, height);
                    if(riderC.addRiderToDatabase())
                    {
                        JOptionPane.showMessageDialog(backPanel, "Successfully Added a Rider to Database", "Sucess", 0);
                    }else {
                        JOptionPane.showMessageDialog(backPanel, "Cannot insert a Rider to DB", "Error", 0);
                    }
                    riderArray[riderCount] = riderOB;
                    riderCount++;
                    int national = Integer.parseInt(txtNationalRecords.getText());
                    int olympic = Integer.parseInt(txtMedals.getText());
                    double topSpeed = Double.parseDouble(txtTopSpeed.getText());
                    Rider.Record recordOB = riderC.addRecord(olympic, national, topSpeed);
                    recordList.add(recordOB);
                    recordCount++;
                    JOptionPane.showMessageDialog(backPanel, "Added Rider " + riderCount, "Success", 0);
                }catch (NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(backPanel, "Please Provide Correct Inputs", "Error", 0);
                }catch (InvalidBMIException ex)
                {
                    JOptionPane.showMessageDialog(backPanel, ex.getMessage(), "Error", 0);
                }
            }
        });
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String searchText = txtSearch.getText();
                    Rider found = riderC.searchRider(riderArray, searchText);
                    if (found != null) {
                        JOptionPane.showMessageDialog(backPanel, found, "Info", 1);
                    } else {
                        JOptionPane.showMessageDialog(backPanel, "Rider Not Found", "Error", 1);
                    }
                }catch (NullPointerException ex)
                {
                    JOptionPane.showMessageDialog(backPanel, "Please Provide Valid Text to Search", "Error", 0);
                }
            }
        });
        btnCalculateBMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JOptionPane.showMessageDialog(backPanel, riderArray[riderCount - 1].calBMI(), "Info", 1);
                }catch (ArrayIndexOutOfBoundsException ex)
                {
                    JOptionPane.showMessageDialog(backPanel, "Invalid Array Index", "Error", 0);
                }
            }
        });
    }

    public static void main(String[] args) {
        RiderView ui=new RiderView();
        ui.setContentPane(ui.backPanel);
        ui.setTitle("Rider Manager 1.0");
        ui.setSize(600,600);
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui.setVisible(true);
    }

}
