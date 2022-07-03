package javaproject;

public class User {
	
	public void checkAvailabilitySeater(int seats)
	{
		int arr[] = new int [20];
		if(seats>arr.length)
		{
			System.out.println("Requested number of seats not available!");
		}
		else
		{
			System.out.println("Cost per seat: Rs.100");
			System.out.println("Total number of seats: "+seats);
			System.out.println("Total Cost: "+(seats*100));
			System.out.println("Seats booked sucessfully!");
		}
	}
	
	public void checkAvailabilitySleeper(int seats)
	{
		int arr[] = new int [15];
		if(seats>arr.length)
		{
			System.out.println("Requested number of seats not available!");
		}
		else
		{
			System.out.println("Cost per seat: Rs.250");
			System.out.println("Total number of seats: "+seats);
			System.out.println("Total Cost: "+(seats*250));
			System.out.println("Seats booked sucessfully!");
		}
	}
}
