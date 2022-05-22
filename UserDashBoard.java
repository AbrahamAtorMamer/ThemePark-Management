package theme;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
public class UserDashBoard extends Frame 
{
    Button btnEntryTicket,btnRideTicket,btnWaterRide;
    ThemeParkListener tk;
    UserDashBoard()
    {
        super("DashBoard");
        this.setLayout(null);
        this.setBounds(100,100,500,500);
         tk = new ThemeParkListener(this);
          btnEntryTicket = new Button("Entry Ticket");
          btnWaterRide = new Button("Water Ride Ticket");
          btnRideTicket = new Button("Normal Ride Ticket");

          btnEntryTicket.setBounds(100,50,200,50);
          btnRideTicket.setBounds(100,110,200,50);
          btnWaterRide.setBounds(100,170,200,50);

          add(btnEntryTicket);
          add(btnRideTicket);
          add(btnWaterRide);

          btnEntryTicket.addActionListener(tk);
          btnRideTicket.addActionListener(tk);
          btnWaterRide.addActionListener(tk);
          addWindowListener(new WindowAdapter()
          {
            public void windowClosing(WindowEvent e)
            {
              System.exit(0);
            }
          });
    }    
}
