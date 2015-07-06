


import java.io.*;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestCollection {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	SortedSet<DeliveryVehicle> fleet =   new TreeSet<DeliveryVehicle>();
	
	DelBikes d = new DelBikes("12G4536",12.36,4,2);
	fleet.add(d);
		// Create an object of type car
		DelCar dc = new DelCar();
		//setters 
		dc.setAddDeliveries(20);
		dc.setAddMiles(2000);
		File f = new File("C:\\Users\\HIMA SAGAR REDDY\\Desktop\\data.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		while(br.readLine()!=null)
			System.out.println(br.readLine());
		
		
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of deliveries made by car");
		
		bw.write("del car delivered "+s.nextInt()+"and travelled"+dc.getAddMiles()+"miles");
		bw.write("del car delivered "+dc.getAddDeliveries()+"and travelled"+dc.getAddMiles()+"miles");
		
		System.out.println("Number of deliveries are "+dc.getAddDeliveries()+" Number of miles are "+dc.getAddMiles());
		
		br.close();
		s.close();
		bw.flush();
		bw.close();

		
		
		
		
		
	}

}
