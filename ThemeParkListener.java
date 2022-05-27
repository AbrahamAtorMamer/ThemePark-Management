package theme;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.ArrayList;
class ThemeParkListener implements ActionListener
{
	ThemeParkPricing themeParkPricing;
	HomePage homePage;
	DashBoard dashBoard;
	EntryTicket entryTicket;
	RideTicket rideTicket;
	UserDashBoard userDashBoard;
	WaterRide waterRide;
	UserWaterRide userWaterRide;
	UserEntryTickets userEntryTickets;
	UserRideTicket userRideTicket;
	DetailsForSignup detailsForSignup;
	VisitorLog visitorLog;
	ArrayList<String> username,password;
	ThemeParkListener(ThemeParkPricing ve)
	{
		this.themeParkPricing=ve;
	}
	ThemeParkListener(RideTicket dt)
	{
		this.rideTicket=dt;
	}
	ThemeParkListener(EntryTicket nt)
	{
		this.entryTicket=nt;
	}
	ThemeParkListener(DashBoard dd)
	{
		this.dashBoard=dd;
	}
	ThemeParkListener(HomePage mg)
	{
		this.homePage=mg;
	}
	ThemeParkListener(UserDashBoard ed)
	{
		this.userDashBoard=ed;
	}
	ThemeParkListener(WaterRide wd)
	{
		this.waterRide=wd;
	}
	ThemeParkListener(UserRideTicket ut)
	{
		this.userRideTicket=ut;
	}
	ThemeParkListener(UserEntryTickets tt)
	{
		this.userEntryTickets=tt;
	}
	ThemeParkListener(UserWaterRide ue)
	{
		this.userWaterRide=ue;
	}
	ThemeParkListener(DetailsForSignup dg)
	{
		this.detailsForSignup=dg;
		username= new ArrayList<String>();
		password = new ArrayList<String>();
	}
	ThemeParkListener(VisitorLog vl)
	{
		this.visitorLog=vl;
	}
	public void actionPerformed(ActionEvent e) 
	{
		userEntryTickets = new UserEntryTickets();
        
		homePage = new HomePage();
		userRideTicket = new UserRideTicket();
		themeParkPricing = new ThemeParkPricing();
	    dashBoard = new DashBoard();
	    entryTicket = new EntryTicket();
	    rideTicket = new RideTicket();
	    waterRide = new WaterRide();
	    userWaterRide = new UserWaterRide();
	    detailsForSignup = new DetailsForSignup();
	    visitorLog = new VisitorLog();
		String name,pass;

		if(e.getActionCommand().equals("Sign Up"))
		{
			this.homePage.setVisible(false);
			detailsForSignup.setVisible(true);
		}
		if(e.getActionCommand().equals("Save"))
		{
			this.detailsForSignup.setVisible(false);
			homePage.setVisible(true);
			username.add(this.detailsForSignup.txtUserNameD.getText());
			password.add(this.detailsForSignup.txtPasswordD.getText());
			System.out.println(username);
			 System.out.println(password);
		}
		if(e.getActionCommand().equals("Login") )
		{
			userDashBoard = new UserDashBoard();
			this.userDashBoard.setVisible(true);
			this.homePage.setVisible(false);	
		}
		if(e.getActionCommand().equals("Login"))
		{
			// dashBoard = new DashBoard();
			// this.homePage.setVisible(false);
			// dashBoard.setVisible(true);
				
		}
		// if(e.getActionCommand().equals("Login"))
		// {
		// 	this.homePage.setVisible(false);
		// 	themeParkPricing.setVisible(true);
				
		// }
		if(e.getActionCommand().equals("Cancel"))
		{
			this.homePage.setVisible(true);
			themeParkPricing.setVisible(false);
				
		}
		// if(e.getActionCommand().equals("Login"))
		// {
		// 	this.homePage.setVisible(false);
		// 	visitorLog.setVisible(true);
				
		// }
		if(e.getActionCommand().equals("Entry Ticket"))
		{
			this.userEntryTickets.setVisible(true);
			 this.userDashBoard.setVisible(false);
		}
        if(e.getActionCommand().equals("Normal Ride Ticket"))
		{
			this.userRideTicket.setVisible(true);	
			this.userDashBoard.setVisible(false);
		}
        if(e.getActionCommand().equals("Water Ride Ticket"))
		{
			this.userWaterRide.setVisible(true);
			this.userDashBoard.setVisible(false);	
		}
		if(e.getActionCommand().equals("Buy"))
		{
			this.userDashBoard.setVisible(true);
		}
		if(e.getActionCommand().equals("Home Page"))
		{
			this.homePage.setVisible(true);
		}


    }


} 