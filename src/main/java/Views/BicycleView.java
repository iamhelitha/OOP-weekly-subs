package Views;

import Models.Bicycle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BicycleView extends JFrame{
    public JPanel backPanel;
    private JLabel lblSpeed;
    private JLabel lblGear;
    private JTextField txtGear;
    private JTextField txtSpeed;
    private JButton btnAddBike;
    private JButton btnApplyBrakes;
    private JButton btnSpeedUp;
    private JLabel lblCurrentSpeed;

    public BicycleView() {
        btnAddBike.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Gear=Integer.parseInt(txtGear.getText());
                double speed=Double.parseDouble(txtSpeed.getText());
                Bicycle b1=new Bicycle(Gear,speed);
                lblCurrentSpeed.setText("Speed "+b1.getSpeed()+" Gear "+b1.getGear());
                
                JOptionPane.showMessageDialog(backPanel,"Bicycle Created Successfully");
            }
        });
    }

    public static void main(String[] args) {
        BicycleView ui=new BicycleView();
        ui.setContentPane(ui.backPanel);
        ui.setTitle("Bicycle Manager 1.0");
        ui.setSize(600,600);
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui.setVisible(true);
    }


}
