import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MyPizzaUtilityMenu extends JFrame {
private JTextField tfWord;
    
    private JButton btnOK;
    private JButton btnCancel;
    private JTextField  taChoice;;
    
	public MyPizzaUtilityMenu()
	{
		super("MyPizza Utility Menu");
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
	            	 
	            	if(taChoice.getText().length() >0)
	            	{
	                  int choice = Integer.parseInt(taChoice.getText());
	                  System.out.println(choice);
	                		  if(choice>0 && choice <3)
	                		  {
	                			  switch(choice)
	                			  {
	                			  case 1: addDeliveryVehicle();break;
	                			  case 2: displayFleetReport();break;
	                			  
	                			  }
	                		  }
	                		  else
	                		  {
	                			  JOptionPane.showMessageDialog( MyPizzaUtilityMenu.this, "Please enter correct choice!","Add Choice", JOptionPane.ERROR_MESSAGE);
	                			  taChoice.requestFocus();
	                			  
	                		  }
	                     // JOptionPane.showInputDialog("You clicked ok");
	            	
	                     // tfWord.setText("");
	                      //taMeaning.setText("");
	            	}     //tfWord.requestFocus();
	            	else{
	            		System.out.println(taChoice.getText().length());
	            		JOptionPane.showMessageDialog( MyPizzaUtilityMenu.this, "Please enter correct choice!","Add Choice", JOptionPane.ERROR_MESSAGE);
                         tfWord.requestFocus();
	                        }
	            }}
	        );
	        
	        Container c = getContentPane();
	        c.setLayout(gbl);

	        // add tfWord <html>this is line1<br>this is line2</html>
	        gbc.anchor = GridBagConstraints.CENTER;
	        c.add( new JLabel("<html>Please select an option below: <br> <br> [1]  Add Delivery Vehicle: <br> <br>"
	        		+ "[2]  Display fleet Report <br> <br> </html>"),gbc);
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
	
	void addDeliveryVehicle()
	{
		AddDeliveryVehicle adv = new AddDeliveryVehicle();
		adv.setVisible(true);
	}
	void displayFleetReport(){
		
	}
	
		
	}


