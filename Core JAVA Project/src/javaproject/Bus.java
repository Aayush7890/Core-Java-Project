package javaproject;

import java.util.ArrayList;
import java.util.List;

public class Bus {
	
	String bus_name, source, destination, bus_type;
	List<Bus> list = new ArrayList<Bus>();
	
	public Bus(String bus_name, String source, String destination, String bus_type) {
		
		this.bus_name=bus_name;
		this.source=source;
		this.destination=destination;
		this.bus_type=bus_type;
	}
	
	public void addbus()
	{
		Bus b11 = new Bus(bus_name, source, destination, bus_type);
		list.add(b11);
	}
	
	public void bus_details()
	{
		Bus b1 = new Bus("Volvo", "Ahmedabad", "Vadodara", "AC Seater");
		Bus b2 = new Bus("Government", "Mumbai", "Pune", "Seater");
		Bus b3 = new Bus("Royal", "Delhi", "Banaras", "AC Seater");
		Bus b4 = new Bus("Volvo", "Ahmedabad", "Banaras", "AC Sleeper");
		Bus b5 = new Bus("Government", "Delhi", "Jaipur", "Sleeper");
		Bus b6 = new Bus("Royal", "Mumbai", "Bhopal", "AC Sleeper");
		Bus b7 = new Bus("Chartered", "Jaipur", "Bhopal", "Seater");
		Bus b8 = new Bus("Chartered", "Noida", "Chandigarh", "Sleeper");
		Bus b9 = new Bus("Falcon", "Pune", "Vadodara", "AC Seater");
		Bus b10 = new Bus("Falcon", "Bhopal", "Chandigarh", "AC Sleeper");
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		list.add(b6);
		list.add(b7);
		list.add(b8);
		list.add(b9);
		list.add(b10);
		
		System.out.format("Bus Name:		Source:			Destination:	Bus Type:		\n");
		for (Bus bus : list) {
			System.out.format(bus.bus_name+"\t\t"+bus.source+"\t\t"+bus.destination+"\t"+bus.bus_type+"\n");
		}
	}
}
