package theme;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
class ThemeParkPricing extends Frame
{
    ThemeParkListener tk;

	TextField txtWaterRide,txtNormalEntry,txtTotalEntry;
    Label lblWaterRide,lblNormalEntry,lblTotalEntry;
    Button btnChange,btnUpdate;
    ThemeParkPricing(){
        super("Pricing");
		this.setBounds(100, 100, 800, 700);
		this.setLayout(null);
        tk =  new ThemeParkListener(this);
		txtNormalEntry = new TextField();
        txtWaterRide = new TextField();
        txtTotalEntry = new TextField();
        lblTotalEntry = new Label("Entry Ticket Price");
        lblNormalEntry = new Label("Normal Ride Price");
        lblWaterRide = new Label("Water Ride Price");
        btnChange = new Button("Cancel");
        btnUpdate = new Button("Update");
        lblNormalEntry.setBounds(50, 50, 110, 50);
        txtNormalEntry.setBounds(170,50,100,50);
        lblWaterRide.setBounds(50, 110, 100, 50);
        txtWaterRide.setBounds(170,110,100,50);
        lblTotalEntry.setBounds(50, 170, 100, 50);
        txtTotalEntry.setBounds(170,170,100,50);
        btnChange.setBounds(80, 230, 80, 30);
        btnUpdate.setBounds(180,230,80,30);

        add(lblNormalEntry);
        add(txtNormalEntry);
        add(lblWaterRide);
        add(txtWaterRide);
        add(lblTotalEntry);
        add(txtTotalEntry);
        add(btnChange);
        add(btnUpdate);
        btnChange.addActionListener(tk);
        btnUpdate.addActionListener(tk);
		//Font f = new Font("Arial",0,50);
        addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
}

} 