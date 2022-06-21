package theme;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;


public class EntryTicket extends Frame
{
         TextField txtName,txtAge,txtCountry;
         Button btnSave,btnAdd,btnDelete,btnEdit;
         Label lblName,lblAge,lblCountry;
         ThemeParkListener tk;
         EntryTicket()
         {
             super("Entry Tickets");
             this.setLayout(null);
             this.setBounds(50,50,1000,800);
             tk   = new ThemeParkListener(this);
          }

}