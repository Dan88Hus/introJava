/**
 * 
 */
package moshJava;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * This going to calculate mortgage payment
 */
public class MortgagePaymentSchedule {
	final static byte MONTHS_IN_YEAR = 12;
	final static byte PERCENT = 100;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
		
		float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
		
		byte years = (byte) readNumber("Years: ", 1, 30);
		
		double mortgage = calculateMortgage(principal, annualInterest, years);
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println();
		System.out.println("MORTGAGE");
		System.out.println("--------");
		System.out.println("Monthly Payments: "+ mortgageFormatted);
		
		printPaymentSchedule(principal, annualInterest, years);
		
	}//main

	public static void printPaymentSchedule(int principal, float annualInterest, byte years) {
		System.out.println("PAYMENT SCHEDULE");
		System.out.println("----------------");
		for(short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
			double balance = calculateBalance(principal, annualInterest, years, month);
			System.out.println(NumberFormat.getCurrencyInstance().format(balance));
		}
	}
	
	public static double readNumber(String prompt, double min, double max) {
		Scanner scanner = new Scanner(System.in);
		double value;
		
		while (true){
			System.out.print(prompt);
			value = scanner.nextFloat();
			if (value >= min && value <= max) {
				break;
			} else {
				System.out.println("Enter a value between " +min+" and "+ max);
				System.out.println("Enter a value between " +min+" and "+ max);

				}
		}
		return value;
	}
	
	public static double calculateBalance( 
		int principal,
		float annualInterest,
		byte years,
		short numberOfPaymentsMade
		) {
				
		float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR ;
		float numberOfPayments = (years * MONTHS_IN_YEAR);
		
		double balance = principal
				*(Math.pow(1+ monthlyInterest, numberOfPayments) - Math.pow(1+ monthlyInterest, numberOfPaymentsMade))
				/(Math.pow(1+ monthlyInterest, numberOfPayments)-1);			
				return balance; 
	}
	
	public static double calculateMortgage (int principal, float annualInterest, byte years) {
		
		short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
		float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR ; 
		
		double mortgage = principal 
				* (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
				/ (Math.pow(1 + monthlyInterest , numberOfPayments)-1);
		System.out.println("mortgage: "+ mortgage);
		
		return mortgage;
	}

}//class
 	