/**
 * 
 */
package moshJava;
import java.text.NumberFormat;

import oopMortgage.Console;
import oopMortgage.MortgageCalculator;
import oopMortgage.MortgageReport;

/**
 * This going to calculate mortgage payment
 */
public class MortgagePaymentSchedule {
	public final static byte MONTHS_IN_YEAR = 12;
	public final static byte PERCENT = 100;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
		
		float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
		
		byte years = (byte) Console.readNumber("Years: ", 1, 30);
		
		printMortgage(principal, annualInterest, years);
		
		MortgageReport.printPaymentSchedule(principal, annualInterest, years);
		
	}//main

	public static void printMortgage(int principal, float annualInterest, byte years) {
		
		double mortgage = MortgageCalculator.calculateMortgage();
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println();
		System.out.println("MORTGAGE");
		System.out.println("--------");
		System.out.println("Monthly Payments: "+ mortgageFormatted);
	}

	/**
	 * @deprecated Use {@link MortgageReport#printPaymentSchedule(int,float,byte)} instead
	 */
	public static void printPaymentSchedule(int principal, float annualInterest, byte years) {
		MortgageReport.printPaymentSchedule(principal, annualInterest, years);
	}
	
	/**
	 * @deprecated Use {@link Console#readNumber(String,double,double)} instead
	 */
	public static double readNumber(String prompt, double min, double max) {
		return Console.readNumber(prompt, min, max);
	}
	
	/**
	 * @deprecated Use {@link MortgageCalculator#calculateBalance()} instead
	 */
	public static double calculateBalance( 
		int principal,
		float annualInterest,
		byte years,
		short numberOfPaymentsMade
		) {
			return MortgageCalculator.calculateBalance();
		}
	
	/**
	 * @deprecated Use {@link MortgageCalculator#calculateMortgage()} instead
	 */
	public static double calculateMortgage (int principal, float annualInterest, byte years) {
		return MortgageCalculator.calculateMortgage(principal, annualInterest, years);
	}

}//class
 	