package javaproject;

import java.util.ArrayList;
import java.util.List;

public class SignUp {
	
	String name, email, contact, pass;
	List<SignUp> list = new ArrayList<SignUp>();
	
	public SignUp(String name, String email, String contact, String pass) {
		// TODO Auto-generated constructor
		this.name=name;
		this.email=email;
		this.contact=contact;
		this.pass = pass;
	}
	
	public void adduser()
	{
		SignUp s1 = new SignUp(name, email, contact, pass);
		list.add(s1);
	}
	
	public void display()
	{
		SignUp s2 = new SignUp("Aayush", "abc@gmail.com", "9876543210", "abc");
		SignUp s3 = new SignUp("Shubh", "xyz@gmail.com", "8769651045", "xyz");
		SignUp s4 = new SignUp("Raj", "pqr@gmail.com", "7694651045", "pqr");
		
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		System.out.format("Name:		Email:			Contact:	Password:		\n");
		for (SignUp signUp : list) {
			System.out.format(signUp.name+"\t\t"+signUp.email+"\t\t"+signUp.contact+"\t"+signUp.pass+"\n");
		}
	}
}
