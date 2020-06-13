package emailapp;

import java.util.Scanner;

public class Emailapp {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter your firstname:");
		String a=in.nextLine();
		System.out.print("Enter your lastname:");
		String b=in.nextLine();
		emailback em1=new emailback(a,b);
		
	}

}
