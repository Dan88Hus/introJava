package coreJava;
import java.lang.*;
import java.util.*;


public class KeybRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a,b,c;
		String name;
		System.out.println("Enter 2 number ");
		a = s.nextInt();
		b = s.nextInt();
		c = a+b;
		System.out.println("Sum is "+c);
		
		System.out.println("May I learn your name?");
		s.nextLine(); //throw away the \n not consumed by nextInt()
		
		name = s.nextLine();
		
		System.out.println("Welcome Mr./Mss. "+name);
		

	}

}
