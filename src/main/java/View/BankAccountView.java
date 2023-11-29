package View;

import controller.SavingAccount;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAccountView extends JFrame{
    private JTextField txtOwnerName;
    private JTextField txtAccountNo;
    private JTextField txtBalance;
    private JTextField txtInterestRate;
    private JCheckBox checkBox1;
    private JButton addAccountButton;
    private JButton calculateBalanceButton;
    public JPanel backPanel;

    public BankAccountView() {
        addAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ownerName=txtOwnerName.getText();
                int accountNum=Integer.parseInt(txtAccountNo.getText());
                double balance = Double.parseDouble(txtBalance.getText());
                double interest = Double.parseDouble(txtInterestRate.getText());
                boolean flag = checkBox1.isSelected();

                SavingAccount sav1 = new SavingAccount(ownerName,accountNum,balance,interest,flag);

                //Display values
                JOptionPane.showMessageDialog(backPanel, "Account is added", "Success",1);
                JOptionPane.showMessageDialog(backPanel, sav1.printAccount(), " Information",1);
            }
        });
        calculateBalanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ownerName=txtOwnerName.getText();
                int accountNum=Integer.parseInt(txtAccountNo.getText());
                double balance = Double.parseDouble(txtBalance.getText());
                double interest = Double.parseDouble(txtInterestRate.getText());
                boolean flag = checkBox1.isSelected();

                SavingAccount sav1 = new SavingAccount(ownerName,accountNum,balance,interest,flag);

                JOptionPane.showMessageDialog(backPanel, sav1.getCalculatedBalance(), "Total balance",1);

            }
        });
    }

    public static void main(String[] args) {
        BankAccountView ui = new BankAccountView();
        ui.setContentPane(ui.backPanel);
        ui.setTitle("Bank Account Application");
        ui.setSize(600,600);
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui.setVisible(true);
    }

}
