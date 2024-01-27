package Views;

import Models.SavingsAccount;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SavingsAccountView extends JFrame {
    private JLabel lblOwnerName;
    private JLabel lblAccountNo;
    private JLabel lblBalance;
    private JLabel lblInterestRate;
    private JTextField txtOwnerName;
    private JTextField txtAccountNo;
    private JTextField txtBalance;
    private JTextField txtInterestRate;
    private JCheckBox chkIsJoint;
    private JButton btnAddAccount;
    private JButton btnCalculateInterest;
    public JPanel backPanel;

    public SavingsAccountView() {
        btnAddAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String ownerName=txtOwnerName.getText();
                int accountNo= Integer.parseInt(txtAccountNo.getText());
                double balance=Double.parseDouble(txtBalance.getText());
                double interetRate=Double.parseDouble(txtInterestRate.getText());
                boolean flag=chkIsJoint.isSelected();

                SavingsAccount ac1=new SavingsAccount(ownerName,accountNo,
                        balance,interetRate,flag);

                JOptionPane.showMessageDialog(backPanel,"Account Created ",
                        "Success",1);
                JOptionPane.showMessageDialog(backPanel,ac1.printAccount(),
                        "Info",0);

            }
        });
        btnCalculateInterest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ownerName=txtOwnerName.getText();
                int accountNo= Integer.parseInt(txtAccountNo.getText());
                double balance=Double.parseDouble(txtBalance.getText());
                double interetRate=Double.parseDouble(txtInterestRate.getText());
                boolean flag=chkIsJoint.isSelected();

                SavingsAccount ac1=new SavingsAccount(ownerName,accountNo,
                        balance,interetRate,flag);

                JOptionPane.showMessageDialog(backPanel,ac1.calculateBalance(),
                        "Info",0);
            }
        });
    }

    public static void main(String[] args) {
        SavingsAccountView ui=new SavingsAccountView();
        ui.setContentPane(ui.backPanel);
        ui.setTitle("Savings Account Manager 1.0");
        ui.setSize(600,600);
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui.setVisible(true);
    }
}
