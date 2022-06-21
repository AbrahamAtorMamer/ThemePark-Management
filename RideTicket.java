package theme;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
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
       

    }

}