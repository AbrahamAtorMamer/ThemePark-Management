package theme;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.plaf.ButtonUI;

import java.lang.*;
class DashBoard extends Frame
{
    ThemeParkListener tk;
    Button btnPricing,btnVisitorLog,btnBack,btnWaterRide,btnRideTicket,btnEntryTicket;
    DashBoard()
    {
        super("DashBoard");
        this.setLayout(null);
        this.setBounds(50,50,600,520);
        tk= new ThemeParkListener(this);
        btnPricing= new Button("Pricing");
        btnVisitorLog= new Button("Visitors' Log");
        btnBack = new Button("Back");
        btnWaterRide = new Button("Water Ride Ticket");
        btnRideTicket = new Button("Ride Ticket");
        btnEntryTicket = new Button("Entry Ticket");
        btnPricing.setBounds(200, 100,100,50);
        btnVisitorLog.setBounds(200, 160,100,50);
        btnEntryTicket.setBounds(200,220,100,50);
        btnWaterRide.setBounds(200,280,100,50);
        btnRideTicket.setBounds(200,340,100,50);
        btnBack.setBounds(200,400,100,50);
      
        add(btnPricing);
        add(btnVisitorLog);
        add(btnBack);
        add(btnEntryTicket);
        add(btnRideTicket);
        add(btnWaterRide);
    
        btnPricing.addActionListener(tk);
        btnVisitorLog.addActionListener(tk);
        btnBack.addActionListener(tk);
        btnEntryTicket.addActionListener(tk);
        btnRideTicket.addActionListener(tk);
        btnWaterRide.addActionListener(tk);

    }

}