package coreJava;

public class Regularexpression {

	public static void main(String[] args) {
/*
 * . 		any character (single symbol)
 * [abc]	exactly given letters
 * [^abc]	except abc
 */
		String str1 = "f";
		System.out.println(". matches: "+str1.matches("."));//true
		
	}

}
