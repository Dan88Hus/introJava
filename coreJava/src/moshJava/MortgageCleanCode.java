/**
 * 
 */
package moshJava;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * This going to calculate mortgage payment
 */
public class MortgageCleanCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		int principal = 0;
		float monthlyInterest = 0;
		int numberOfPayments = 0;
		float annualInterest = 0;
		byte years = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Principle: ");
			principal = scanner.nextInt();
			if (principal >= 1000 && principal <= 1_000_000) {
				break;
			} else {
				System.out.println("Enter a valur between 1000 and 1_000_000");
			}
		}
		while (true){
			System.out.println("Annual Interest Rate: ");
			annualInterest = scanner.nextFloat();
			if (annualInterest >= 1 && annualInterest <= 30) {
				break;
			} else {
				System.out.println("Enter a value between 1 and 30 for annual Interest Rate: ");
				}
		}
		
		while (true){
			
			System.out.println("Period(Years): ");
			years = scanner.nextByte();
			if (years >=1 && years <=30 ) {
				break;
			} else {
				System.out.println("Please enter a value between 1 and 30 for years.");
			}
			
		}//while 
		
		double mortgage = calculateMortgage(principal, annualInterest, years);
		
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortgage: "+ mortgageFormatted);
		
	}//main
	
	public static double calculateMortgage (int principal, float annualInterest, byte years) {
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
		
		short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
		float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR ; 
		
		double mortgage = principal 
				* (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
				/ (Math.pow(1 + monthlyInterest , numberOfPayments)-1);
		System.out.println("mortgage: "+ mortgage);
		
		return mortgage;
	}

}//class
 	