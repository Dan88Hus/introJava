package oopMortgage;

import moshJava.MortgagePaymentSchedule;

public class MortgageCalculator {
	public MortgageCalculator(int principal, float annualInterest, byte years) {
		super();
		this.principal = principal;
		this.annualInterest = annualInterest;
		this.years = years;
	}

	private int principal;
	private float annualInterest;
	private byte years;
	private short numberOfPaymentsMade;

	/**
	 * @deprecated Use {@link #calculateBalance()} instead
	 */
	public double calculateBalance( 
		int principal,
		float annualInterest,
		byte years,
		short numberOfPaymentsMade
		) {
			return calculateBalance();
		}

	public static double calculateBalance(
		) {
				
		float monthlyInterest = annualInterest / MortgagePaymentSchedule.PERCENT / MortgagePaymentSchedule.MONTHS_IN_YEAR ;
		float numberOfPayments = (years * MortgagePaymentSchedule.MONTHS_IN_YEAR);
		
		double balance = principal
				*(Math.pow(1+ monthlyInterest, numberOfPayments) - Math.pow(1+ monthlyInterest, numberOfPaymentsMade))
				/(Math.pow(1+ monthlyInterest, numberOfPayments)-1);			
				return balance;
	}


	public static double calculateMortgage (int principal, float annualInterest, byte years) {
		
		short numberOfPayments = (short) (years * MortgagePaymentSchedule.MONTHS_IN_YEAR);
		float monthlyInterest = annualInterest / MortgagePaymentSchedule.PERCENT / MortgagePaymentSchedule.MONTHS_IN_YEAR ; 
		
		double mortgage = principal 
				* (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
				/ (Math.pow(1 + monthlyInterest , numberOfPayments)-1);
		System.out.println("mortgage: "+ mortgage);
		
		return mortgage;
	}

}
