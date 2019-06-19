import java.util.Scanner;
import java.text.NumberFormat;
public class AdGenerator {

	
	/*Prompt the user for their first name, middle name, last name, 
	 * job title, 10 digit phone number, and hourly rate. Use a Scanner 
	 * to read the values from System.in and store the input in appropriate 
	 * variables. Here is a sample session (green is the input typed by the 
	 * user).
	 */

	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
	System.out.println("Welcome to AdGenerator!\nPlease enter your profile information.");
	System.out.println("======================================");
	System.out.print("First name: ");
	String firstName = reader.nextLine();
	
	System.out.print("Middle name: ");
	String middleName = reader.nextLine();
	System.out.print("Last name: ");
	String lastName = reader.nextLine();
	System.out.print("Job title: ");
	String jobTitle = reader.nextLine();
	System.out.print("Phone number (10 digit): ");
	String phoneNumber = reader.nextLine();
	System.out.print("Hourly rate: ");
	double hourlyRate = reader.nextDouble();
	
	//first initial of middle name
	char firstInitial = middleName.charAt(0);
	//contains the area code of the phone number
	String areaCode ="(" + phoneNumber.substring(0,3) + ")";
	//contains the local phone number
	String formattedNumber = " " + phoneNumber.substring(3,6)+"-"+phoneNumber.substring(6,10);
	
	NumberFormat currencyFmt = NumberFormat.getCurrencyInstance();
;
	//prints out the ad.
	System.out.println("============================");
	System.out.println("Need a " + jobTitle + "?");
	System.out.println("CALL NOW! " + areaCode + formattedNumber );
	
	System.out.println("Ask for " + firstName + " " + firstInitial + ". " + lastName);
	System.out.println("(Rates start at " + currencyFmt.format(hourlyRate) + "/hr)");
	System.out.println("============================");
	
	reader.close();
	}
	
	
	
	
	
}
