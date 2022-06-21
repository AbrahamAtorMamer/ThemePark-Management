package theme;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class DetailsForSignup extends Frame
 {
    JTextField txtUserNameD;
    JPasswordField txtPasswordD;
    Label lblUserName,lblPassword,lblLoginCredentials,lblRegister;
    Button btnSave;
    ThemeParkListener tk;
    DetailsForSignup()
    {
        super("Details Sign Up");
        this.setLayout(null);
        this.setBounds(100,100,600,500);
        tk = new ThemeParkListener(this);
        btnSave = new Button("Save");
        txtUserNameD = new JTextField();
        txtPasswordD = new JPasswordField();
        lblUserName = new Label("Username");
        lblPassword = new Label("Password");
        lblLoginCredentials = new Label("Enter SignUp Details");


        lblLoginCredentials.setBounds(200,50,200,50);
        lblUserName.setBounds(100,110,70,50);
        txtUserNameD.setBounds(180,110,200,50);
        lblPassword.setBounds(100,170,70,50);
        txtPasswordD.setBounds(180,170,200,50);
        btnSave.setBounds(200,230,100,50);

        add(lblLoginCredentials);
        add(lblUserName);
        add(txtUserNameD);
        add(lblPassword);
        add(txtPasswordD);
        add(btnSave);

        btnSave.addActionListener(tk);
        }
}