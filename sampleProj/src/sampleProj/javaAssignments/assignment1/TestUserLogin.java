package sampleProj.javaAssignments.assignment1;

import java.util.Scanner;

public class TestUserLogin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sp=" ";
		System.out.println("Enter the Username");
		String uname = sc.nextLine();
		if((uname.contains(sp)) || uname.length()<4){
			System.out.println("Invalid Username! minimum length 4 required");
			return;
		}

		System.out.println("Enter the Password");
		String upass = sc.nextLine();
		if((upass.contains(sp)) || upass.length()<6){
			System.out.println("Invalid Password! minimum length 6 required");
			return;
		}

		System.out.println(uname+" you are Registered Successfully");
		for (int attempt = 0; attempt < 3; attempt++) {
			System.out.println("Enter the Username");
			String lname = sc.nextLine();
			System.out.println("Enter the Password");
			String lpass = sc.nextLine();
			if(uname.equals(lname) && upass.equals(lpass)){
				System.out.println("Welcome "+lname+" you have Logged-in Successfully");
				break;
			}
			else{
				if(attempt == 2) {
					System.out.println("Contact Admin");
					break;
				}
				System.out.println("Username or password Mismatch");
			}

		}
	}

}
