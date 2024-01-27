package Views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashboardView extends JFrame {
    public JLabel lblWelcome;
    private JButton riderUIButton;
    private JButton bicycleUIButton;
    private JButton accountUIButton;
    public JPanel backPanel;

    public DashboardView() {
        riderUIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RiderView ui=new RiderView();
                ui.setContentPane(ui.backPanel);
                ui.setTitle("Rider Manager 1.0");
                ui.setSize(600,600);
                ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ui.setVisible(true);
            }
        });
        accountUIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SavingsAccountView ui=new SavingsAccountView();
                ui.setContentPane(ui.backPanel);
                ui.setTitle("Account Manager 1.0");
                ui.setSize(600,600);
                ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ui.setVisible(true);
            }
        });
        bicycleUIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BicycleView ui=new BicycleView();
                ui.setContentPane(ui.backPanel);
                ui.setTitle("Bicycle Manager 1.0");
                ui.setSize(600,600);
                ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ui.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        DashboardView ui=new DashboardView();
        ui.setContentPane(ui.backPanel);
        ui.setTitle("Dashboard 1.0");
        ui.setSize(600,600);
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui.setVisible(true);
    }
}
