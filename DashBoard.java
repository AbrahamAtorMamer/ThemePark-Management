package theme;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
class DashBoard extends Frame
{
    ThemeParkListener tk;
    TextField txtWaterRide,txtNormalEntry,txtTotalEntry;
    Label lblWaterRide,lblNormalEntry,lblTotalEntry;
    DashBoard()
    {
        super("DashBoard");
        this.setLayout(null);
        this.setBounds(50,50,1000,800);
        tk= new ThemeParkListener(this);
        txtNormalEntry = new TextField();
        txtWaterRide = new TextField();
        txtTotalEntry = new TextField();
        lblNormalEntry = new Label("Normal Entry");
        lblTotalEntry = new Label("Total Entry");
        lblWaterRide = new Label("Water Ride");
        lblNormalEntry.setBounds(50, 50, 100, 50);
        txtNormalEntry.setBounds(150,50,100,50);
        lblWaterRide.setBounds(50, 110, 100, 50);
        txtWaterRide.setBounds(150,110,100,50);
        lblTotalEntry.setBounds(50, 170, 100, 50);
        txtTotalEntry.setBounds(150,170,100,50);

        add(lblNormalEntry);
        add(txtNormalEntry);
        add(lblWaterRide);
        add(txtWaterRide);
        add(lblTotalEntry);
        add(txtTotalEntry);
        addWindowListener(new WindowAdapter()
        {
          public void windowClosing(WindowEvent e)
          {
            System.exit(0);
          }
        });
        

    }
  
}
