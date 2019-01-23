import java.util.Scanner;
import java.util.regex.*;

public class Lab7 {
	
	public static void main(String[] ags) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please Enter Your Name ");
		
		String name = scnr.nextLine();
		boolean e;
		e = validateName(name);
		System.out.println(e);
		
		System.out.println("Now Enter Your Email Address");
		String email = scnr.nextLine();
		boolean cmail;
		cmail = isValidEmailAddress(email);
		System.out.println(cmail);
		
		System.out.println("What about your phone number?");
		String phone = scnr.nextLine();
		boolean num;
		num = validatePhoneNumbers(phone);
		System.out.println(phone);
		
		System.out.println("Almost done! Please enter the date");
		String date = scnr.nextLine();
		boolean year;
		year = validateDate(date);
		System.out.println(date);
		
		
		
	}
		
	public static boolean validateName(String txt) {
			String regex = "[A-Z][a-z]+{1,30}";
			 return txt.matches(regex);
			 
			 }
	
	public static boolean isValidEmailAddress(String email) {
		String regex = "([a-z]*[0-9]*{5,30})@([a-z]*[0-9]*{5,10})\\.([a-z]*[0-9]*{2,3})";
		return email.matches(regex);
		
		
	}
	
	public static boolean validatePhoneNumbers(String phone) {
		String regex = "[0-9]*{3}[0-9]*{3}[0-9]*{4}]";
		return phone.matches(regex);
		
	}
	
	public static boolean validateDate(String date) {
		String regex = "[0-9]*{2}[0-9]*{2}[0-9]*{4}]";
		return date.matches(regex);
	}
}