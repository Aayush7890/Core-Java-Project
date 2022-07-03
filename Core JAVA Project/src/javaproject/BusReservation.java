package javaproject;

import java.util.Scanner;

public class BusReservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		char ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("******************BUS RESERVATION SYSTEM*******************");
		do {
			System.out.println("1. Admin Section");
			System.out.println("2. User Section");
			System.out.println("Enter the section you want to enter!");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1: System.out.println("You have entered the Admin Section!");
				int cho;
				System.out.println("1. View Existing Users");
				System.out.println("2. View Bus Details");
				System.out.println("3. Add Bus info");
				System.out.println("Enter your choice to perform relevant operation");
				cho=sc.nextInt();
				switch(cho)
				{
				case 1: 
					String n=null, e=null, c=null, p=null;
					SignUp su = new SignUp(n, e, c, p);
					su.display();
					break;
				case 2:
					String bn=null, s=null, d=null, bt=null;
					Bus b = new Bus(bn, s, d, bt);
					b.bus_details();
					break;
				case 3:
					System.out.println("Enter bus name: ");
					String bu=sc.next();
					System.out.println("Enter source: ");
					String so=sc.next();
					System.out.println("Enter destination: ");
					String de=sc.next();
					System.out.println("Enter bus type: ");
					String ty=sc.next();
					Bus bd = new Bus(bu, so, de, ty);
					bd.addbus();
					System.out.println("Bus details added successfully!");
					break;
				}
				break;
			case 2: System.out.println("You have entered the User Section!");
				int choice;
				System.out.println("1. Sign Up");
				System.out.println("2. Check Bus Availablity");
				System.out.println("Enter your choice to perform relevant operation");
				choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Kindly Sign Up to proceed further!");
					System.out.println("Enter your name: ");
					String na=sc.next();
					System.out.println("Enter your email: ");
					String em=sc.next();
					System.out.println("Enter your contact number: ");
					String co=sc.next();
					System.out.println("Set your password: ");
					String pa=sc.next();
					SignUp sp = new SignUp(na, em, co, pa);
					sp.adduser();
					System.out.println("Congratulations! you are successfully signed in.");
					break;
				case 2:
					int choic;
					int seats;
					User u = new User();
					System.out.println("Kindly select the type of bus you prefer: ");
					System.out.println("1. Sleeper");
					System.out.println("2. Seater");
					choic=sc.nextInt();
					switch (choic)
					{
					case 1:
						System.out.println("Enter number of seats you want to book: ");
						seats=sc.nextInt();
						u.checkAvailabilitySleeper(seats);
						break;
					case 2:
						System.out.println("Enter number of seats you want to book: ");
						seats=sc.nextInt();
						u.checkAvailabilitySeater(seats);
					}
				}
				
			default: System.out.println(ch==1);
			}
			
			System.out.println("Do you want to continue? ");
			ans = sc.next().charAt(0);
		}
		while(ans=='y' || ans=='Y');
		if(ans!='y' || ans!='Y')
			System.out.println("Hope you enjoyed the service!");
	}
}
