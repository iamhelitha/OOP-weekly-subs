package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashBoardView extends JFrame {
    private JButton bicycleManagerButton;
    private JButton viewBankAccountButton;
    private JButton riderManagerButton;
    private JPanel DashBoardUI;

    public DashBoardView() {
        viewBankAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BankAccountView ui = new BankAccountView();
                ui.setContentPane(ui.backPanel);
                ui.setTitle("Bank Account Application");
                ui.setSize(600,600);
                ui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ui.setVisible(true);
            }
        });
        riderManagerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RiderView riderView=new RiderView();
                riderView.setContentPane(riderView.backPane);
                riderView.setTitle("Rider Application");
                riderView.setSize(600,600);
                riderView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                riderView.setVisible(true);
            }
        });
        bicycleManagerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BicycleView bicycleView=new BicycleView();
                bicycleView.setContentPane(bicycleView.backPane);
                bicycleView.setTitle("Bicycle Application");
                bicycleView.setSize(600,600);
                bicycleView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                bicycleView.setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
        DashBoardView DashBoardView=new DashBoardView();
        DashBoardView.setContentPane(DashBoardView.DashBoardUI);
        DashBoardView.setTitle("DashBoard View");
        DashBoardView.setSize(600,600);
        DashBoardView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DashBoardView.setVisible(true);
    }
}
