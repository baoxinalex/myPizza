
public class DelBikes extends DeliveryVehicle {
	static final int annualRunningCost = 200;
	static final int govtIncentive = 100;
	
	public DelBikes()
	{
		super();
	}
	
	public DelBikes(String ID,double miles,int deliveries,int noOfDays)
	{
		super(ID,miles,deliveries,noOfDays);
	}
	
	public String toString(){
		
		return "Delivery Bike ["+getRegistrationID()+"]"+" has been "+getIncrementDaysInService()+" days in service."
		+"Making "+getAddDeliveries()+" deliveries,travelling "+getAddMiles()+" miles.";
		
	}
	@Override
	void calculateEfficiency() {
		// TODO Auto-generated method stub
		
	}

}
