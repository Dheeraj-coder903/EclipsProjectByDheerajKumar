package org.onejava.code;

public class OneCodeDay4 {

	public static void main(String[] args) {
		OneCodeDay4 day = new OneCodeDay4();
		day.reverse();
		day.fibonaciSeries();
		day.convertStringintoInt();

	}

	public void reverse() {

		String reverseChar = "reverse character";
		char[] array = reverseChar.toCharArray();

		for (int i = array.length - 1; i >= 0; i--) {
//			for (int i = array.length - 1; i <= 0; i--) {

			System.out.println(array[i]);
		}

	}

	public void fibonaciSeries() {

		int a = 0;
		int b = 1;

		for (int i = 0; i <= 10; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;

		}

	}

	public void convertStringintoInt() {

		String a = "122";
		int b = 122;
		int c = Integer.parseInt(a);
		if (b==c) {
			System.out.println("string has changed into iteger");
		}

	}
	
	public static void dayfourMethod(){
		System.out.println(" i am from OneCodeDay4");
		
	}
	

}
