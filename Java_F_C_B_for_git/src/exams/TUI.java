package exams;

import java.util.Scanner;

public class TUI {

	private String first_name, family_name, code;


	String enterFirstname(){
		Scanner scname = new Scanner(System.in);
		first_name = scname.next();
		return first_name;

	}
	String enterFamilyname(){
		Scanner scname = new Scanner(System.in);
		family_name = scname.next();
		return family_name;

	}
	String enterCode(){
		Scanner scname = new Scanner(System.in);
		code = scname.next();
		return code;

	}	
}