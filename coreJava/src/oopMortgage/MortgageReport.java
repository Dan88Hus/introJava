package oopMortgage;

import java.text.NumberFormat;

import moshJava.MortgagePaymentSchedule;

public class MortgageReport {

	public static void printPaymentSchedule(int principal, float annualInterest, byte years) {
		System.out.println("PAYMENT SCHEDULE");
		System.out.println("----------------");
		for(short month = 1; month <= years * MortgagePaymentSchedule.MONTHS_IN_YEAR; month++) {
			double balance = MortgageCalculator.calculateBalance();
			System.out.println(NumberFormat.getCurrencyInstance().format(balance));
		}
	}

}
