import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

/*
 * This class is used to store the all the vehicles (fleet) of MyPizza Company
 */
public class MyPizzaFleet {
	
	//treeset to store myPizza vehicle information
	  private static SortedSet<DeliveryVehicle> fleet =  new TreeSet<DeliveryVehicle>();
	  private static String fleetfile;
	  private static String message = "";

	public static SortedSet<DeliveryVehicle> getFleet() {
		return fleet;
	}

	public static void setFleet(SortedSet<DeliveryVehicle> fleet) {
		MyPizzaFleet.fleet = fleet;
	}
	  
	static {
        // get currency directory
		fleetfile = System.getProperty("user.dir") +
                "/fleet.ser";
    }
	  
	public static void addVehicle() {
		//if choice is 3
		String regid="S111";
		int b=2;
		DeliveryVehicle d = new DelCar();
		d.setRegistrationID(regid);
	//	d.setTaxtBand(b);
		//add to the collection
		fleet.add(d);
		saveToDisk();		
		
    }
	
	public static void displayFleetReport()
	{
		loadFromDisk();
		for(DeliveryVehicle dv:fleet)
			System.out.println(dv);
	}
	public static boolean saveToDisk() {
        // create file and save to disk
        try {
            FileOutputStream fs = new FileOutputStream(fleetfile);
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(fleet);
            os.close();
            fs.close();
             return true;
        } catch (Exception ex) {
            message = ex.getMessage();
            return false;
        }

    }

    public static boolean loadFromDisk() {
        // read words from serialized treeSet
        try {
            FileInputStream fs = new FileInputStream(fleetfile);
            ObjectInputStream is = new ObjectInputStream(fs);
            // Doubt in the conversion of specific objects like car,bike to vehicle
            fleet = (TreeSet<DeliveryVehicle>) is.readObject();
            is.close();
            fs.close();
           
            return true;
        } catch (Exception ex) {
            message = ex.getMessage();
            return false;
        }

    }

}
