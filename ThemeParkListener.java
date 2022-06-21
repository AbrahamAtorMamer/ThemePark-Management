package theme;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.DefaultButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.sql.DriverManager;
// set classpath=mysql-connector.jar;.;
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
	String name,country,waterRidePrice,normalRidePrice,entryTicketPrice;
	int age;
    
	
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
	}
	ThemeParkListener(VisitorLog vl)
	{
		this.visitorLog=vl;
	}
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getActionCommand().equals("Sign Up"))
		{
			detailsForSignup = new DetailsForSignup();
			detailsForSignup.setVisible(true);
		}
		if(e.getActionCommand().equals("Save"))
		{
			
			String username=detailsForSignup.txtUserNameD.getText();
			String  password=detailsForSignup.txtPasswordD.getText();
			System.out.println(username);
			System.out.println(password);
           
			try
          {  

		      Class.forName("com.mysql.jdbc.Driver");  
               Connection con=DriverManager.getConnection("jdbc:mysql://localhost/theme park managment?characterEncoding=utf8","root","");   
               String query = "INSERT INTO `login`(`Username`, `Password`) VALUES (?,?)";
              PreparedStatement stmt=con.prepareStatement(query);
              stmt.setString(1,username);
               stmt.setString(2,password);
              int count = stmt.executeUpdate();
              con.close();  
        }
catch(Exception en)
{ 
System.out.println(en);
}  

			this.detailsForSignup.setVisible(false);
			
		}
		if(e.getActionCommand().equals("Login") )
		{
		 if(homePage.txtUserName.getText().equals("admin") && homePage.txtPassword.getText().equals("admin@1"))
			{
			String username = this.homePage.txtUserName.getText();
			String password = this.homePage.txtPassword.getText();
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/theme park managment?characterEncoding=utf8","root","");  
			
				Statement stm = con.createStatement();

				String query = "select * from `adminlogin` where AdminName='"+username+"' and Password='"+password+"'";

				ResultSet rs =stm.executeQuery(query);	
				if(rs.next())
			       {
					   homePage.txtUserName.setText("");
			           homePage.txtPassword.setText("");
						dashBoard = new DashBoard();
		               this.dashBoard.setVisible(true);
					}
				else{
					JOptionPane.showMessageDialog(null,"Incorrect Admin Name or password");
					
					this.homePage.txtUserName.setText("");
					this.homePage.txtPassword.setText("");
				}
				con.close();
			}  
                 catch(Exception en)
             { 
                System.out.println(en);
			 }


			}
		else{	
			String username = homePage.txtUserName.getText();
           String password = homePage.txtPassword.getText();
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/theme park managment", "root", "");
            Statement st = con.createStatement();

            String query = "select * from `login` where Username='" + username + "' and Password='" + password + "'";

            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
				homePage.txtUserName.setText("");
			    homePage.txtPassword.setText("");
                new UserDashBoard().setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Incorrect username or password");
               homePage.txtUserName.setText("");
			   homePage.txtPassword.setText("");
            }

        } catch (Exception en) {
            System.out.println(en);
        } 
		}
	}
		/*if(e.getActionCommand().equals("Login"))
		{
			String username = this.homePage.txtUserName.getText();
			String password = this.homePage.txtPassword.getText();
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/theme park managment?characterEncoding=utf8","root","");  
			
				Statement stm = con.createStatement();

				String query = "select * from `adminlogin` where AdminName='"+username+"' and Password='"+password+"'";

				ResultSet rs =stm.executeQuery(query);	
				if(rs.next())
			       {
					   homePage.txtUserName.setText("");
			           homePage.txtPassword.setText("");
						dashBoard = new DashBoard();
		               this.dashBoard.setVisible(true);
					}
				else{
					JOptionPane.showMessageDialog(null,"Incorrect Admin Name or password");
					this.homePage.txtUserName.setText("");
					this.homePage.txtPassword.setText("");
				}
				con.close();
			}  
                 catch(Exception en)
             { 
                System.out.println(en);
			 }
	}*/
		if(e.getActionCommand().equals("Pricing"))	
		{
            themeParkPricing = new ThemeParkPricing();   
			themeParkPricing.setVisible(true);
		}
		if(e.getActionCommand().equals("Visitors' Log"))	
		{
			visitorLog = new VisitorLog();
			visitorLog.setVisible(true);
		}
		if(e.getActionCommand().equals("Previous"))
		{
			dashBoard =new DashBoard();
			dashBoard.setVisible(true);
			visitorLog.setVisible(false);
		}
		if(e.getActionCommand().equals("Entry Ticket"))	
		{
            entryTicket = new EntryTicket();   
			entryTicket.setVisible(true);
		}
		if(e.getActionCommand().equals("Ride Ticket"))	
		{
			rideTicket = new RideTicket();
			rideTicket.setVisible(true);
		}
		if(e.getActionCommand().equals("Water Ride Ticket"))
		{
			waterRide =new WaterRide();
			waterRide.setVisible(true);
			try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/theme park managment?characterEncoding=utf8","root","");   
            String query = "SELECT * FROM `waterrideticket`";
           java.sql.Statement stmt=con.createStatement();
           ResultSet rs = stmt.executeQuery(query);

           while(rs.next())
           {
              String name = rs.getString(1);
              String age = rs.getString(2);
              String country = rs.getString(3);
              String[][] data ={{name,age,country}};
			  DefaultTableModel ta = (DefaultTableModel)waterRide.table.getModel();
			   ta.addRow(data);
           }
		  } catch(Exception n){

		  }
			
		}
		if(e.getActionCommand().equals("Cancel"))
		{
			dashBoard =new DashBoard();
			dashBoard.setVisible(true);
			this.themeParkPricing.setVisible(false);
				
		}
		if(e.getActionCommand().equals("Update"))
		{
             waterRidePrice = this.themeParkPricing.txtWaterRide.getText();
			 normalRidePrice = this.themeParkPricing.txtNormalEntry.getText();
			 entryTicketPrice = this.themeParkPricing.txtTotalEntry.getText();
			 
			 userDashBoard.lblEntryPrice.setText(entryTicketPrice);
			 userDashBoard.lblRidePrice.setText(normalRidePrice);
			 userDashBoard.lblWaterRidePrice.setText(waterRidePrice);
			 this.themeParkPricing.setVisible(false);
			
				
		}
		
		if(e.getActionCommand().equals("Entry Ticket."))
		{
			 userEntryTickets = new UserEntryTickets();
			 this.userEntryTickets.setVisible(true);
			 userDashBoard.setVisible(false);
			
		}
        if(e.getActionCommand().equals("Normal Ride Ticket."))
		{
			
			userRideTicket = new UserRideTicket();
			this.userRideTicket.setVisible(true);	
			this.userDashBoard.setVisible(false);
		}
        if(e.getActionCommand().equals("Water Ride Ticket."))
		{
			userWaterRide = new UserWaterRide();
			this.userWaterRide.setVisible(true);
			this.userDashBoard.setVisible(false);	
		}
		if(e.getActionCommand().equals("Purchase"))
		{
             name=userWaterRide.txtName.getText();
			 age=Integer.parseInt(userWaterRide.txtAge.getText());
			 country=userWaterRide.txtCountry.getText();
			 System.out.println("For Water Ride Tickets");
			 System.out.println(name);
			 System.out.println(age);
			 System.out.println(country);
			 	try
            {  

		      Class.forName("com.mysql.jdbc.Driver");  
               Connection con=DriverManager.getConnection("jdbc:mysql://localhost/theme park managment?characterEncoding=utf8","root","");   
               String query = "INSERT INTO `waterRideTicket`(`Name`, `Age`,`Country`) VALUES (?,?,?)";
              PreparedStatement stmt=con.prepareStatement(query);
              stmt.setString(1,name);
               stmt.setInt(2,age);
			    stmt.setString(3,country);
              int count = stmt.executeUpdate();
			  JOptionPane.showMessageDialog(null,"Water Ride Ticket Purchased Successfully");  
			  System.out.println(count+" row/s affected");
              con.close();  
            }
            catch(Exception en)
            { 
                 System.out.println(en);
           }              
			userDashBoard = new UserDashBoard();
			userDashBoard.setVisible(true);
			userWaterRide.setVisible(false);
		}
		if(e.getActionCommand().equals("Buy"))
		{
			 name=userEntryTickets.txtName.getText();
			 age=Integer.parseInt(userEntryTickets.txtAge.getText());
			 country=userEntryTickets.txtCountry.getText();
			 System.out.println("For Entry Tickets");
			 System.out.println(name);
			 System.out.println(age);
			 System.out.println(country);
			 	try
          {  

		      Class.forName("com.mysql.jdbc.Driver");  
               Connection con=DriverManager.getConnection("jdbc:mysql://localhost/theme park managment?characterEncoding=utf8","root","");   
               String query = "INSERT INTO `entryTicket`(`Name`, `Age`,`Country`) VALUES (?,?,?)";
              PreparedStatement stmt=con.prepareStatement(query);
               stmt.setString(1,name);
               stmt.setInt(2,age);
			   stmt.setString(3,country);
              int count = stmt.executeUpdate();
			  JOptionPane.showMessageDialog(null,"Entry Ticket Bought Successfully");  
			  System.out.println(count+" row/s affected");
              con.close();  
        }
catch(Exception en)
{ 
System.out.println(en);
}   
			userDashBoard = new UserDashBoard();
			userDashBoard.setVisible(true);
			userEntryTickets.setVisible(false);
		}
		if(e.getActionCommand().equals("Obtain"))
		{
			 name=userRideTicket.txtName.getText();
			 age=Integer.parseInt(userRideTicket.txtAge.getText());
			 country=userRideTicket.txtCountry.getText();
			 System.out.println("For Ride Ticket");
			 System.out.println(name);
			 System.out.println(age);
			 System.out.println(country);
			try
          {  

		      Class.forName("com.mysql.jdbc.Driver");  
               Connection con=DriverManager.getConnection("jdbc:mysql://localhost/theme park managment?characterEncoding=utf8","root","");   
               String query = "INSERT INTO `rideTicket`(`Name`, `Age`,`Country`) VALUES (?,?,?)";
              PreparedStatement stmt=con.prepareStatement(query);
              stmt.setString(1,name);
               stmt.setInt(2,age);
			    stmt.setString(3,country);
              int count = stmt.executeUpdate();
			  JOptionPane.showMessageDialog(null,"Ride Ticket Obtained Successfully");
			  System.out.println(count+" row/s affected");
              con.close();  
        }
          catch(Exception en)
         { 
            System.out.println(en);
        }     
			userDashBoard = new UserDashBoard();
			userDashBoard.setVisible(true);
			userRideTicket.setVisible(false);
		}
		if(e.getActionCommand().equals("Close"))
		{
			userDashBoard.setVisible(false);
		}
		if(e.getActionCommand().equals("Back"))
		{
			dashBoard.setVisible(false);
		}
	}

} 