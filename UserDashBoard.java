package theme;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
public class UserDashBoard extends Frame 
{
    Button btnEntryTicket,btnRideTicket,btnWaterRide,btnHomePage;
    Label lblEntryPrice,lblRidePrice,lblWaterRidePrice;
    ThemeParkListener tk;
    UserDashBoard()
    {
        super("DashBoard");
        this.setLayout(null);
        this.setBounds(100,100,500,500);
         tk = new ThemeParkListener(this);
          btnEntryTicket = new Button("Entry Ticket.");
          btnWaterRide = new Button("Water Ride Ticket.");
          btnRideTicket = new Button("Normal Ride Ticket.");
          btnHomePage =new Button("Close");
          lblEntryPrice = new Label("100$");
          lblRidePrice = new Label("70$");
          lblWaterRidePrice = new Label("70$"); 

          btnEntryTicket.setBounds(100,50,200,50);
          btnRideTicket.setBounds(100,110,200,50);
          btnWaterRide.setBounds(100,170,200,50);
          btnHomePage.setBounds(100,230,200,50);
          lblEntryPrice.setBounds(310,50,100,50);
          lblRidePrice.setBounds(310,110,100,50);
          lblWaterRidePrice.setBounds(310,170,100,50);

          add(btnEntryTicket);
          add(btnRideTicket);
          add(btnWaterRide);
          add(btnHomePage);
          add(lblEntryPrice);
          add(lblRidePrice);
          add(lblWaterRidePrice);

          btnEntryTicket.addActionListener(tk);
          btnRideTicket.addActionListener(tk);
          btnWaterRide.addActionListener(tk);
          btnHomePage.addActionListener(tk);
    }    
}