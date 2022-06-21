package theme;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class HomePage extends Frame
{
    JTextField txtUserName;
    JPasswordField txtPassword;
    Label lblUserName,lblPassword,lblLoginCredentials,lblRegister;
    Button btnSignUp,btnLogin;
    ThemeParkListener tk;
    HomePage()
    {
        super("Home Page");
        this.setLayout(null);
        this.setBounds(100,100,700,500);
         tk = new ThemeParkListener(this);

        btnLogin = new Button("Login");
        btnSignUp = new Button("Sign Up");
        txtUserName = new JTextField();
        txtPassword = new JPasswordField();
        lblUserName = new Label("Username");
        lblPassword = new Label("Password");
        lblLoginCredentials = new Label("Enter Login Details");
        lblRegister = new Label("Not Yet Registered?");
         
        lblLoginCredentials.setBounds(300,50,200,50);
        lblUserName.setBounds(100,110,70,50);
        txtUserName.setBounds(180,110,200,50);
        lblPassword.setBounds(100,170,70,50);
        txtPassword.setBounds(180,170,200,50);
        btnLogin.setBounds(200,230,100,50);
        lblRegister.setBounds(320,230,110,50);
        btnSignUp.setBounds(470,230,100,50);

        add(lblLoginCredentials);
        add(lblUserName);
        add(txtUserName);
        add(lblPassword);
        add(txtPassword);
        add(btnLogin);
        add(lblRegister);
        add(btnSignUp);
        
        btnLogin.addActionListener(tk);
        btnSignUp.addActionListener(tk);
        addWindowListener(new WindowAdapter()
        {
          public void windowClosing(WindowEvent e)
          {
            System.exit(0);
          }
        });


    }

      public static void main(String[] args) {
      HomePage hp = new  HomePage();
      hp.setBackground(Color.getHSBColor(50, 170, 200));
       hp.setVisible(true);
      }

}

