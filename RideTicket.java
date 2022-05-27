package theme;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
class RideTicket extends Frame
{
    TextField txtName,txtAge,txtCountry;
    Button btnSave,btnAdd,btnDelete,btnEdit;
    Label lblName,lblAge,lblCountry;
    ThemeParkListener tk; 
    RideTicket()
    {
        super("Entry Tickets");
        this.setLayout(null);
        this.setBounds(50,50,1000,800);
        tk = new ThemeParkListener(this);
        txtName = new TextField();
        txtAge = new TextField();
        txtCountry = new TextField();
        btnSave = new Button("Save");
        btnAdd = new Button("Add");
        btnDelete = new Button("Delete");
        btnEdit = new Button("Edit");
        lblName = new Label("Name");
        lblAge = new Label("Age");
        lblCountry = new Label("Country");
        lblName.setBounds(50,50,150,50);
        txtName.setBounds(210,50,300,50);
        lblAge.setBounds(50,110,150,50);
        txtAge.setBounds(210,110,100,50);
        lblCountry.setBounds(50,170,150,50);
        txtCountry.setBounds(210,170,100,50);
        btnSave.setBounds(50, 230, 50, 50);
        btnAdd.setBounds(210,230,50,50);
        btnDelete.setBounds(270,230,50,50);
        btnEdit.setBounds(330,230,50,50);

        add(txtName);
        add(txtAge);
        add(txtCountry);
        add(lblName);
        add(lblAge);
        add(lblCountry);
        add(btnSave);
        add(btnAdd);
        add(btnEdit);
        add(btnDelete);

        btnSave.addActionListener(tk);

        addWindowListener(new WindowAdapter()
        {
          public void windowClosing(WindowEvent e)
          {
            System.exit(0);
          }
        });


    }

}