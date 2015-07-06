import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.*;

/*
 * This is the main class which displays the main screen to the user for input 
 */
public class MyEfficiencyApp extends JFrame{
	
	private JTextField tfWord;
    
    private JButton btnOK;
    private JButton btnCancel;
    private JTextField  taChoice;
    private static List<DeliveryVehicle> list= new ArrayList<DeliveryVehicle>();

	public MyEfficiencyApp()
	{
		super("MyPizza Vehicle Efficiency APP");
		setSize(400,400);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 // Using grid bag to arrange the components of GUI
		 GridBagLayout gbl  = new GridBagLayout();
	        GridBagConstraints gbc = new GridBagConstraints();
	        gbc.insets = new Insets(5,5,5,5);
	        gbc.fill = GridBagConstraints.BOTH;
	        
	        
	        taChoice =  new JTextField(10);
	        btnOK = new JButton("OK");
	        btnCancel= new JButton("Cancel");
	        
	        btnOK.addActionListener( new ActionListener() {

	            // If user clicks on the Ok button
	            public void actionPerformed(ActionEvent e) {
	            	 
	            	if(taChoice.getText().length() >0)
	            	{
	                  int choice = Integer.parseInt(taChoice.getText());
	                  System.out.println(choice);
	                		  if(choice>0 && choice <5)
	                		  {
	                			  switch(choice)
	                			  {
	                			  case 1: enterDailyData();break;
	                			  case 2: effReport();break;
	                			  case 3: addDeliveryVeh();break;
	                			  case 4 : dataout();break;
	                			  }
	                		  }
	                		  else
	                		  {
	                			  JOptionPane.showMessageDialog( MyEfficiencyApp.this, "Please enter correct choice!","Add Choice", JOptionPane.ERROR_MESSAGE);
	                			  taChoice.requestFocus();
	                			  
	                		  }
	                     // JOptionPane.showInputDialog("You clicked ok");
	            	
	                     // tfWord.setText("");
	                      //taMeaning.setText("");
	            	}     //tfWord.requestFocus();
	            	else{
	            		System.out.println(taChoice.getText().length());
	            		JOptionPane.showMessageDialog( MyEfficiencyApp.this, "Please enter correct choice!","Add Choice", JOptionPane.ERROR_MESSAGE);
                         tfWord.requestFocus();
	                        }
	            }}
	        );
	        
	        Container c = getContentPane();
	        c.setLayout(gbl);

	        gbc.anchor = GridBagConstraints.CENTER;
	        c.add( new JLabel("<html>Please select an option from the menu below: <br> <br> [1]  Add Daily Data: <br> <br>"
	        		+ "[2]  Run Efficiency Report <br> <br> [3]  Utility Menu  <br> <br> [4]  Exit Application</html>"),gbc);
	        //gbc.anchor = GridBagConstraints.CENTER;
	        //c.add(tfWord);
	        
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
	}
	public void enterDailyData()
	{
		//DeliveryVehicle d = new DelBikes();
		//readFromFile();
		//for(DeliveryVehicle dd : list)
			EnterDailyData e= new EnterDailyData();
		//centerToParent(MyEfficiencyApp.this, e);
        e.setVisible(true);
		
	}
	public void effReport()
	{
		
	}
	public void addDeliveryVeh()
	{
		MyPizzaUtilityMenu mpuMenu = new MyPizzaUtilityMenu();
		mpuMenu.setVisible(true);
	}
	public void dataout()
	{
		
	}
	public void userInterface()
	{
		
	}
	
	public void dataIn(){
		// open a text file myPizzaData.text
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
