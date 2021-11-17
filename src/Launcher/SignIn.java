package Launcher;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SignIn extends javax.swing.JFrame{
    Toolkit tk = Toolkit.getDefaultToolkit();
    int xSize = ((int) tk.getScreenSize().getWidth());
    int ySize = ((int) tk.getScreenSize().getHeight());

    private JPanel signInPanel;
    private JTextField emailTf;
    private JPasswordField passwordTf;
    private JButton signInBtn;
    private JButton signUpBtn;
    private JButton forgotPasswordBtn;
    private JButton launchGameBtn;
    private JLabel enterEmailLabel;
    private JLabel enterPasswordLabel;
    private JPanel picturePanel;

    public static JFrame frame = new JFrame("SurvivalGame Launcher");

    public SignIn(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(new Dimension(1000,700));
        this.setLocation(xSize/4,ySize/4-100);
        this.add(signInPanel);
        this.setVisible(true);

        signInPanel.setPreferredSize(new Dimension(xSize/4,ySize/4));
        signInPanel.setForeground(new Color(255, 255, 255));

        emailTf.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        passwordTf.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        enterEmailLabel.setForeground(new Color(0,0,0));
        enterPasswordLabel.setForeground(new Color(0,0,0));
        signInBtn.setBackground(new Color(255, 255, 255));
        signInBtn.setForeground(new Color(0,0,0));
        signInBtn.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
        signUpBtn.setBackground(new Color(255, 255, 255));
        signUpBtn.setForeground(new Color(0,0,0));
        signUpBtn.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
        forgotPasswordBtn.setBackground(new Color(255, 255, 255));
        forgotPasswordBtn.setForeground(new Color(0,0,0));
        forgotPasswordBtn.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));


        launchGameBtn.setVisible(false);
    }


}