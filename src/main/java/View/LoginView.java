package View;

import Model.User;
import controller.LoginController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView {
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton loginButton;
    private JLabel lblUsername;
    private JLabel lblPassword;
    private JPanel backPanel;

    public LoginView() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //get the user inputs
                String user = txtUsername.getText();
                char[] pass = txtPassword.getPassword();
                String passT = new String(pass);

                User u = new User(User,PassT,null);
                LoginController controller = new LoginController();
                User valid = controller.validateUser(u);

                if (valid != null){
                    switch (valid.getType()){
                        case "admin":
                            DashBoardView DashBoardView=new DashBoardView();
                            DashBoardView.setContentPane(DashBoardView.DashBoardUI);
                            DashBoardView.setTitle("DashBoard View");
                            DashBoardView.setSize(600,600);
                            DashBoardView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            DashBoardView.setVisible(true);
                            break;

                        case "rider":
                            RiderView riderView=new RiderView();
                            riderView.setContentPane(riderView.backPane);
                            riderView.setTitle("Rider Application");
                            riderView.setSize(600,600);
                            riderView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            riderView.setVisible(true);
                            break;

                        case "bike":
                            BicycleView bicycleView=new BicycleView();
                            bicycleView.setContentPane(bicycleView.backPane);
                            bicycleView.setTitle("Bicycle Application");
                            bicycleView.setSize(600,600);
                            bicycleView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            bicycleView.setVisible(true);
                            break;

                        case "bank":
                            BankAccountView ui = new BankAccountView();
                            ui.setContentPane(ui.backPanel);
                            ui.setTitle("Bank Account Application");
                            ui.setSize(600,600);
                            ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            ui.setVisible(true);
                            break;
                    }
                }
                else {
                    JOptionPane.showMessageDialog(backPanel,"ex","error",1);
                }
            }
        });
    }
}
