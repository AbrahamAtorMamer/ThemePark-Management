package theme;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
public class HomePage extends Frame
{
    TextField txtUserName,txtPassword;
    Label lblUserName,lblPassword,lblLoginCredentials,lblRegister;
    Button btnSignUp,btnLogin;
    ThemeParkListener tk;
    HomePage()
    {
        super("HomePage");
        this.setLayout(null);
        this.setBounds(100,100,700,500);
         tk = new ThemeParkListener(this);

        btnLogin = new Button("Login");
        btnSignUp = new Button("Sign Up");
        txtUserName = new TextField();
        txtPassword = new TextField();
        lblUserName = new Label("Username");
        lblPassword = new Label("Password");
        lblLoginCredentials = new Label("Enter Login Details");
        lblRegister = new Label("Register?");
         
        lblLoginCredentials.setBounds(300,50,200,50);
        lblUserName.setBounds(100,110,70,50);
        txtUserName.setBounds(180,110,200,50);
        lblPassword.setBounds(100,170,70,50);
        txtPassword.setBounds(180,170,200,50);
        btnLogin.setBounds(200,230,100,50);
        lblRegister.setBounds(380,230,70,50);
        btnSignUp.setBounds(470,230,100,50);

        add(lblLoginCredentials);
        add(lblUserName);
        add(txtUserName);
        add(lblPassword);
        add(txtPassword);
        add(btnLogin);
        add(lblRegister);
        add(btnSignUp);

        txtUserName.addActionListener(tk);
        txtUserName.addActionListener(tk);
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
       hp.setVisible(true);
      }

}

