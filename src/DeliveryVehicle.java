
public abstract class DeliveryVehicle {
	
	private String registrationID;
	private double addMiles;
	private int addDeliveries;
	private int incrementDaysInService;
	private int annualRunningCost;
	
	public String getRegistrationID() {
		return registrationID;
	}


	public void setRegistrationID(String registrationID) {
		this.registrationID = registrationID;
	}


	public double getAddMiles() {
		return addMiles;
	}


	public void setAddMiles(double addMiles) {
		this.addMiles = addMiles;
	}


	public int getAddDeliveries() {
		return addDeliveries;
	}


	public void setAddDeliveries(int addDeliveries) {
		this.addDeliveries = addDeliveries;
	}


	public int getIncrementDaysInService() {
		return incrementDaysInService;
	}


	public void setIncrementDaysInService(int incrementDaysInService) {
		this.incrementDaysInService = incrementDaysInService;
	}


	public int getAnnualRunningCost() {
		return annualRunningCost;
	}


	public void setAnnualRunningCost(int annualRunningCost) {
		this.annualRunningCost = annualRunningCost;
	}

	public DeliveryVehicle()
	{
		
	}
	public DeliveryVehicle(String ID,double miles,int deliveries,int noOfDays) {
		registrationID = ID;
		addMiles = miles;
		addDeliveries = deliveries;
		incrementDaysInService = noOfDays;
		
	}
	
	
	abstract void calculateEfficiency();

}
