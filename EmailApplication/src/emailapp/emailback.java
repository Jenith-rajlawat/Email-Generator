package emailapp;

import java.util.Scanner;

public class emailback {
private String firstname;
private String lastname;
private String password;
private String department;
private int mailboxCapacity;
private int no=10;
private String alternateEmail;


//Constructor to receive the first name and the last name
public emailback(String firstname,String lastname)
{int ran=(int)(Math.random()*500);
	this.firstname=firstname;
this.lastname=lastname;
System.out.print("Welcome "+this.firstname+" "+this.lastname);
this.department=setDepartment();
System.out.println("Department:"+this.department);
String c=this.lastname.toLowerCase();
String b=this.firstname.toLowerCase();
System.out.println("Email:"+b+""+c+""+ran+"@gmail.com");
this.password=setPassword(this.no);
System.out.println("Password:"+this.password);
System.out.println("Department:"+this.department);
}


private String setDepartment()
{
	System.out.print("Choose your Department-\n1)Sales\n2)Development\n3)Acconting\n4)None\nEnter the Department code: ");
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	if(a==1) {
		return "Sales";
	}
	else if(a==2) {
		return "Development";
	}
	else if(a==3)
	{
		return "Accounting";
	}
	else if(a==4)
	{
		return "None";
	}
	else
	{
		return "Null";
	}
	
	
}
public String setPassword(int l){
	String passwordset= "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#!";
	char[] pass=new char[l];
	for(int i=0;i<l;i++) {
	int rand=(int)(Math.random()*passwordset.length());
	pass[i]=passwordset.charAt(rand);
	
	}
	return new String(pass);
	
	
}



}	


