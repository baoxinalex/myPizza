import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class EnterDailyMileage extends JFrame{
	
	private JButton btnOK;
	private JButton btnCancel;
	private JTextField taChoice;
	
	public EnterDailyMileage()
	{
		super("Add Vehicle's Daily Mileage");
		setSize(400,300);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 GridBagLayout gbl  = new GridBagLayout();
	        GridBagConstraints gbc = new GridBagConstraints();
	        gbc.insets = new Insets(5,5,5,5);
	        gbc.fill = GridBagConstraints.BOTH;
	        
	       
	        taChoice =  new JTextField(10);
	        btnOK = new JButton("OK");
	        btnCancel= new JButton("Cancel");
	        
	        btnOK.addActionListener( new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	
	            }}
);
	        
	        Container c = getContentPane();
	        c.setLayout(gbl);

	        // add tfWord <html>this is line1<br>this is line2</html>
	        gbc.anchor = GridBagConstraints.CENTER;
	        c.add( new JLabel("<html>Please enter the mileage for :<br>"
	        		+ "Delivery Car with Identifier: </html>"),gbc);
	        
	        gbc.anchor = GridBagConstraints.WEST;
	        c.add(taChoice);
	        // add button OK
	        gbc.gridx  = 0;
	        gbc.gridwidth = 3;
	        gbc.anchor = GridBagConstraints.CENTER;
	        gbc.fill = GridBagConstraints.NONE;
	        c.add(btnOK,gbc);
	        
	        // add button Cancel
	        gbc.gridx  = 0;
	        gbc.gridwidth = 3;
	        gbc.anchor = GridBagConstraints.CENTER;
	        gbc.fill = GridBagConstraints.NONE;
	        c.add(btnCancel,gbc);
	        pack();

}
}

