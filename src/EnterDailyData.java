import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;



public class EnterDailyData extends JFrame {
	
	private JTextField tfWord;
	private JButton btnOK;
	private JButton btnCancel;
	private JTextField taChoice;
	
	private static List<DeliveryVehicle> list= new ArrayList<DeliveryVehicle>();
	
	public EnterDailyData()
	{
		super("Add Vehicle's Daily Deliveries");
		setSize(400,300);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 GridBagLayout gbl  = new GridBagLayout();
	        GridBagConstraints gbc = new GridBagConstraints();
	        gbc.insets = new Insets(5,5,5,5);
	        gbc.fill = GridBagConstraints.BOTH;
	        
	        //tfWord = new JTextField(20);
	        taChoice =  new JTextField(10);
	        btnOK = new JButton("OK");
	        btnCancel= new JButton("Cancel");
	        
	        btnOK.addActionListener( new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	
	            	EnterDailyMileage em= new EnterDailyMileage();
	        		//centerToParent(MyEfficiencyApp.this, e);
	                em.setVisible(true);
	            	
	            }}
);
	        
	        Container c = getContentPane();
	        c.setLayout(gbl);

	        // add tfWord <html>this is line1<br>this is line2</html>
	        gbc.anchor = GridBagConstraints.CENTER;
	        c.add( new JLabel("<html>Please enter the number of deliveries made today for the:<br>"
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
	public static List<DeliveryVehicle> readFromFile() {
		String csvFile = "C:\\Users\\HIMA SAGAR REDDY\\Desktop\\myPizzaData.txt";
		
		String line = "";
		String cvsSplitBy = ",";
		try {
			 
			 
			BufferedReader br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
	 
				// use comma as separator
				String[] record = line.split(cvsSplitBy);
				double miles = Double.valueOf(record[4]);
				int days = Integer.valueOf(record[3]);
				int deliveries = Integer.valueOf(record[2]);
				//Prompt user by returning the vehicle 
				DeliveryVehicle d = new DelBikes(record[1],miles,days,deliveries);
				//Inner class instantiation
				//PersonsManager.PersonRecord d = new PersonsManager().new PersonRecord(record[0],record[1],record[2],record[3],record[4],record[5]);
				list.add(d);
			}
			
	 
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		return list;
		
	}
}
