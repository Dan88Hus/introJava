package coreJava;

public class Printing {

	public static void main(String[] args) {
		int x = 10;
		float y = 12.56f;
		char z = 'A';
		
		System.out.printf("Hello %d %f %c World\n", x, y, z);
/*
 *char is for c 
 *int is for d, o, x (decimal, octal, Hexadecimal)
 *float is for f, e, g
 *String is for s
 */
		int a  = 10;
		System.out.printf("15digit write:%15d",a); //13charBosluk10
		System.out.printf("\n15digit write with flag:%015d",a); //000000000000010
		a = -10;
		System.out.printf("\n15digit write with flag:%015d",a);//-00000000000010
		
		float b= 123.45768678678f;
		System.out.printf("\nhere: %6.2f",b);// 123.45
		//6 places with 2 decimal
		
		String str = "Java";
		System.out.printf("\n20str:%20s",str);// right align
		
		System.out.printf("\n-20str:%-20s",str);// left align
		
		
		
		
	}

}
