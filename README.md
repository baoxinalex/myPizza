# myPizza
: The java application developed to store the fleet operations of a pizza delivery service and also to analyze the efficiency of their delivery vehicles over course of a year
MS815: Advanced Applications Programming Group Assignment 2014_15
1 | P a g e
Your client runs a pizza delivery service in Galway and has commissioned you to write a Java application to analyze the efficiency of their delivery vehicles over the course of a year.
MyPizza has three types of DeliveryVehicle: DeliveryBike, DeliveryScooter & DeliveryCar. Each instance of a DeliveryVehicle has private member variables to keep a running total of the number of days it has been in service, the number of miles it has covered, the number of deliveries made, and a unique identifier (Registration / ID Num) for each instance of a DeliveryVehicle type. There can be no concrete instances of a DeliveryVehicle.
Each vehicle has an associated average cost of running based on the average servicing and maintenance cost of each DeliveryVehicle type per annum. Ensure that all instances of a DeliveryVehicle sub-class have the same cost of running charge.
 DeliveryBike: € 200
 DeliveryScooter: € 1,000
 DeliveryCar: €2,000
In addition, the delivery scooters and cars have a fuel consumption amount based on their engine size, with each delivery car also having an annual road tax charge based on same. (Note: The different tax bands are indicatory of delivery car engine size)
DeliveryCar Tax Band 1 Tax Band 2 Tax Band 3 Tax Band 4 Tax Band 5 Fuel Cost (per mile) €0.10 €0.115 €0.135 €0.14 €0.16 Road Tax (yearly) €150 €250 €350 €450 €500
The delivery scooters have a fuel cost per mile of €0.08, and are exempt from road tax due to their small engine size (50cc). Delivery bikes because they produce no emissions are eligible for a government incentive grant of €100 a year per bike.
MS815: Advanced Applications Programming Group Assignment 2014_15
2 | P a g e
Group Assignment: PART A – Class Hierarchy:
Develop the DeliveryVehicle class hierarchy in code. Ensure that there are accessor methods for each class variable as appropriate.
Add appropriate methods to each class to update the values of the private member variables (addMiles, addDeliveries, incrementDaysInService etc).Override the toString( ) method of each class so that the returned string is formatted appropriately to be used in a text file for storing each objects state.
Add a method called calculateEfficiency( ) to each class that determines the efficiency of each DeliveryVehicle. The formula should be based on information such as the total number of deliveries made, the amount of deliveries per mile travelled, and the running costs or incentives. The implementation of the calculateEfficiency( ) method will be different for each DeliveryVehicle type. Try to make the algorithm devised for this purpose as meaningful as possible and discuss your decisions in your design notes.
MS815: Advanced Applications Programming Group Assignment 2014_15
3 | P a g e
Group Assignment: PART B – MyEfficiencyApp:
The userInterface( ) method is the only public method of the MyEfficiencyApp Class. When it is called it uses the dataIn( ) method to open a specified text file (myPizzaData.text), using its contents to create and store various types of DeliveryVehicle objects in a suitable Collection class object. When the dataIn( ) method is complete, the Vehicle Efficiency App menu is displayed to screen (Fig: B1).
(Fig: B1)
[1] Add Daily Data
If the user selects [1] Add Daily Data: the enterDailyData( ) method is called. This method increments a day’s service & prompts the user to enter in the number of deliveries and mileage for each of the MyPizza vehicles for that day (Fig: B2 & B3), storing the user input, before calling the appropriate methods of each instance to update their state accordingly.
(Fig: B2) (Fig: B3)
MS815: Advanced Applications Programming Group Assignment 2014_15
4 | P a g e
[2] Run Efficiency Report
If the user selects [2] Run Efficiency Report: the effReport( ) method is called, which computes and displays the calculated efficiency for each DeliveryVehicle by calling the calEfficiency( ) method for each instance, before outputting which vehicle type is adjudged on average to be the most efficient in the year to that date. (See Fig: B4 for what a typical report might resemble)
(Fig: B4)
[3] Utility Menu
If the user selects [3] Utility Menu: A sub-menu is displayed as per (Fig: B5)
(Fig: B5)
MS815: Advanced Applications Programming Group Assignment 2014_15
5 | P a g e
In this sub-menu, If the user selects [1] Add Delivery Vehicle: the internal addDeliveryVeh( ) method is called which (A) prompts the user to select the type of vehicle to add to the MyPizza fleet, and then (B) depending on the vehicle type selected prompts the user for any further details required to create that particular vehicle object, before (C) storing it in the collection object(s). (Fig: B6, B7 & B8 exemplifies user interaction for the addition of a DeliveryCar).
(Fig: B6)
(Fig: B7) (Fig: B8)
MS815: Advanced Applications Programming Group Assignment 2014_15
6 | P a g e
In the sub-menu, If the user selects [2] Display Fleet Report: the internal displayFleetReport() method is called which outputs to screen a report containing details on each vehicle in the MyPizza Delivery fleet (see Fig: B9 for typical simple report output).
(Fig: B9)
[4] Exit Application
Finally If the user selects [4] Exit Application: The dataOut() method is called to output all the updated records to the text file (myPizzaData.text) from the collection object(s), before exiting the application.
Note: Develop any supporting / utility methods you feel that you may need to meet the applications requirements. Methods listed are provided to give a structure to the program.
