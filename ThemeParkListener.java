package theme;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
class ThemeParkListener implements ActionListener
{
	ThemeParkPricing tp;
	HomePage hp;
	DashBoard db;
	EntryTicket et;
	RideTicket rt;
	UserDashBoard userDashBoard;
	WaterRide waterRide;
	UserWaterRide userWaterRide;
	UserEntryTickets userEntryTickets;
	UserRideTicket userRideTicket;
	DetailsForSignup detailsForSignup;
	VisitorLog visitorLog;
	ThemeParkListener(ThemeParkPricing ve)
	{
		this.tp=ve;
	}
	ThemeParkListener(RideTicket dt)
	{
		this.rt=dt;
	}
	ThemeParkListener(EntryTicket nt)
	{
		this.et=nt;
	}
	ThemeParkListener(DashBoard dd)
	{
		this.db=dd;
	}
	ThemeParkListener(HomePage mg)
	{
		this.hp=mg;
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
	}
	ThemeParkListener(VisitorLog vl)
	{
		this.visitorLog=vl;
	}
	public void actionPerformed(ActionEvent e) 
	{
		  
		if(e.getActionCommand().equals("Login"))
		{
            userDashBoard = new UserDashBoard();
			   userDashBoard.setVisible(true);

		}
		
    }
		
	
}