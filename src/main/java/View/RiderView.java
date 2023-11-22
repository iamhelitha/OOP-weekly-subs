package View;

import Model.Rider;
import controller.RiderController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RiderView extends JFrame{
    private JTextField txtName;
    private JTextField txtCountry;
    private JTextField txtWeight;
    private JTextField txtHeight;
    private JTextField txtMedals;
    private JTextField txtSpeed;
    private JTextField txtRecords;
    private JTextField txtAge;
    private JButton btnAddRider;
    private JButton btnCalBMI;
    private JTextField txtSearch;
    private JButton btnSearch;
    private JPanel backPane;

    Rider rider;
    RiderController Controller;

    Rider.Records riderRecords;

    //Initialize the arrays
    Rider[] riderArray;
    ArrayList<Rider.Records> recordList;
    int riderCount;
    int recordCount;
    public RiderView() {
        Controller = new RiderController();
        riderArray = new Rider[100];
        riderCount=0;
        recordCount=0;
        recordList = new ArrayList<>();

        btnAddRider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=txtName.getText();
                String country=txtCountry.getText();
                int age=Integer.parseInt(txtAge.getText());
                double weight=Double.parseDouble(txtWeight.getText());
                double height=Double.parseDouble(txtHeight.getText());

                Controller=new RiderController();
                rider=Controller.addRider(name, country, age, weight, height);
                riderArray[riderCount]=rider;
                riderCount++;

                int medals=Integer.parseInt(txtMedals.getText());
                double topSpeed=Double.parseDouble(txtSpeed.getText());
                int records=Integer.parseInt(txtRecords.getText());

                riderRecords=Controller.addRecords(rider, medals,topSpeed,records);
                recordList.add(riderRecords);

                JOptionPane.showMessageDialog(rootPane, "ADDED"+ riderRecords.displayRecords(), "SUCCESS", 0);
            }
        });
        btnCalBMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double weight=Double.parseDouble(txtWeight.getText());
                double height=Double.parseDouble(txtHeight.getText());

                double bmi= rider.calBMI(weight, height);
                JOptionPane.showMessageDialog(rootPane, "Rider BMI" + bmi, "INFO",0);
            }
        });

        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchText= txtSearch.getText();

                Rider found = Controller.searchRider(riderArray, searchText);

                if(found != null)
                {
                    JOptionPane.showMessageDialog(rootPane,found,"Information",1);
                }
                else if(found == null){
                    JOptionPane.showMessageDialog(rootPane,riderCount+" Rider is not in the list","Error",2);
                }else {
                    JOptionPane.showMessageDialog(rootPane,"Nothing", "Error",2);
                }
            }
        });
    }

    public static void main(String[] args) {
        RiderView riderView=new RiderView();
        riderView.setContentPane(riderView.backPane);
        riderView.setTitle("Rider Application");
        riderView.setSize(600,600);
        riderView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        riderView.setVisible(true);
    }
}
