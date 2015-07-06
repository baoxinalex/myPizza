
public class DelCar extends DeliveryVehicle {
	
	static final double[] fuelcost_permile = {0.10,0.115,0.135,0.14,0.16};
	static final int[] roadtax_yearly = {150,250,350,450,500};
	
	private int taxtBand;
	public int getTaxtBand() {
		return taxtBand;
	}

	public void setTaxtBand(int taxtBand) {
		this.taxtBand = taxtBand;
	}
	public DelCar()
	{
	super("na",0,0,0);	
	}
	public DelCar(String ID,double miles,int deliveries,int noOfDays)
	{
		super(ID,miles,deliveries,noOfDays);
	}
	
	public String toString(){
		
		return "Delivery Car ["+getRegistrationID()+"]"+" has been "+getIncrementDaysInService()+" days in service."
				+"Making "+getAddDeliveries()+" deliveries,travelling "+getAddMiles()+" miles.";
	}
	@Override
	void calculateEfficiency() {
		// TODO Auto-generated method stub
		
	}

}
